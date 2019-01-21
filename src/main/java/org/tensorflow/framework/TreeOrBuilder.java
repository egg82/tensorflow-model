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

public interface TreeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.boosted_trees.Tree)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .tensorflow.boosted_trees.Node nodes = 1;</code>
   */
  java.util.List<org.tensorflow.framework.Node> 
      getNodesList();
  /**
   * <code>repeated .tensorflow.boosted_trees.Node nodes = 1;</code>
   */
  org.tensorflow.framework.Node getNodes(int index);
  /**
   * <code>repeated .tensorflow.boosted_trees.Node nodes = 1;</code>
   */
  int getNodesCount();
  /**
   * <code>repeated .tensorflow.boosted_trees.Node nodes = 1;</code>
   */
  java.util.List<? extends org.tensorflow.framework.NodeOrBuilder> 
      getNodesOrBuilderList();
  /**
   * <code>repeated .tensorflow.boosted_trees.Node nodes = 1;</code>
   */
  org.tensorflow.framework.NodeOrBuilder getNodesOrBuilder(
      int index);
}
