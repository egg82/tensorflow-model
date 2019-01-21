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
// source: test_log.proto

package org.tensorflow.util.testlog;

public interface TestResultsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.TestResults)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The target of the run, e.g.:
   *  //tensorflow/core:kernels_adjust_contrast_op_benchmark_test
   * </pre>
   *
   * <code>string target = 1;</code>
   */
  java.lang.String getTarget();
  /**
   * <pre>
   * The target of the run, e.g.:
   *  //tensorflow/core:kernels_adjust_contrast_op_benchmark_test
   * </pre>
   *
   * <code>string target = 1;</code>
   */
  com.google.protobuf.ByteString
      getTargetBytes();

  /**
   * <pre>
   * The list of tests or benchmarks in this run.
   * </pre>
   *
   * <code>.tensorflow.BenchmarkEntries entries = 2;</code>
   */
  boolean hasEntries();
  /**
   * <pre>
   * The list of tests or benchmarks in this run.
   * </pre>
   *
   * <code>.tensorflow.BenchmarkEntries entries = 2;</code>
   */
  org.tensorflow.util.testlog.BenchmarkEntries getEntries();
  /**
   * <pre>
   * The list of tests or benchmarks in this run.
   * </pre>
   *
   * <code>.tensorflow.BenchmarkEntries entries = 2;</code>
   */
  org.tensorflow.util.testlog.BenchmarkEntriesOrBuilder getEntriesOrBuilder();

  /**
   * <pre>
   * The configuration of the build (compiled opt? with cuda? any copts?)
   * </pre>
   *
   * <code>.tensorflow.BuildConfiguration build_configuration = 3;</code>
   */
  boolean hasBuildConfiguration();
  /**
   * <pre>
   * The configuration of the build (compiled opt? with cuda? any copts?)
   * </pre>
   *
   * <code>.tensorflow.BuildConfiguration build_configuration = 3;</code>
   */
  org.tensorflow.util.testlog.BuildConfiguration getBuildConfiguration();
  /**
   * <pre>
   * The configuration of the build (compiled opt? with cuda? any copts?)
   * </pre>
   *
   * <code>.tensorflow.BuildConfiguration build_configuration = 3;</code>
   */
  org.tensorflow.util.testlog.BuildConfigurationOrBuilder getBuildConfigurationOrBuilder();

  /**
   * <pre>
   * The commit id (git hash or changelist)
   * </pre>
   *
   * <code>.tensorflow.CommitId commit_id = 4;</code>
   */
  boolean hasCommitId();
  /**
   * <pre>
   * The commit id (git hash or changelist)
   * </pre>
   *
   * <code>.tensorflow.CommitId commit_id = 4;</code>
   */
  org.tensorflow.util.testlog.CommitId getCommitId();
  /**
   * <pre>
   * The commit id (git hash or changelist)
   * </pre>
   *
   * <code>.tensorflow.CommitId commit_id = 4;</code>
   */
  org.tensorflow.util.testlog.CommitIdOrBuilder getCommitIdOrBuilder();

  /**
   * <pre>
   * The time the run started (in seconds of UTC time since Unix epoch)
   * </pre>
   *
   * <code>int64 start_time = 5;</code>
   */
  long getStartTime();

  /**
   * <pre>
   * The amount of time the total run took (wall time in seconds)
   * </pre>
   *
   * <code>double run_time = 6;</code>
   */
  double getRunTime();

  /**
   * <pre>
   * Machine-specific parameters (Platform and CPU info)
   * </pre>
   *
   * <code>.tensorflow.MachineConfiguration machine_configuration = 7;</code>
   */
  boolean hasMachineConfiguration();
  /**
   * <pre>
   * Machine-specific parameters (Platform and CPU info)
   * </pre>
   *
   * <code>.tensorflow.MachineConfiguration machine_configuration = 7;</code>
   */
  org.tensorflow.util.testlog.MachineConfiguration getMachineConfiguration();
  /**
   * <pre>
   * Machine-specific parameters (Platform and CPU info)
   * </pre>
   *
   * <code>.tensorflow.MachineConfiguration machine_configuration = 7;</code>
   */
  org.tensorflow.util.testlog.MachineConfigurationOrBuilder getMachineConfigurationOrBuilder();

  /**
   * <pre>
   * Run-specific parameters (arguments, etc)
   * </pre>
   *
   * <code>.tensorflow.RunConfiguration run_configuration = 8;</code>
   */
  boolean hasRunConfiguration();
  /**
   * <pre>
   * Run-specific parameters (arguments, etc)
   * </pre>
   *
   * <code>.tensorflow.RunConfiguration run_configuration = 8;</code>
   */
  org.tensorflow.util.testlog.RunConfiguration getRunConfiguration();
  /**
   * <pre>
   * Run-specific parameters (arguments, etc)
   * </pre>
   *
   * <code>.tensorflow.RunConfiguration run_configuration = 8;</code>
   */
  org.tensorflow.util.testlog.RunConfigurationOrBuilder getRunConfigurationOrBuilder();

  /**
   * <pre>
   * Benchmark target identifier.
   * </pre>
   *
   * <code>string name = 9;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Benchmark target identifier.
   * </pre>
   *
   * <code>string name = 9;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.tensorflow.TestResults.BenchmarkType benchmark_type = 10;</code>
   */
  int getBenchmarkTypeValue();
  /**
   * <code>.tensorflow.TestResults.BenchmarkType benchmark_type = 10;</code>
   */
  org.tensorflow.util.testlog.TestResults.BenchmarkType getBenchmarkType();

  /**
   * <pre>
   * Used for differentiating between continuous and debug builds.
   * Must be one of:
   * * cbuild: results from continuous build.
   * * presubmit: results from oneshot requests.
   * * culprit: results from culprit finder rerun.
   * </pre>
   *
   * <code>string run_mode = 11;</code>
   */
  java.lang.String getRunMode();
  /**
   * <pre>
   * Used for differentiating between continuous and debug builds.
   * Must be one of:
   * * cbuild: results from continuous build.
   * * presubmit: results from oneshot requests.
   * * culprit: results from culprit finder rerun.
   * </pre>
   *
   * <code>string run_mode = 11;</code>
   */
  com.google.protobuf.ByteString
      getRunModeBytes();
}