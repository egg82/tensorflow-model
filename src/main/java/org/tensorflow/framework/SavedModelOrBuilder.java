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
// source: saved_model.proto

package org.tensorflow.framework;

public interface SavedModelOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.SavedModel)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The schema version of the SavedModel instance. Used for versioning when
   * making future changes to the specification/implementation. Initial value
   * at release will be 1.
   * </pre>
   *
   * <code>int64 saved_model_schema_version = 1;</code>
   */
  long getSavedModelSchemaVersion();

  /**
   * <pre>
   * One or more MetaGraphs.
   * </pre>
   *
   * <code>repeated .tensorflow.MetaGraphDef meta_graphs = 2;</code>
   */
  java.util.List<org.tensorflow.framework.MetaGraphDef> 
      getMetaGraphsList();
  /**
   * <pre>
   * One or more MetaGraphs.
   * </pre>
   *
   * <code>repeated .tensorflow.MetaGraphDef meta_graphs = 2;</code>
   */
  org.tensorflow.framework.MetaGraphDef getMetaGraphs(int index);
  /**
   * <pre>
   * One or more MetaGraphs.
   * </pre>
   *
   * <code>repeated .tensorflow.MetaGraphDef meta_graphs = 2;</code>
   */
  int getMetaGraphsCount();
  /**
   * <pre>
   * One or more MetaGraphs.
   * </pre>
   *
   * <code>repeated .tensorflow.MetaGraphDef meta_graphs = 2;</code>
   */
  java.util.List<? extends org.tensorflow.framework.MetaGraphDefOrBuilder> 
      getMetaGraphsOrBuilderList();
  /**
   * <pre>
   * One or more MetaGraphs.
   * </pre>
   *
   * <code>repeated .tensorflow.MetaGraphDef meta_graphs = 2;</code>
   */
  org.tensorflow.framework.MetaGraphDefOrBuilder getMetaGraphsOrBuilder(
      int index);
}
