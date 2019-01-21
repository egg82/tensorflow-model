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

public interface ThreadPoolOptionProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.ThreadPoolOptionProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The number of threads in the pool.
   * 0 means the system picks a value based on where this option proto is used
   * (see the declaration of the specific field for more info).
   * </pre>
   *
   * <code>int32 num_threads = 1;</code>
   */
  int getNumThreads();

  /**
   * <pre>
   * The global name of the threadpool.
   * If empty, then the threadpool is made and used according to the scope it's
   * in - e.g., for a session threadpool, it is used by that session only.
   * If non-empty, then:
   * - a global threadpool associated with this name is looked
   *   up or created. This allows, for example, sharing one threadpool across
   *   many sessions (e.g., like the default behavior, if
   *   inter_op_parallelism_threads is not configured), but still partitioning
   *   into a large and small pool.
   * - if the threadpool for this global_name already exists, then it is an
   *   error if the existing pool was created using a different num_threads
   *   value as is specified on this call.
   * - threadpools created this way are never garbage collected.
   * </pre>
   *
   * <code>string global_name = 2;</code>
   */
  java.lang.String getGlobalName();
  /**
   * <pre>
   * The global name of the threadpool.
   * If empty, then the threadpool is made and used according to the scope it's
   * in - e.g., for a session threadpool, it is used by that session only.
   * If non-empty, then:
   * - a global threadpool associated with this name is looked
   *   up or created. This allows, for example, sharing one threadpool across
   *   many sessions (e.g., like the default behavior, if
   *   inter_op_parallelism_threads is not configured), but still partitioning
   *   into a large and small pool.
   * - if the threadpool for this global_name already exists, then it is an
   *   error if the existing pool was created using a different num_threads
   *   value as is specified on this call.
   * - threadpools created this way are never garbage collected.
   * </pre>
   *
   * <code>string global_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getGlobalNameBytes();
}
