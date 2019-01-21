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

public interface RecvTensorRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.RecvTensorRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The step in which the tensor will be produced.
   * REQUIRED: This must eventually correspond to the `step_id` passed
   * into a RunGraph call on the same WorkerService.
   * </pre>
   *
   * <code>int64 step_id = 1;</code>
   */
  long getStepId();

  /**
   * <pre>
   * A key identifying the channel to receive tensors from. A RecvTensor request
   * retrieves one tensor from the channel, but multiple tensors can be sent and
   * received over the same channel with multiple RecvTensor requests. See
   * rendezvous.h for details.
   * </pre>
   *
   * <code>string rendezvous_key = 2;</code>
   */
  java.lang.String getRendezvousKey();
  /**
   * <pre>
   * A key identifying the channel to receive tensors from. A RecvTensor request
   * retrieves one tensor from the channel, but multiple tensors can be sent and
   * received over the same channel with multiple RecvTensor requests. See
   * rendezvous.h for details.
   * </pre>
   *
   * <code>string rendezvous_key = 2;</code>
   */
  com.google.protobuf.ByteString
      getRendezvousKeyBytes();

  /**
   * <pre>
   * If true, use an out-of-band DMA mechanism to transfer the
   * received tensor.
   * </pre>
   *
   * <code>bool dma_ok = 3;</code>
   */
  boolean getDmaOk();

  /**
   * <pre>
   * Optional information on client-side device locality.
   * </pre>
   *
   * <code>.tensorflow.DeviceLocality client_locality = 4;</code>
   */
  boolean hasClientLocality();
  /**
   * <pre>
   * Optional information on client-side device locality.
   * </pre>
   *
   * <code>.tensorflow.DeviceLocality client_locality = 4;</code>
   */
  org.tensorflow.framework.DeviceLocality getClientLocality();
  /**
   * <pre>
   * Optional information on client-side device locality.
   * </pre>
   *
   * <code>.tensorflow.DeviceLocality client_locality = 4;</code>
   */
  org.tensorflow.framework.DeviceLocalityOrBuilder getClientLocalityOrBuilder();

  /**
   * <pre>
   * Optional information on server-side device locality.
   * </pre>
   *
   * <code>.tensorflow.DeviceLocality server_locality = 5;</code>
   */
  boolean hasServerLocality();
  /**
   * <pre>
   * Optional information on server-side device locality.
   * </pre>
   *
   * <code>.tensorflow.DeviceLocality server_locality = 5;</code>
   */
  org.tensorflow.framework.DeviceLocality getServerLocality();
  /**
   * <pre>
   * Optional information on server-side device locality.
   * </pre>
   *
   * <code>.tensorflow.DeviceLocality server_locality = 5;</code>
   */
  org.tensorflow.framework.DeviceLocalityOrBuilder getServerLocalityOrBuilder();

  /**
   * <pre>
   * Optional information needed by the RPC subsystem.
   * </pre>
   *
   * <code>.google.protobuf.Any transport_options = 6;</code>
   */
  boolean hasTransportOptions();
  /**
   * <pre>
   * Optional information needed by the RPC subsystem.
   * </pre>
   *
   * <code>.google.protobuf.Any transport_options = 6;</code>
   */
  com.google.protobuf.Any getTransportOptions();
  /**
   * <pre>
   * Optional information needed by the RPC subsystem.
   * </pre>
   *
   * <code>.google.protobuf.Any transport_options = 6;</code>
   */
  com.google.protobuf.AnyOrBuilder getTransportOptionsOrBuilder();

  /**
   * <pre>
   * Unique identifier for this request. Every RecvTensorRequest must have a
   * unique request_id, and retried RecvTensorRequests must have the same
   * request_id. If request_id is zero, retry detection is disabled.
   * Retried RecvTensorRequests are problematic because a RecvTensor with no
   * corresponding sender will wait forever, and the tensor may have been
   * delivered to a previous retry. Workers use request_ids to reject retried
   * RecvTensor requests instead of waiting forever.
   * </pre>
   *
   * <code>int64 request_id = 7;</code>
   */
  long getRequestId();
}
