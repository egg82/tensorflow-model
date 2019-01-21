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
// source: example_parser_configuration.proto

package org.tensorflow.example;

public interface ExampleParserConfigurationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.ExampleParserConfiguration)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;string, .tensorflow.FeatureConfiguration&gt; feature_map = 1;</code>
   */
  int getFeatureMapCount();
  /**
   * <code>map&lt;string, .tensorflow.FeatureConfiguration&gt; feature_map = 1;</code>
   */
  boolean containsFeatureMap(
      java.lang.String key);
  /**
   * Use {@link #getFeatureMapMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, org.tensorflow.example.FeatureConfiguration>
  getFeatureMap();
  /**
   * <code>map&lt;string, .tensorflow.FeatureConfiguration&gt; feature_map = 1;</code>
   */
  java.util.Map<java.lang.String, org.tensorflow.example.FeatureConfiguration>
  getFeatureMapMap();
  /**
   * <code>map&lt;string, .tensorflow.FeatureConfiguration&gt; feature_map = 1;</code>
   */

  org.tensorflow.example.FeatureConfiguration getFeatureMapOrDefault(
      java.lang.String key,
      org.tensorflow.example.FeatureConfiguration defaultValue);
  /**
   * <code>map&lt;string, .tensorflow.FeatureConfiguration&gt; feature_map = 1;</code>
   */

  org.tensorflow.example.FeatureConfiguration getFeatureMapOrThrow(
      java.lang.String key);
}
