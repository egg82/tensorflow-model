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

import com.simiacryptus.notebook.MarkdownNotebookOutput;
import com.simiacryptus.util.test.SysOutInterceptor;
import org.apache.commons.io.IOUtils;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Test;
import org.tensorflow.Graph;
import org.tensorflow.Output;

import javax.imageio.ImageIO;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static com.simiacryptus.tensorflow.TestUtil.find;

public class InceptionTest {

  static {
    SysOutInterceptor.INSTANCE.init();
  }

  @Test
  public void testClassification() throws Exception {
    File reportFile = new File("target/out/" + new SimpleDateFormat("yyyyMMddHHmm").format(new Date()));
    MarkdownNotebookOutput log = new MarkdownNotebookOutput(reportFile, true);
    InceptionClassifier classifier = new InceptionClassifier();
    String logDir = classifier.eventWriterLocation.getAbsolutePath();
    try {
      CloseableHttpClient client = HttpClientBuilder.create().build();
      for (String keyword : Arrays.asList("dog", "cat", "ship", "city")) {
        log.h1("Image Category: " + keyword);
        byte[] bytes = IOUtils.toByteArray(client.execute(new HttpGet("https://loremflickr.com/320/240/" + keyword)).getEntity().getContent());
        log.p(log.jpg(ImageIO.read(new ByteArrayInputStream(bytes)), "Random Image"));
        log.run(() -> {
          double[] predictions = classifier.predictImgBytes(bytes);
          int[] topValues = IntStream.range(0, predictions.length).mapToObj(x -> x).sorted(Comparator.comparing(i -> -predictions[i])).limit(5).mapToInt(i -> i).toArray();
          for (int index : topValues) {
            System.out.println(String.format("%s = %.3f%%", classifier.labels.get(index), predictions[index] * 100.0));
          }
        });
      }
    } finally {
      log.close();
      classifier.close();
    }

    for (File file : TestUtil.allFiles(new File(logDir))) {
      TestUtil.dumpEvents(file.getAbsolutePath());
    }

    TestUtil.launchTensorboard(logDir, tensorboard-> {
      try {
        tensorboard.waitFor(1, TimeUnit.MINUTES);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    });
  }

  @Test
  public void dumpModelJson() throws Exception {
    byte[] protobufBinaryData = loadGraphDef();
    GraphModel model = new GraphModel(protobufBinaryData);
    System.out.println("Model: " + TestUtil.toJson(model));
    try (Graph graph = new Graph()) {
      graph.importGraphDef(model.graphDef.toByteArray());
      System.out.println(TestUtil.describeGraph(graph));
    }
  }

  @Test
  public void testGradient() throws Exception {
    byte[] originalGraphDef = loadGraphDef();
    byte[] newGraphDef = TestUtil.editGraph(originalGraphDef, graph -> {
      graph.addGradients("gradient_", new Output[]{
          find(graph, "mixed4b_1x1_pre_relu/conv").output(0)
      }, new Output[]{
          find(graph, "mixed4a").output(0),
          find(graph, "mixed4b_1x1_w").output(0)
      }, null);
    });
    GraphModel model = new GraphModel(newGraphDef);
    System.out.println("Model: " + TestUtil.toJson(model));
  }

  @Test
  public void testFullGradient() throws Exception {
    try {
      byte[] originalGraphDef = loadGraphDef();
      byte[] newGraphDef = TestUtil.editGraph(originalGraphDef, graph -> {
        graph.addGradients("gradient", new Output[]{
            find(graph, "output").output(0)
        }, new Output[]{
            find(graph, "input").output(0)
        }, null);
      });
      GraphModel model = new GraphModel(newGraphDef);
      System.out.println("Model: " + TestUtil.toJson(model));
    } catch (org.tensorflow.TensorFlowException e) {
      e.printStackTrace(System.err);
    }
  }

  protected byte[] loadGraphDef() throws Exception {
    return TestUtil.loadZipUrl(
        "https://storage.googleapis.com/download.tensorflow.org/models/inception5h.zip",
        "tensorflow_inception_graph.pb"
    );
  }


}


