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
// source: worker.proto

package org.tensorflow.distruntime;

public interface StepSequenceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.StepSequence)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 graph_key = 1;</code>
   */
  long getGraphKey();

  /**
   * <code>int64 next_step_id = 2;</code>
   */
  long getNextStepId();
}
