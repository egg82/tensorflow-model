// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: remote_fused_graph_execute_info.proto

package org.tensorflow.framework;

public final class RemoteFusedGraphExecuteInfoProto {
  private RemoteFusedGraphExecuteInfoProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_RemoteFusedGraphExecuteInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_RemoteFusedGraphExecuteInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_RemoteFusedGraphExecuteInfo_TensorShapeTypeProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_RemoteFusedGraphExecuteInfo_TensorShapeTypeProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%remote_fused_graph_execute_info.proto\022" +
      "\ntensorflow\032%tensorflow/core/framework/g" +
      "raph.proto\032,tensorflow/core/framework/te" +
      "nsor_shape.proto\032%tensorflow/core/framew" +
      "ork/types.proto\"\202\004\n\033RemoteFusedGraphExec" +
      "uteInfo\022*\n\014remote_graph\030\001 \001(\0132\024.tensorfl" +
      "ow.GraphDef\022\035\n\025graph_input_node_name\030\002 \003" +
      "(\t\022\036\n\026graph_output_node_name\030\003 \003(\t\022\025\n\rex" +
      "ecutor_name\030\004 \001(\t\022&\n\036serialized_executor" +
      "_parameters\030\005 \001(\014\022f\n default_graph_input" +
      "_tensor_shape\030\006 \003(\0132<.tensorflow.RemoteF" +
      "usedGraphExecuteInfo.TensorShapeTypeProt" +
      "o\022g\n!default_graph_output_tensor_shape\030\007" +
      " \003(\0132<.tensorflow.RemoteFusedGraphExecut" +
      "eInfo.TensorShapeTypeProto\032h\n\024TensorShap" +
      "eTypeProto\022#\n\005dtype\030\001 \001(\0162\024.tensorflow.D" +
      "ataType\022+\n\005shape\030\002 \001(\0132\034.tensorflow.Tens" +
      "orShapeProtoB\200\001\n\030org.tensorflow.framewor" +
      "kB RemoteFusedGraphExecuteInfoProtoP\001Z=g" +
      "ithub.com/tensorflow/tensorflow/tensorfl" +
      "ow/go/core/framework\370\001\001b\006proto3"
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
          org.tensorflow.framework.GraphProtos.getDescriptor(),
          org.tensorflow.framework.TensorShapeProtos.getDescriptor(),
          org.tensorflow.framework.TypesProtos.getDescriptor(),
        }, assigner);
    internal_static_tensorflow_RemoteFusedGraphExecuteInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_RemoteFusedGraphExecuteInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_RemoteFusedGraphExecuteInfo_descriptor,
        new java.lang.String[] { "RemoteGraph", "GraphInputNodeName", "GraphOutputNodeName", "ExecutorName", "SerializedExecutorParameters", "DefaultGraphInputTensorShape", "DefaultGraphOutputTensorShape", });
    internal_static_tensorflow_RemoteFusedGraphExecuteInfo_TensorShapeTypeProto_descriptor =
      internal_static_tensorflow_RemoteFusedGraphExecuteInfo_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_RemoteFusedGraphExecuteInfo_TensorShapeTypeProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_RemoteFusedGraphExecuteInfo_TensorShapeTypeProto_descriptor,
        new java.lang.String[] { "Dtype", "Shape", });
    org.tensorflow.framework.GraphProtos.getDescriptor();
    org.tensorflow.framework.TensorShapeProtos.getDescriptor();
    org.tensorflow.framework.TypesProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
