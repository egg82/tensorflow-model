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

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: log_memory.proto

package org.tensorflow.framework;

public interface MemoryLogTensorOutputOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.MemoryLogTensorOutput)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Process-unique step id.
   * </pre>
   *
   * <code>int64 step_id = 1;</code>
   */
  long getStepId();

  /**
   * <pre>
   * Name of the kernel producing an output as set in GraphDef, e.g.,
   * "affine2/weights/Assign".
   * </pre>
   *
   * <code>string kernel_name = 2;</code>
   */
  java.lang.String getKernelName();
  /**
   * <pre>
   * Name of the kernel producing an output as set in GraphDef, e.g.,
   * "affine2/weights/Assign".
   * </pre>
   *
   * <code>string kernel_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getKernelNameBytes();

  /**
   * <pre>
   * Index of the output being set.
   * </pre>
   *
   * <code>int32 index = 3;</code>
   */
  int getIndex();

  /**
   * <pre>
   * Output tensor details.
   * </pre>
   *
   * <code>.tensorflow.TensorDescription tensor = 4;</code>
   */
  boolean hasTensor();
  /**
   * <pre>
   * Output tensor details.
   * </pre>
   *
   * <code>.tensorflow.TensorDescription tensor = 4;</code>
   */
  org.tensorflow.framework.TensorDescription getTensor();
  /**
   * <pre>
   * Output tensor details.
   * </pre>
   *
   * <code>.tensorflow.TensorDescription tensor = 4;</code>
   */
  org.tensorflow.framework.TensorDescriptionOrBuilder getTensorOrBuilder();
}
