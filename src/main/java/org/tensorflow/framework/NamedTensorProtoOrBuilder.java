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
// source: named_tensor.proto

package org.tensorflow.framework;

public interface NamedTensorProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.NamedTensorProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the tensor.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the tensor.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The client can populate a TensorProto using a tensorflow::Tensor`, or
   * directly using the protobuf field accessors.
   * The client specifies whether the returned tensor values should be
   * filled tensor fields (float_val, int_val, etc.) or encoded in a
   * compact form in tensor.tensor_content.
   * </pre>
   *
   * <code>.tensorflow.TensorProto tensor = 2;</code>
   */
  boolean hasTensor();
  /**
   * <pre>
   * The client can populate a TensorProto using a tensorflow::Tensor`, or
   * directly using the protobuf field accessors.
   * The client specifies whether the returned tensor values should be
   * filled tensor fields (float_val, int_val, etc.) or encoded in a
   * compact form in tensor.tensor_content.
   * </pre>
   *
   * <code>.tensorflow.TensorProto tensor = 2;</code>
   */
  org.tensorflow.framework.TensorProto getTensor();
  /**
   * <pre>
   * The client can populate a TensorProto using a tensorflow::Tensor`, or
   * directly using the protobuf field accessors.
   * The client specifies whether the returned tensor values should be
   * filled tensor fields (float_val, int_val, etc.) or encoded in a
   * compact form in tensor.tensor_content.
   * </pre>
   *
   * <code>.tensorflow.TensorProto tensor = 2;</code>
   */
  org.tensorflow.framework.TensorProtoOrBuilder getTensorOrBuilder();
}