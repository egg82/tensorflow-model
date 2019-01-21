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
// source: api_def.proto

package org.tensorflow.framework;

public interface ApiDefOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.ApiDef)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the op (in the OpDef) to specify the API for.
   * </pre>
   *
   * <code>string graph_op_name = 1;</code>
   */
  java.lang.String getGraphOpName();
  /**
   * <pre>
   * Name of the op (in the OpDef) to specify the API for.
   * </pre>
   *
   * <code>string graph_op_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getGraphOpNameBytes();

  /**
   * <pre>
   * If this op is deprecated, set deprecation message to the message
   * that should be logged when this op is used.
   * The message should indicate alternative op to use, if any.
   * </pre>
   *
   * <code>string deprecation_message = 12;</code>
   */
  java.lang.String getDeprecationMessage();
  /**
   * <pre>
   * If this op is deprecated, set deprecation message to the message
   * that should be logged when this op is used.
   * The message should indicate alternative op to use, if any.
   * </pre>
   *
   * <code>string deprecation_message = 12;</code>
   */
  com.google.protobuf.ByteString
      getDeprecationMessageBytes();

  /**
   * <pre>
   * Major version when the op will be deleted. For e.g. set this
   * value to 2 if op API should be removed in TensorFlow 2.0 and
   * deprecated in versions before that.
   * </pre>
   *
   * <code>int32 deprecation_version = 13;</code>
   */
  int getDeprecationVersion();

  /**
   * <code>.tensorflow.ApiDef.Visibility visibility = 2;</code>
   */
  int getVisibilityValue();
  /**
   * <code>.tensorflow.ApiDef.Visibility visibility = 2;</code>
   */
  org.tensorflow.framework.ApiDef.Visibility getVisibility();

  /**
   * <code>repeated .tensorflow.ApiDef.Endpoint endpoint = 3;</code>
   */
  java.util.List<org.tensorflow.framework.ApiDef.Endpoint> 
      getEndpointList();
  /**
   * <code>repeated .tensorflow.ApiDef.Endpoint endpoint = 3;</code>
   */
  org.tensorflow.framework.ApiDef.Endpoint getEndpoint(int index);
  /**
   * <code>repeated .tensorflow.ApiDef.Endpoint endpoint = 3;</code>
   */
  int getEndpointCount();
  /**
   * <code>repeated .tensorflow.ApiDef.Endpoint endpoint = 3;</code>
   */
  java.util.List<? extends org.tensorflow.framework.ApiDef.EndpointOrBuilder> 
      getEndpointOrBuilderList();
  /**
   * <code>repeated .tensorflow.ApiDef.Endpoint endpoint = 3;</code>
   */
  org.tensorflow.framework.ApiDef.EndpointOrBuilder getEndpointOrBuilder(
      int index);

  /**
   * <code>repeated .tensorflow.ApiDef.Arg in_arg = 4;</code>
   */
  java.util.List<org.tensorflow.framework.ApiDef.Arg> 
      getInArgList();
  /**
   * <code>repeated .tensorflow.ApiDef.Arg in_arg = 4;</code>
   */
  org.tensorflow.framework.ApiDef.Arg getInArg(int index);
  /**
   * <code>repeated .tensorflow.ApiDef.Arg in_arg = 4;</code>
   */
  int getInArgCount();
  /**
   * <code>repeated .tensorflow.ApiDef.Arg in_arg = 4;</code>
   */
  java.util.List<? extends org.tensorflow.framework.ApiDef.ArgOrBuilder> 
      getInArgOrBuilderList();
  /**
   * <code>repeated .tensorflow.ApiDef.Arg in_arg = 4;</code>
   */
  org.tensorflow.framework.ApiDef.ArgOrBuilder getInArgOrBuilder(
      int index);

  /**
   * <code>repeated .tensorflow.ApiDef.Arg out_arg = 5;</code>
   */
  java.util.List<org.tensorflow.framework.ApiDef.Arg> 
      getOutArgList();
  /**
   * <code>repeated .tensorflow.ApiDef.Arg out_arg = 5;</code>
   */
  org.tensorflow.framework.ApiDef.Arg getOutArg(int index);
  /**
   * <code>repeated .tensorflow.ApiDef.Arg out_arg = 5;</code>
   */
  int getOutArgCount();
  /**
   * <code>repeated .tensorflow.ApiDef.Arg out_arg = 5;</code>
   */
  java.util.List<? extends org.tensorflow.framework.ApiDef.ArgOrBuilder> 
      getOutArgOrBuilderList();
  /**
   * <code>repeated .tensorflow.ApiDef.Arg out_arg = 5;</code>
   */
  org.tensorflow.framework.ApiDef.ArgOrBuilder getOutArgOrBuilder(
      int index);

  /**
   * <pre>
   * List of original in_arg names to specify new argument order.
   * Length of arg_order should be either empty to keep current order
   * or match size of in_arg.
   * </pre>
   *
   * <code>repeated string arg_order = 11;</code>
   */
  java.util.List<java.lang.String>
      getArgOrderList();
  /**
   * <pre>
   * List of original in_arg names to specify new argument order.
   * Length of arg_order should be either empty to keep current order
   * or match size of in_arg.
   * </pre>
   *
   * <code>repeated string arg_order = 11;</code>
   */
  int getArgOrderCount();
  /**
   * <pre>
   * List of original in_arg names to specify new argument order.
   * Length of arg_order should be either empty to keep current order
   * or match size of in_arg.
   * </pre>
   *
   * <code>repeated string arg_order = 11;</code>
   */
  java.lang.String getArgOrder(int index);
  /**
   * <pre>
   * List of original in_arg names to specify new argument order.
   * Length of arg_order should be either empty to keep current order
   * or match size of in_arg.
   * </pre>
   *
   * <code>repeated string arg_order = 11;</code>
   */
  com.google.protobuf.ByteString
      getArgOrderBytes(int index);

  /**
   * <code>repeated .tensorflow.ApiDef.Attr attr = 6;</code>
   */
  java.util.List<org.tensorflow.framework.ApiDef.Attr> 
      getAttrList();
  /**
   * <code>repeated .tensorflow.ApiDef.Attr attr = 6;</code>
   */
  org.tensorflow.framework.ApiDef.Attr getAttr(int index);
  /**
   * <code>repeated .tensorflow.ApiDef.Attr attr = 6;</code>
   */
  int getAttrCount();
  /**
   * <code>repeated .tensorflow.ApiDef.Attr attr = 6;</code>
   */
  java.util.List<? extends org.tensorflow.framework.ApiDef.AttrOrBuilder> 
      getAttrOrBuilderList();
  /**
   * <code>repeated .tensorflow.ApiDef.Attr attr = 6;</code>
   */
  org.tensorflow.framework.ApiDef.AttrOrBuilder getAttrOrBuilder(
      int index);

  /**
   * <pre>
   * One-line human-readable description of what the Op does.
   * </pre>
   *
   * <code>string summary = 7;</code>
   */
  java.lang.String getSummary();
  /**
   * <pre>
   * One-line human-readable description of what the Op does.
   * </pre>
   *
   * <code>string summary = 7;</code>
   */
  com.google.protobuf.ByteString
      getSummaryBytes();

  /**
   * <pre>
   * Additional, longer human-readable description of what the Op does.
   * </pre>
   *
   * <code>string description = 8;</code>
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Additional, longer human-readable description of what the Op does.
   * </pre>
   *
   * <code>string description = 8;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Modify an existing/inherited description by adding text to the beginning
   * or end.
   * </pre>
   *
   * <code>string description_prefix = 9;</code>
   */
  java.lang.String getDescriptionPrefix();
  /**
   * <pre>
   * Modify an existing/inherited description by adding text to the beginning
   * or end.
   * </pre>
   *
   * <code>string description_prefix = 9;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionPrefixBytes();

  /**
   * <code>string description_suffix = 10;</code>
   */
  java.lang.String getDescriptionSuffix();
  /**
   * <code>string description_suffix = 10;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionSuffixBytes();
}
