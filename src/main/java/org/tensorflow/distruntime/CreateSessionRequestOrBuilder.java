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
// source: master.proto

package org.tensorflow.distruntime;

public interface CreateSessionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.CreateSessionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The initial graph definition.
   * </pre>
   *
   * <code>.tensorflow.GraphDef graph_def = 1;</code>
   */
  boolean hasGraphDef();
  /**
   * <pre>
   * The initial graph definition.
   * </pre>
   *
   * <code>.tensorflow.GraphDef graph_def = 1;</code>
   */
  org.tensorflow.framework.GraphDef getGraphDef();
  /**
   * <pre>
   * The initial graph definition.
   * </pre>
   *
   * <code>.tensorflow.GraphDef graph_def = 1;</code>
   */
  org.tensorflow.framework.GraphDefOrBuilder getGraphDefOrBuilder();

  /**
   * <pre>
   * Configuration options.
   * </pre>
   *
   * <code>.tensorflow.ConfigProto config = 2;</code>
   */
  boolean hasConfig();
  /**
   * <pre>
   * Configuration options.
   * </pre>
   *
   * <code>.tensorflow.ConfigProto config = 2;</code>
   */
  org.tensorflow.framework.ConfigProto getConfig();
  /**
   * <pre>
   * Configuration options.
   * </pre>
   *
   * <code>.tensorflow.ConfigProto config = 2;</code>
   */
  org.tensorflow.framework.ConfigProtoOrBuilder getConfigOrBuilder();

  /**
   * <pre>
   * The target string used from the client's perspective.
   * </pre>
   *
   * <code>string target = 3;</code>
   */
  java.lang.String getTarget();
  /**
   * <pre>
   * The target string used from the client's perspective.
   * </pre>
   *
   * <code>string target = 3;</code>
   */
  com.google.protobuf.ByteString
      getTargetBytes();
}
