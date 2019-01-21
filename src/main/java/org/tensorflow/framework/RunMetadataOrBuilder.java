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

public interface RunMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.RunMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Statistics traced for this step. Populated if tracing is turned on via the
   * "RunOptions" proto.
   * EXPERIMENTAL: The format and set of events may change in future versions.
   * </pre>
   *
   * <code>.tensorflow.StepStats step_stats = 1;</code>
   */
  boolean hasStepStats();
  /**
   * <pre>
   * Statistics traced for this step. Populated if tracing is turned on via the
   * "RunOptions" proto.
   * EXPERIMENTAL: The format and set of events may change in future versions.
   * </pre>
   *
   * <code>.tensorflow.StepStats step_stats = 1;</code>
   */
  org.tensorflow.framework.StepStats getStepStats();
  /**
   * <pre>
   * Statistics traced for this step. Populated if tracing is turned on via the
   * "RunOptions" proto.
   * EXPERIMENTAL: The format and set of events may change in future versions.
   * </pre>
   *
   * <code>.tensorflow.StepStats step_stats = 1;</code>
   */
  org.tensorflow.framework.StepStatsOrBuilder getStepStatsOrBuilder();

  /**
   * <pre>
   * The cost graph for the computation defined by the run call.
   * </pre>
   *
   * <code>.tensorflow.CostGraphDef cost_graph = 2;</code>
   */
  boolean hasCostGraph();
  /**
   * <pre>
   * The cost graph for the computation defined by the run call.
   * </pre>
   *
   * <code>.tensorflow.CostGraphDef cost_graph = 2;</code>
   */
  org.tensorflow.framework.CostGraphDef getCostGraph();
  /**
   * <pre>
   * The cost graph for the computation defined by the run call.
   * </pre>
   *
   * <code>.tensorflow.CostGraphDef cost_graph = 2;</code>
   */
  org.tensorflow.framework.CostGraphDefOrBuilder getCostGraphOrBuilder();

  /**
   * <pre>
   * Graphs of the partitions executed by executors.
   * </pre>
   *
   * <code>repeated .tensorflow.GraphDef partition_graphs = 3;</code>
   */
  java.util.List<org.tensorflow.framework.GraphDef> 
      getPartitionGraphsList();
  /**
   * <pre>
   * Graphs of the partitions executed by executors.
   * </pre>
   *
   * <code>repeated .tensorflow.GraphDef partition_graphs = 3;</code>
   */
  org.tensorflow.framework.GraphDef getPartitionGraphs(int index);
  /**
   * <pre>
   * Graphs of the partitions executed by executors.
   * </pre>
   *
   * <code>repeated .tensorflow.GraphDef partition_graphs = 3;</code>
   */
  int getPartitionGraphsCount();
  /**
   * <pre>
   * Graphs of the partitions executed by executors.
   * </pre>
   *
   * <code>repeated .tensorflow.GraphDef partition_graphs = 3;</code>
   */
  java.util.List<? extends org.tensorflow.framework.GraphDefOrBuilder> 
      getPartitionGraphsOrBuilderList();
  /**
   * <pre>
   * Graphs of the partitions executed by executors.
   * </pre>
   *
   * <code>repeated .tensorflow.GraphDef partition_graphs = 3;</code>
   */
  org.tensorflow.framework.GraphDefOrBuilder getPartitionGraphsOrBuilder(
      int index);
}
