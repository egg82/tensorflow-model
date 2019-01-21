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
// source: tensor.proto

package org.tensorflow.framework;

public final class TensorProtos {
  private TensorProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_TensorProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_TensorProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_VariantTensorDataProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_VariantTensorDataProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014tensor.proto\022\ntensorflow\032/tensorflow/c" +
      "ore/framework/resource_handle.proto\032,ten" +
      "sorflow/core/framework/tensor_shape.prot" +
      "o\032%tensorflow/core/framework/types.proto" +
      "\"\214\004\n\013TensorProto\022#\n\005dtype\030\001 \001(\0162\024.tensor" +
      "flow.DataType\0222\n\014tensor_shape\030\002 \001(\0132\034.te" +
      "nsorflow.TensorShapeProto\022\026\n\016version_num" +
      "ber\030\003 \001(\005\022\026\n\016tensor_content\030\004 \001(\014\022\024\n\010hal" +
      "f_val\030\r \003(\005B\002\020\001\022\025\n\tfloat_val\030\005 \003(\002B\002\020\001\022\026" +
      "\n\ndouble_val\030\006 \003(\001B\002\020\001\022\023\n\007int_val\030\007 \003(\005B" +
      "\002\020\001\022\022\n\nstring_val\030\010 \003(\014\022\030\n\014scomplex_val\030" +
      "\t \003(\002B\002\020\001\022\025\n\tint64_val\030\n \003(\003B\002\020\001\022\024\n\010bool" +
      "_val\030\013 \003(\010B\002\020\001\022\030\n\014dcomplex_val\030\014 \003(\001B\002\020\001" +
      "\022<\n\023resource_handle_val\030\016 \003(\0132\037.tensorfl" +
      "ow.ResourceHandleProto\0227\n\013variant_val\030\017 " +
      "\003(\0132\".tensorflow.VariantTensorDataProto\022" +
      "\026\n\nuint32_val\030\020 \003(\rB\002\020\001\022\026\n\nuint64_val\030\021 " +
      "\003(\004B\002\020\001\"g\n\026VariantTensorDataProto\022\021\n\ttyp" +
      "e_name\030\001 \001(\t\022\020\n\010metadata\030\002 \001(\014\022(\n\007tensor" +
      "s\030\003 \003(\0132\027.tensorflow.TensorProtoBl\n\030org." +
      "tensorflow.frameworkB\014TensorProtosP\001Z=gi" +
      "thub.com/tensorflow/tensorflow/tensorflo" +
      "w/go/core/framework\370\001\001b\006proto3"
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
          org.tensorflow.framework.ResourceHandle.getDescriptor(),
          org.tensorflow.framework.TensorShapeProtos.getDescriptor(),
          org.tensorflow.framework.TypesProtos.getDescriptor(),
        }, assigner);
    internal_static_tensorflow_TensorProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_TensorProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_TensorProto_descriptor,
        new java.lang.String[] { "Dtype", "TensorShape", "VersionNumber", "TensorContent", "HalfVal", "FloatVal", "DoubleVal", "IntVal", "StringVal", "ScomplexVal", "Int64Val", "BoolVal", "DcomplexVal", "ResourceHandleVal", "VariantVal", "Uint32Val", "Uint64Val", });
    internal_static_tensorflow_VariantTensorDataProto_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tensorflow_VariantTensorDataProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_VariantTensorDataProto_descriptor,
        new java.lang.String[] { "TypeName", "Metadata", "Tensors", });
    org.tensorflow.framework.ResourceHandle.getDescriptor();
    org.tensorflow.framework.TensorShapeProtos.getDescriptor();
    org.tensorflow.framework.TypesProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
