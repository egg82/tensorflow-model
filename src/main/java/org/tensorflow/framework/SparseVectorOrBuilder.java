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
// source: boosted_trees.proto

package org.tensorflow.framework;

public interface SparseVectorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.boosted_trees.SparseVector)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated int32 index = 1;</code>
   */
  java.util.List<java.lang.Integer> getIndexList();
  /**
   * <code>repeated int32 index = 1;</code>
   */
  int getIndexCount();
  /**
   * <code>repeated int32 index = 1;</code>
   */
  int getIndex(int index);

  /**
   * <code>repeated float value = 2;</code>
   */
  java.util.List<java.lang.Float> getValueList();
  /**
   * <code>repeated float value = 2;</code>
   */
  int getValueCount();
  /**
   * <code>repeated float value = 2;</code>
   */
  float getValue(int index);
}
