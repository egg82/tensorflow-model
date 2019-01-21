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
// source: event.proto

package org.tensorflow.util;

public final class EventProtos {
  private EventProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_Event_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_Event_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_LogMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_LogMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_SessionLog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_SessionLog_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_TaggedRunMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_TaggedRunMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_WatchdogConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_WatchdogConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_WorkerHeartbeatRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_WorkerHeartbeatRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_WorkerHeartbeatResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_WorkerHeartbeatResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013event.proto\022\ntensorflow\032\'tensorflow/co" +
      "re/framework/summary.proto\"\273\002\n\005Event\022\021\n\t" +
      "wall_time\030\001 \001(\001\022\014\n\004step\030\002 \001(\003\022\026\n\014file_ve" +
      "rsion\030\003 \001(\tH\000\022\023\n\tgraph_def\030\004 \001(\014H\000\022&\n\007su" +
      "mmary\030\005 \001(\0132\023.tensorflow.SummaryH\000\022-\n\013lo" +
      "g_message\030\006 \001(\0132\026.tensorflow.LogMessageH" +
      "\000\022-\n\013session_log\030\007 \001(\0132\026.tensorflow.Sess" +
      "ionLogH\000\022<\n\023tagged_run_metadata\030\010 \001(\0132\035." +
      "tensorflow.TaggedRunMetadataH\000\022\030\n\016meta_g" +
      "raph_def\030\t \001(\014H\000B\006\n\004what\"\231\001\n\nLogMessage\022" +
      "+\n\005level\030\001 \001(\0162\034.tensorflow.LogMessage.L" +
      "evel\022\017\n\007message\030\002 \001(\t\"M\n\005Level\022\013\n\007UNKNOW" +
      "N\020\000\022\r\n\tDEBUGGING\020\n\022\010\n\004INFO\020\024\022\010\n\004WARN\020\036\022\t" +
      "\n\005ERROR\020(\022\t\n\005FATAL\0202\"\266\001\n\nSessionLog\0224\n\006s" +
      "tatus\030\001 \001(\0162$.tensorflow.SessionLog.Sess" +
      "ionStatus\022\027\n\017checkpoint_path\030\002 \001(\t\022\013\n\003ms" +
      "g\030\003 \001(\t\"L\n\rSessionStatus\022\026\n\022STATUS_UNSPE" +
      "CIFIED\020\000\022\t\n\005START\020\001\022\010\n\004STOP\020\002\022\016\n\nCHECKPO" +
      "INT\020\003\"6\n\021TaggedRunMetadata\022\013\n\003tag\030\001 \001(\t\022" +
      "\024\n\014run_metadata\030\002 \001(\014\"$\n\016WatchdogConfig\022" +
      "\022\n\ntimeout_ms\030\001 \001(\003\"\204\001\n\026WorkerHeartbeatR" +
      "equest\0225\n\rshutdown_mode\030\001 \001(\0162\036.tensorfl" +
      "ow.WorkerShutdownMode\0223\n\017watchdog_config" +
      "\030\002 \001(\0132\032.tensorflow.WatchdogConfig\"\203\001\n\027W" +
      "orkerHeartbeatResponse\022/\n\rhealth_status\030" +
      "\001 \001(\0162\030.tensorflow.WorkerHealth\022%\n\nworke" +
      "r_log\030\002 \003(\0132\021.tensorflow.Event\022\020\n\010hostna" +
      "me\030\003 \001(\t*H\n\014WorkerHealth\022\006\n\002OK\020\000\022\034\n\030RECE" +
      "IVED_SHUTDOWN_SIGNAL\020\001\022\022\n\016INTERNAL_ERROR" +
      "\020\002*O\n\022WorkerShutdownMode\022\013\n\007DEFAULT\020\000\022\022\n" +
      "\016NOT_CONFIGURED\020\001\022\030\n\024WAIT_FOR_COORDINATO" +
      "R\020\002B\'\n\023org.tensorflow.utilB\013EventProtosP" +
      "\001\370\001\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.tensorflow.framework.SummaryProtos.getDescriptor(),
        }, assigner);
    internal_static_tensorflow_Event_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_Event_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_Event_descriptor,
        new java.lang.String[] { "WallTime", "Step", "FileVersion", "GraphDef", "Summary", "LogMessage", "SessionLog", "TaggedRunMetadata", "MetaGraphDef", "What", });
    internal_static_tensorflow_LogMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tensorflow_LogMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_LogMessage_descriptor,
        new java.lang.String[] { "Level", "Message", });
    internal_static_tensorflow_SessionLog_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tensorflow_SessionLog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_SessionLog_descriptor,
        new java.lang.String[] { "Status", "CheckpointPath", "Msg", });
    internal_static_tensorflow_TaggedRunMetadata_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_tensorflow_TaggedRunMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_TaggedRunMetadata_descriptor,
        new java.lang.String[] { "Tag", "RunMetadata", });
    internal_static_tensorflow_WatchdogConfig_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_tensorflow_WatchdogConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_WatchdogConfig_descriptor,
        new java.lang.String[] { "TimeoutMs", });
    internal_static_tensorflow_WorkerHeartbeatRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_tensorflow_WorkerHeartbeatRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_WorkerHeartbeatRequest_descriptor,
        new java.lang.String[] { "ShutdownMode", "WatchdogConfig", });
    internal_static_tensorflow_WorkerHeartbeatResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_tensorflow_WorkerHeartbeatResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_WorkerHeartbeatResponse_descriptor,
        new java.lang.String[] { "HealthStatus", "WorkerLog", "Hostname", });
    org.tensorflow.framework.SummaryProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
