/*
 * Copyright (c) 2019 by Andrew Charneski.
 *
 * The author licenses this file to you under the
 * Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance
 * with the License.  You may obtain a copy
 * of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.simiacryptus.tensorflow;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.common.primitives.Floats;
import com.simiacryptus.util.Util;
import org.apache.commons.io.IOUtils;
import org.tensorflow.Graph;
import org.tensorflow.Operation;
import org.tensorflow.Output;
import org.tensorflow.Tensor;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.URI;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.zip.ZipFile;

public class TestUtil {
  protected static byte[] editGraph(byte[] protobufBinaryData, Consumer<Graph> operator) {
    byte[] newGraphDef;
    try (Graph graph = new Graph()) {
      graph.importGraphDef(protobufBinaryData);
      operator.accept(graph);
      newGraphDef = graph.toGraphDef();
    }
    return newGraphDef;
  }

  public static Operation find(Graph graph, String name) {
    Iterator<Operation> operations = graph.operations();
    while(operations.hasNext()) {
      Operation operation = operations.next();
      if(operation.name().equals(name)) {
        return operation;
      }
    }
    return null;
  }

  public static byte[] loadZipUrl(String uri, String file) throws Exception {
    try (ZipFile zipFile = new ZipFile(Util.cacheFile(new URI(uri)))) {
      return IOUtils.toByteArray(zipFile.getInputStream(zipFile.getEntry(file)));
    }
  }

  public static String toJson(Object output) throws JsonProcessingException {
    return new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT).writeValueAsString(output);
  }

  public static double[] getFloatValues(Tensor<Float> result) {
    final long[] shape = result.shape();
    long length = Arrays.stream(shape).reduce((a, b) -> a * b).getAsLong();
    if (shape.length == 1) {
      return Floats.asList(result.copyTo(new float[(int) length])).stream().mapToDouble(x -> x).toArray();
    } else if (shape.length == 2) {
      float[][] floats = result.copyTo(IntStream.range(0, (int) shape[0]).mapToObj(i -> new float[(int) shape[1]]).toArray(s -> new float[s][]));
      return Arrays.stream(floats).flatMapToDouble(x -> Floats.asList(x).stream().mapToDouble(f -> (double) (float) f)).toArray();
    } else {
      throw new RuntimeException(Arrays.toString(shape));
    }
  }

  public static String describeGraph(Graph graph) {
    OutputStream stringOutputStream = new ByteArrayOutputStream();
    try (PrintStream outputStream = new PrintStream(stringOutputStream)) {
      for (Iterator<Operation> iter = graph.operations(); iter.hasNext(); ) {
        Operation operation = iter.next();
        outputStream.println(String.format("Operation %s (type %s) with %s outputs", operation.name(), operation.type(), operation.numOutputs()));
        for (int i = 0; i < operation.numOutputs(); i++) {
          Output<Object> output = operation.output(i);
          outputStream.println(String.format("  Output %s (type %s, shape %s)", i, output.dataType().name(), output.shape().toString()));
        }
      }
    }
    return stringOutputStream.toString();
  }
}
