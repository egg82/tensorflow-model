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
// source: tensor_bundle.proto

package org.tensorflow.util;

public interface BundleEntryProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.BundleEntryProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The tensor dtype and shape.
   * </pre>
   *
   * <code>.tensorflow.DataType dtype = 1;</code>
   */
  int getDtypeValue();
  /**
   * <pre>
   * The tensor dtype and shape.
   * </pre>
   *
   * <code>.tensorflow.DataType dtype = 1;</code>
   */
  org.tensorflow.framework.DataType getDtype();

  /**
   * <code>.tensorflow.TensorShapeProto shape = 2;</code>
   */
  boolean hasShape();
  /**
   * <code>.tensorflow.TensorShapeProto shape = 2;</code>
   */
  org.tensorflow.framework.TensorShapeProto getShape();
  /**
   * <code>.tensorflow.TensorShapeProto shape = 2;</code>
   */
  org.tensorflow.framework.TensorShapeProtoOrBuilder getShapeOrBuilder();

  /**
   * <pre>
   * The binary content of the tensor lies in:
   *   File "shard_id": bytes [offset, offset + size).
   * </pre>
   *
   * <code>int32 shard_id = 3;</code>
   */
  int getShardId();

  /**
   * <code>int64 offset = 4;</code>
   */
  long getOffset();

  /**
   * <code>int64 size = 5;</code>
   */
  long getSize();

  /**
   * <pre>
   * The CRC32C checksum of the tensor bytes.
   * </pre>
   *
   * <code>fixed32 crc32c = 6;</code>
   */
  int getCrc32C();

  /**
   * <pre>
   * Iff present, this entry represents a partitioned tensor.  The previous
   * fields are interpreted as follows:
   *   "dtype", "shape": describe the full tensor.
   *   "shard_id", "offset", "size", "crc32c": all IGNORED.
   *      These information for each slice can be looked up in their own
   *      BundleEntryProto, keyed by each "slice_name".
   * </pre>
   *
   * <code>repeated .tensorflow.TensorSliceProto slices = 7;</code>
   */
  java.util.List<org.tensorflow.framework.TensorSliceProto> 
      getSlicesList();
  /**
   * <pre>
   * Iff present, this entry represents a partitioned tensor.  The previous
   * fields are interpreted as follows:
   *   "dtype", "shape": describe the full tensor.
   *   "shard_id", "offset", "size", "crc32c": all IGNORED.
   *      These information for each slice can be looked up in their own
   *      BundleEntryProto, keyed by each "slice_name".
   * </pre>
   *
   * <code>repeated .tensorflow.TensorSliceProto slices = 7;</code>
   */
  org.tensorflow.framework.TensorSliceProto getSlices(int index);
  /**
   * <pre>
   * Iff present, this entry represents a partitioned tensor.  The previous
   * fields are interpreted as follows:
   *   "dtype", "shape": describe the full tensor.
   *   "shard_id", "offset", "size", "crc32c": all IGNORED.
   *      These information for each slice can be looked up in their own
   *      BundleEntryProto, keyed by each "slice_name".
   * </pre>
   *
   * <code>repeated .tensorflow.TensorSliceProto slices = 7;</code>
   */
  int getSlicesCount();
  /**
   * <pre>
   * Iff present, this entry represents a partitioned tensor.  The previous
   * fields are interpreted as follows:
   *   "dtype", "shape": describe the full tensor.
   *   "shard_id", "offset", "size", "crc32c": all IGNORED.
   *      These information for each slice can be looked up in their own
   *      BundleEntryProto, keyed by each "slice_name".
   * </pre>
   *
   * <code>repeated .tensorflow.TensorSliceProto slices = 7;</code>
   */
  java.util.List<? extends org.tensorflow.framework.TensorSliceProtoOrBuilder> 
      getSlicesOrBuilderList();
  /**
   * <pre>
   * Iff present, this entry represents a partitioned tensor.  The previous
   * fields are interpreted as follows:
   *   "dtype", "shape": describe the full tensor.
   *   "shard_id", "offset", "size", "crc32c": all IGNORED.
   *      These information for each slice can be looked up in their own
   *      BundleEntryProto, keyed by each "slice_name".
   * </pre>
   *
   * <code>repeated .tensorflow.TensorSliceProto slices = 7;</code>
   */
  org.tensorflow.framework.TensorSliceProtoOrBuilder getSlicesOrBuilder(
      int index);
}