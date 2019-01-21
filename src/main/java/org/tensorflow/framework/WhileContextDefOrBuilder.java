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
// source: control_flow.proto

package org.tensorflow.framework;

public interface WhileContextDefOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.WhileContextDef)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the context.
   * </pre>
   *
   * <code>string context_name = 1;</code>
   */
  java.lang.String getContextName();
  /**
   * <pre>
   * Name of the context.
   * </pre>
   *
   * <code>string context_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getContextNameBytes();

  /**
   * <pre>
   * The number of iterations allowed to run in parallel.
   * </pre>
   *
   * <code>int32 parallel_iterations = 2;</code>
   */
  int getParallelIterations();

  /**
   * <pre>
   * Whether backprop is enabled for this while loop.
   * </pre>
   *
   * <code>bool back_prop = 3;</code>
   */
  boolean getBackProp();

  /**
   * <pre>
   * Whether GPU-CPU memory swap is enabled for this loop.
   * </pre>
   *
   * <code>bool swap_memory = 4;</code>
   */
  boolean getSwapMemory();

  /**
   * <pre>
   * Name of the pivot tensor.
   * </pre>
   *
   * <code>string pivot_name = 5;</code>
   */
  java.lang.String getPivotName();
  /**
   * <pre>
   * Name of the pivot tensor.
   * </pre>
   *
   * <code>string pivot_name = 5;</code>
   */
  com.google.protobuf.ByteString
      getPivotNameBytes();

  /**
   * <pre>
   * Name of the pivot_for_pred tensor.
   * </pre>
   *
   * <code>string pivot_for_pred_name = 6;</code>
   */
  java.lang.String getPivotForPredName();
  /**
   * <pre>
   * Name of the pivot_for_pred tensor.
   * </pre>
   *
   * <code>string pivot_for_pred_name = 6;</code>
   */
  com.google.protobuf.ByteString
      getPivotForPredNameBytes();

  /**
   * <pre>
   * Name of the pivot_for_body tensor.
   * </pre>
   *
   * <code>string pivot_for_body_name = 7;</code>
   */
  java.lang.String getPivotForBodyName();
  /**
   * <pre>
   * Name of the pivot_for_body tensor.
   * </pre>
   *
   * <code>string pivot_for_body_name = 7;</code>
   */
  com.google.protobuf.ByteString
      getPivotForBodyNameBytes();

  /**
   * <pre>
   * List of names for exit tensors.
   * </pre>
   *
   * <code>repeated string loop_exit_names = 8;</code>
   */
  java.util.List<java.lang.String>
      getLoopExitNamesList();
  /**
   * <pre>
   * List of names for exit tensors.
   * </pre>
   *
   * <code>repeated string loop_exit_names = 8;</code>
   */
  int getLoopExitNamesCount();
  /**
   * <pre>
   * List of names for exit tensors.
   * </pre>
   *
   * <code>repeated string loop_exit_names = 8;</code>
   */
  java.lang.String getLoopExitNames(int index);
  /**
   * <pre>
   * List of names for exit tensors.
   * </pre>
   *
   * <code>repeated string loop_exit_names = 8;</code>
   */
  com.google.protobuf.ByteString
      getLoopExitNamesBytes(int index);

  /**
   * <pre>
   * List of names for enter tensors.
   * </pre>
   *
   * <code>repeated string loop_enter_names = 10;</code>
   */
  java.util.List<java.lang.String>
      getLoopEnterNamesList();
  /**
   * <pre>
   * List of names for enter tensors.
   * </pre>
   *
   * <code>repeated string loop_enter_names = 10;</code>
   */
  int getLoopEnterNamesCount();
  /**
   * <pre>
   * List of names for enter tensors.
   * </pre>
   *
   * <code>repeated string loop_enter_names = 10;</code>
   */
  java.lang.String getLoopEnterNames(int index);
  /**
   * <pre>
   * List of names for enter tensors.
   * </pre>
   *
   * <code>repeated string loop_enter_names = 10;</code>
   */
  com.google.protobuf.ByteString
      getLoopEnterNamesBytes(int index);

  /**
   * <pre>
   * Values and external values in control flow context.
   * </pre>
   *
   * <code>.tensorflow.ValuesDef values_def = 9;</code>
   */
  boolean hasValuesDef();
  /**
   * <pre>
   * Values and external values in control flow context.
   * </pre>
   *
   * <code>.tensorflow.ValuesDef values_def = 9;</code>
   */
  org.tensorflow.framework.ValuesDef getValuesDef();
  /**
   * <pre>
   * Values and external values in control flow context.
   * </pre>
   *
   * <code>.tensorflow.ValuesDef values_def = 9;</code>
   */
  org.tensorflow.framework.ValuesDefOrBuilder getValuesDefOrBuilder();

  /**
   * <pre>
   * Optional name of the maximum_iterations tensor.
   * </pre>
   *
   * <code>string maximum_iterations_name = 11;</code>
   */
  java.lang.String getMaximumIterationsName();
  /**
   * <pre>
   * Optional name of the maximum_iterations tensor.
   * </pre>
   *
   * <code>string maximum_iterations_name = 11;</code>
   */
  com.google.protobuf.ByteString
      getMaximumIterationsNameBytes();

  /**
   * <pre>
   * Contexts contained inside this context (e.g. nested whiles).
   * </pre>
   *
   * <code>repeated .tensorflow.ControlFlowContextDef nested_contexts = 12;</code>
   */
  java.util.List<org.tensorflow.framework.ControlFlowContextDef> 
      getNestedContextsList();
  /**
   * <pre>
   * Contexts contained inside this context (e.g. nested whiles).
   * </pre>
   *
   * <code>repeated .tensorflow.ControlFlowContextDef nested_contexts = 12;</code>
   */
  org.tensorflow.framework.ControlFlowContextDef getNestedContexts(int index);
  /**
   * <pre>
   * Contexts contained inside this context (e.g. nested whiles).
   * </pre>
   *
   * <code>repeated .tensorflow.ControlFlowContextDef nested_contexts = 12;</code>
   */
  int getNestedContextsCount();
  /**
   * <pre>
   * Contexts contained inside this context (e.g. nested whiles).
   * </pre>
   *
   * <code>repeated .tensorflow.ControlFlowContextDef nested_contexts = 12;</code>
   */
  java.util.List<? extends org.tensorflow.framework.ControlFlowContextDefOrBuilder> 
      getNestedContextsOrBuilderList();
  /**
   * <pre>
   * Contexts contained inside this context (e.g. nested whiles).
   * </pre>
   *
   * <code>repeated .tensorflow.ControlFlowContextDef nested_contexts = 12;</code>
   */
  org.tensorflow.framework.ControlFlowContextDefOrBuilder getNestedContextsOrBuilder(
      int index);
}
