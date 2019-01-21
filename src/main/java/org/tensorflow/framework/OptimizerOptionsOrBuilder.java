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
// source: config.proto

package org.tensorflow.framework;

public interface OptimizerOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.OptimizerOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If true, optimize the graph using common subexpression elimination.
   * </pre>
   *
   * <code>bool do_common_subexpression_elimination = 1;</code>
   */
  boolean getDoCommonSubexpressionElimination();

  /**
   * <pre>
   * If true, perform constant folding optimization on the graph.
   * </pre>
   *
   * <code>bool do_constant_folding = 2;</code>
   */
  boolean getDoConstantFolding();

  /**
   * <pre>
   * Constant folding optimization replaces tensors whose values can be
   * predetermined, with constant nodes. To avoid inserting too large constants,
   * the size of each constant created can be limited. If this value is zero, a
   * default limit of 10 MiB will be applied. If constant folding optimization
   * is disabled, this value is ignored.
   * </pre>
   *
   * <code>int64 max_folded_constant_in_bytes = 6;</code>
   */
  long getMaxFoldedConstantInBytes();

  /**
   * <pre>
   * If true, perform function inlining on the graph.
   * </pre>
   *
   * <code>bool do_function_inlining = 4;</code>
   */
  boolean getDoFunctionInlining();

  /**
   * <pre>
   * Overall optimization level. The actual optimizations applied will be the
   * logical OR of the flags that this level implies and any flags already set.
   * </pre>
   *
   * <code>.tensorflow.OptimizerOptions.Level opt_level = 3;</code>
   */
  int getOptLevelValue();
  /**
   * <pre>
   * Overall optimization level. The actual optimizations applied will be the
   * logical OR of the flags that this level implies and any flags already set.
   * </pre>
   *
   * <code>.tensorflow.OptimizerOptions.Level opt_level = 3;</code>
   */
  org.tensorflow.framework.OptimizerOptions.Level getOptLevel();

  /**
   * <code>.tensorflow.OptimizerOptions.GlobalJitLevel global_jit_level = 5;</code>
   */
  int getGlobalJitLevelValue();
  /**
   * <code>.tensorflow.OptimizerOptions.GlobalJitLevel global_jit_level = 5;</code>
   */
  org.tensorflow.framework.OptimizerOptions.GlobalJitLevel getGlobalJitLevel();
}