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
// source: test_example.proto

package tensorflow.contrib.rpc;

public final class TestExample {
  private TestExample() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TestCaseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:tensorflow.contrib.rpc.TestCase)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated int32 values = 1;</code>
     */
    java.util.List<java.lang.Integer> getValuesList();
    /**
     * <code>repeated int32 values = 1;</code>
     */
    int getValuesCount();
    /**
     * <code>repeated int32 values = 1;</code>
     */
    int getValues(int index);
  }
  /**
   * <pre>
   * A TestCase holds a sequence of values.
   * </pre>
   *
   * Protobuf type {@code tensorflow.contrib.rpc.TestCase}
   */
  public  static final class TestCase extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:tensorflow.contrib.rpc.TestCase)
      TestCaseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TestCase.newBuilder() to construct.
    private TestCase(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TestCase() {
      values_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TestCase(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                values_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              values_.add(input.readInt32());
              break;
            }
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001) && input.getBytesUntilLimit() > 0) {
                values_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                values_.add(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          values_ = java.util.Collections.unmodifiableList(values_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tensorflow.contrib.rpc.TestExample.internal_static_tensorflow_contrib_rpc_TestCase_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tensorflow.contrib.rpc.TestExample.internal_static_tensorflow_contrib_rpc_TestCase_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tensorflow.contrib.rpc.TestExample.TestCase.class, tensorflow.contrib.rpc.TestExample.TestCase.Builder.class);
    }

    public static final int VALUES_FIELD_NUMBER = 1;
    private java.util.List<java.lang.Integer> values_;
    /**
     * <code>repeated int32 values = 1;</code>
     */
    public java.util.List<java.lang.Integer>
        getValuesList() {
      return values_;
    }
    /**
     * <code>repeated int32 values = 1;</code>
     */
    public int getValuesCount() {
      return values_.size();
    }
    /**
     * <code>repeated int32 values = 1;</code>
     */
    public int getValues(int index) {
      return values_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < values_.size(); i++) {
        output.writeInt32(1, values_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < values_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(values_.get(i));
        }
        size += dataSize;
        size += 1 * getValuesList().size();
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof tensorflow.contrib.rpc.TestExample.TestCase)) {
        return super.equals(obj);
      }
      tensorflow.contrib.rpc.TestExample.TestCase other = (tensorflow.contrib.rpc.TestExample.TestCase) obj;

      boolean result = true;
      result = result && getValuesList()
          .equals(other.getValuesList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getValuesCount() > 0) {
        hash = (37 * hash) + VALUES_FIELD_NUMBER;
        hash = (53 * hash) + getValuesList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static tensorflow.contrib.rpc.TestExample.TestCase parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tensorflow.contrib.rpc.TestExample.TestCase parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tensorflow.contrib.rpc.TestExample.TestCase parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tensorflow.contrib.rpc.TestExample.TestCase parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tensorflow.contrib.rpc.TestExample.TestCase parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tensorflow.contrib.rpc.TestExample.TestCase parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tensorflow.contrib.rpc.TestExample.TestCase parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tensorflow.contrib.rpc.TestExample.TestCase parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static tensorflow.contrib.rpc.TestExample.TestCase parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static tensorflow.contrib.rpc.TestExample.TestCase parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static tensorflow.contrib.rpc.TestExample.TestCase parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tensorflow.contrib.rpc.TestExample.TestCase parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(tensorflow.contrib.rpc.TestExample.TestCase prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * A TestCase holds a sequence of values.
     * </pre>
     *
     * Protobuf type {@code tensorflow.contrib.rpc.TestCase}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:tensorflow.contrib.rpc.TestCase)
        tensorflow.contrib.rpc.TestExample.TestCaseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return tensorflow.contrib.rpc.TestExample.internal_static_tensorflow_contrib_rpc_TestCase_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return tensorflow.contrib.rpc.TestExample.internal_static_tensorflow_contrib_rpc_TestCase_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                tensorflow.contrib.rpc.TestExample.TestCase.class, tensorflow.contrib.rpc.TestExample.TestCase.Builder.class);
      }

      // Construct using tensorflow.contrib.rpc.TestExample.TestCase.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        values_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return tensorflow.contrib.rpc.TestExample.internal_static_tensorflow_contrib_rpc_TestCase_descriptor;
      }

      @java.lang.Override
      public tensorflow.contrib.rpc.TestExample.TestCase getDefaultInstanceForType() {
        return tensorflow.contrib.rpc.TestExample.TestCase.getDefaultInstance();
      }

      @java.lang.Override
      public tensorflow.contrib.rpc.TestExample.TestCase build() {
        tensorflow.contrib.rpc.TestExample.TestCase result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public tensorflow.contrib.rpc.TestExample.TestCase buildPartial() {
        tensorflow.contrib.rpc.TestExample.TestCase result = new tensorflow.contrib.rpc.TestExample.TestCase(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          values_ = java.util.Collections.unmodifiableList(values_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.values_ = values_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof tensorflow.contrib.rpc.TestExample.TestCase) {
          return mergeFrom((tensorflow.contrib.rpc.TestExample.TestCase)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(tensorflow.contrib.rpc.TestExample.TestCase other) {
        if (other == tensorflow.contrib.rpc.TestExample.TestCase.getDefaultInstance()) return this;
        if (!other.values_.isEmpty()) {
          if (values_.isEmpty()) {
            values_ = other.values_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureValuesIsMutable();
            values_.addAll(other.values_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        tensorflow.contrib.rpc.TestExample.TestCase parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (tensorflow.contrib.rpc.TestExample.TestCase) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<java.lang.Integer> values_ = java.util.Collections.emptyList();
      private void ensureValuesIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          values_ = new java.util.ArrayList<java.lang.Integer>(values_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated int32 values = 1;</code>
       */
      public java.util.List<java.lang.Integer>
          getValuesList() {
        return java.util.Collections.unmodifiableList(values_);
      }
      /**
       * <code>repeated int32 values = 1;</code>
       */
      public int getValuesCount() {
        return values_.size();
      }
      /**
       * <code>repeated int32 values = 1;</code>
       */
      public int getValues(int index) {
        return values_.get(index);
      }
      /**
       * <code>repeated int32 values = 1;</code>
       */
      public Builder setValues(
          int index, int value) {
        ensureValuesIsMutable();
        values_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 values = 1;</code>
       */
      public Builder addValues(int value) {
        ensureValuesIsMutable();
        values_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 values = 1;</code>
       */
      public Builder addAllValues(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureValuesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, values_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 values = 1;</code>
       */
      public Builder clearValues() {
        values_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:tensorflow.contrib.rpc.TestCase)
    }

    // @@protoc_insertion_point(class_scope:tensorflow.contrib.rpc.TestCase)
    private static final tensorflow.contrib.rpc.TestExample.TestCase DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new tensorflow.contrib.rpc.TestExample.TestCase();
    }

    public static tensorflow.contrib.rpc.TestExample.TestCase getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<TestCase>
        PARSER = new com.google.protobuf.AbstractParser<TestCase>() {
      @java.lang.Override
      public TestCase parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TestCase(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TestCase> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TestCase> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public tensorflow.contrib.rpc.TestExample.TestCase getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_contrib_rpc_TestCase_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_contrib_rpc_TestCase_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022test_example.proto\022\026tensorflow.contrib" +
      ".rpc\"\032\n\010TestCase\022\016\n\006values\030\001 \003(\0052\352\003\n\017Tes" +
      "tCaseService\022Q\n\tIncrement\022 .tensorflow.c" +
      "ontrib.rpc.TestCase\032 .tensorflow.contrib" +
      ".rpc.TestCase\"\000\022T\n\014SleepForever\022 .tensor" +
      "flow.contrib.rpc.TestCase\032 .tensorflow.c" +
      "ontrib.rpc.TestCase\"\000\022]\n\025SometimesSleepF" +
      "orever\022 .tensorflow.contrib.rpc.TestCase" +
      "\032 .tensorflow.contrib.rpc.TestCase\"\000\022e\n\035" +
      "AlwaysFailWithInvalidArgument\022 .tensorfl" +
      "ow.contrib.rpc.TestCase\032 .tensorflow.con" +
      "trib.rpc.TestCase\"\000\022h\n SometimesFailWith" +
      "InvalidArgument\022 .tensorflow.contrib.rpc" +
      ".TestCase\032 .tensorflow.contrib.rpc.TestC" +
      "ase\"\000"
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
        }, assigner);
    internal_static_tensorflow_contrib_rpc_TestCase_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_contrib_rpc_TestCase_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_contrib_rpc_TestCase_descriptor,
        new java.lang.String[] { "Values", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
