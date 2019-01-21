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
// source: log_memory.proto

package org.tensorflow.framework;

/**
 * Protobuf type {@code tensorflow.MemoryLogTensorOutput}
 */
public  final class MemoryLogTensorOutput extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.MemoryLogTensorOutput)
    MemoryLogTensorOutputOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MemoryLogTensorOutput.newBuilder() to construct.
  private MemoryLogTensorOutput(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MemoryLogTensorOutput() {
    stepId_ = 0L;
    kernelName_ = "";
    index_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MemoryLogTensorOutput(
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

            stepId_ = input.readInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            kernelName_ = s;
            break;
          }
          case 24: {

            index_ = input.readInt32();
            break;
          }
          case 34: {
            org.tensorflow.framework.TensorDescription.Builder subBuilder = null;
            if (tensor_ != null) {
              subBuilder = tensor_.toBuilder();
            }
            tensor_ = input.readMessage(org.tensorflow.framework.TensorDescription.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(tensor_);
              tensor_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.framework.LogMemoryProtos.internal_static_tensorflow_MemoryLogTensorOutput_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.framework.LogMemoryProtos.internal_static_tensorflow_MemoryLogTensorOutput_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.framework.MemoryLogTensorOutput.class, org.tensorflow.framework.MemoryLogTensorOutput.Builder.class);
  }

  public static final int STEP_ID_FIELD_NUMBER = 1;
  private long stepId_;
  /**
   * <pre>
   * Process-unique step id.
   * </pre>
   *
   * <code>int64 step_id = 1;</code>
   */
  public long getStepId() {
    return stepId_;
  }

  public static final int KERNEL_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object kernelName_;
  /**
   * <pre>
   * Name of the kernel producing an output as set in GraphDef, e.g.,
   * "affine2/weights/Assign".
   * </pre>
   *
   * <code>string kernel_name = 2;</code>
   */
  public java.lang.String getKernelName() {
    java.lang.Object ref = kernelName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      kernelName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of the kernel producing an output as set in GraphDef, e.g.,
   * "affine2/weights/Assign".
   * </pre>
   *
   * <code>string kernel_name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getKernelNameBytes() {
    java.lang.Object ref = kernelName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      kernelName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INDEX_FIELD_NUMBER = 3;
  private int index_;
  /**
   * <pre>
   * Index of the output being set.
   * </pre>
   *
   * <code>int32 index = 3;</code>
   */
  public int getIndex() {
    return index_;
  }

  public static final int TENSOR_FIELD_NUMBER = 4;
  private org.tensorflow.framework.TensorDescription tensor_;
  /**
   * <pre>
   * Output tensor details.
   * </pre>
   *
   * <code>.tensorflow.TensorDescription tensor = 4;</code>
   */
  public boolean hasTensor() {
    return tensor_ != null;
  }
  /**
   * <pre>
   * Output tensor details.
   * </pre>
   *
   * <code>.tensorflow.TensorDescription tensor = 4;</code>
   */
  public org.tensorflow.framework.TensorDescription getTensor() {
    return tensor_ == null ? org.tensorflow.framework.TensorDescription.getDefaultInstance() : tensor_;
  }
  /**
   * <pre>
   * Output tensor details.
   * </pre>
   *
   * <code>.tensorflow.TensorDescription tensor = 4;</code>
   */
  public org.tensorflow.framework.TensorDescriptionOrBuilder getTensorOrBuilder() {
    return getTensor();
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
    if (stepId_ != 0L) {
      output.writeInt64(1, stepId_);
    }
    if (!getKernelNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, kernelName_);
    }
    if (index_ != 0) {
      output.writeInt32(3, index_);
    }
    if (tensor_ != null) {
      output.writeMessage(4, getTensor());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (stepId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, stepId_);
    }
    if (!getKernelNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, kernelName_);
    }
    if (index_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, index_);
    }
    if (tensor_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getTensor());
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
    if (!(obj instanceof org.tensorflow.framework.MemoryLogTensorOutput)) {
      return super.equals(obj);
    }
    org.tensorflow.framework.MemoryLogTensorOutput other = (org.tensorflow.framework.MemoryLogTensorOutput) obj;

    boolean result = true;
    result = result && (getStepId()
        == other.getStepId());
    result = result && getKernelName()
        .equals(other.getKernelName());
    result = result && (getIndex()
        == other.getIndex());
    result = result && (hasTensor() == other.hasTensor());
    if (hasTensor()) {
      result = result && getTensor()
          .equals(other.getTensor());
    }
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
    hash = (37 * hash) + STEP_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStepId());
    hash = (37 * hash) + KERNEL_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getKernelName().hashCode();
    hash = (37 * hash) + INDEX_FIELD_NUMBER;
    hash = (53 * hash) + getIndex();
    if (hasTensor()) {
      hash = (37 * hash) + TENSOR_FIELD_NUMBER;
      hash = (53 * hash) + getTensor().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.framework.MemoryLogTensorOutput parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.MemoryLogTensorOutput parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.MemoryLogTensorOutput parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.MemoryLogTensorOutput parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.MemoryLogTensorOutput parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.MemoryLogTensorOutput parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.MemoryLogTensorOutput parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.MemoryLogTensorOutput parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.MemoryLogTensorOutput parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.MemoryLogTensorOutput parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.MemoryLogTensorOutput parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.MemoryLogTensorOutput parseFrom(
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
  public static Builder newBuilder(org.tensorflow.framework.MemoryLogTensorOutput prototype) {
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
   * Protobuf type {@code tensorflow.MemoryLogTensorOutput}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.MemoryLogTensorOutput)
      org.tensorflow.framework.MemoryLogTensorOutputOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.framework.LogMemoryProtos.internal_static_tensorflow_MemoryLogTensorOutput_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.framework.LogMemoryProtos.internal_static_tensorflow_MemoryLogTensorOutput_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.framework.MemoryLogTensorOutput.class, org.tensorflow.framework.MemoryLogTensorOutput.Builder.class);
    }

    // Construct using org.tensorflow.framework.MemoryLogTensorOutput.newBuilder()
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
      stepId_ = 0L;

      kernelName_ = "";

      index_ = 0;

      if (tensorBuilder_ == null) {
        tensor_ = null;
      } else {
        tensor_ = null;
        tensorBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.framework.LogMemoryProtos.internal_static_tensorflow_MemoryLogTensorOutput_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.framework.MemoryLogTensorOutput getDefaultInstanceForType() {
      return org.tensorflow.framework.MemoryLogTensorOutput.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.framework.MemoryLogTensorOutput build() {
      org.tensorflow.framework.MemoryLogTensorOutput result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.framework.MemoryLogTensorOutput buildPartial() {
      org.tensorflow.framework.MemoryLogTensorOutput result = new org.tensorflow.framework.MemoryLogTensorOutput(this);
      result.stepId_ = stepId_;
      result.kernelName_ = kernelName_;
      result.index_ = index_;
      if (tensorBuilder_ == null) {
        result.tensor_ = tensor_;
      } else {
        result.tensor_ = tensorBuilder_.build();
      }
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
      if (other instanceof org.tensorflow.framework.MemoryLogTensorOutput) {
        return mergeFrom((org.tensorflow.framework.MemoryLogTensorOutput)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.framework.MemoryLogTensorOutput other) {
      if (other == org.tensorflow.framework.MemoryLogTensorOutput.getDefaultInstance()) return this;
      if (other.getStepId() != 0L) {
        setStepId(other.getStepId());
      }
      if (!other.getKernelName().isEmpty()) {
        kernelName_ = other.kernelName_;
        onChanged();
      }
      if (other.getIndex() != 0) {
        setIndex(other.getIndex());
      }
      if (other.hasTensor()) {
        mergeTensor(other.getTensor());
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
      org.tensorflow.framework.MemoryLogTensorOutput parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.framework.MemoryLogTensorOutput) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long stepId_ ;
    /**
     * <pre>
     * Process-unique step id.
     * </pre>
     *
     * <code>int64 step_id = 1;</code>
     */
    public long getStepId() {
      return stepId_;
    }
    /**
     * <pre>
     * Process-unique step id.
     * </pre>
     *
     * <code>int64 step_id = 1;</code>
     */
    public Builder setStepId(long value) {
      
      stepId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Process-unique step id.
     * </pre>
     *
     * <code>int64 step_id = 1;</code>
     */
    public Builder clearStepId() {
      
      stepId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object kernelName_ = "";
    /**
     * <pre>
     * Name of the kernel producing an output as set in GraphDef, e.g.,
     * "affine2/weights/Assign".
     * </pre>
     *
     * <code>string kernel_name = 2;</code>
     */
    public java.lang.String getKernelName() {
      java.lang.Object ref = kernelName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        kernelName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Name of the kernel producing an output as set in GraphDef, e.g.,
     * "affine2/weights/Assign".
     * </pre>
     *
     * <code>string kernel_name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getKernelNameBytes() {
      java.lang.Object ref = kernelName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        kernelName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name of the kernel producing an output as set in GraphDef, e.g.,
     * "affine2/weights/Assign".
     * </pre>
     *
     * <code>string kernel_name = 2;</code>
     */
    public Builder setKernelName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      kernelName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the kernel producing an output as set in GraphDef, e.g.,
     * "affine2/weights/Assign".
     * </pre>
     *
     * <code>string kernel_name = 2;</code>
     */
    public Builder clearKernelName() {
      
      kernelName_ = getDefaultInstance().getKernelName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the kernel producing an output as set in GraphDef, e.g.,
     * "affine2/weights/Assign".
     * </pre>
     *
     * <code>string kernel_name = 2;</code>
     */
    public Builder setKernelNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      kernelName_ = value;
      onChanged();
      return this;
    }

    private int index_ ;
    /**
     * <pre>
     * Index of the output being set.
     * </pre>
     *
     * <code>int32 index = 3;</code>
     */
    public int getIndex() {
      return index_;
    }
    /**
     * <pre>
     * Index of the output being set.
     * </pre>
     *
     * <code>int32 index = 3;</code>
     */
    public Builder setIndex(int value) {
      
      index_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Index of the output being set.
     * </pre>
     *
     * <code>int32 index = 3;</code>
     */
    public Builder clearIndex() {
      
      index_ = 0;
      onChanged();
      return this;
    }

    private org.tensorflow.framework.TensorDescription tensor_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.framework.TensorDescription, org.tensorflow.framework.TensorDescription.Builder, org.tensorflow.framework.TensorDescriptionOrBuilder> tensorBuilder_;
    /**
     * <pre>
     * Output tensor details.
     * </pre>
     *
     * <code>.tensorflow.TensorDescription tensor = 4;</code>
     */
    public boolean hasTensor() {
      return tensorBuilder_ != null || tensor_ != null;
    }
    /**
     * <pre>
     * Output tensor details.
     * </pre>
     *
     * <code>.tensorflow.TensorDescription tensor = 4;</code>
     */
    public org.tensorflow.framework.TensorDescription getTensor() {
      if (tensorBuilder_ == null) {
        return tensor_ == null ? org.tensorflow.framework.TensorDescription.getDefaultInstance() : tensor_;
      } else {
        return tensorBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Output tensor details.
     * </pre>
     *
     * <code>.tensorflow.TensorDescription tensor = 4;</code>
     */
    public Builder setTensor(org.tensorflow.framework.TensorDescription value) {
      if (tensorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tensor_ = value;
        onChanged();
      } else {
        tensorBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Output tensor details.
     * </pre>
     *
     * <code>.tensorflow.TensorDescription tensor = 4;</code>
     */
    public Builder setTensor(
        org.tensorflow.framework.TensorDescription.Builder builderForValue) {
      if (tensorBuilder_ == null) {
        tensor_ = builderForValue.build();
        onChanged();
      } else {
        tensorBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Output tensor details.
     * </pre>
     *
     * <code>.tensorflow.TensorDescription tensor = 4;</code>
     */
    public Builder mergeTensor(org.tensorflow.framework.TensorDescription value) {
      if (tensorBuilder_ == null) {
        if (tensor_ != null) {
          tensor_ =
            org.tensorflow.framework.TensorDescription.newBuilder(tensor_).mergeFrom(value).buildPartial();
        } else {
          tensor_ = value;
        }
        onChanged();
      } else {
        tensorBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Output tensor details.
     * </pre>
     *
     * <code>.tensorflow.TensorDescription tensor = 4;</code>
     */
    public Builder clearTensor() {
      if (tensorBuilder_ == null) {
        tensor_ = null;
        onChanged();
      } else {
        tensor_ = null;
        tensorBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Output tensor details.
     * </pre>
     *
     * <code>.tensorflow.TensorDescription tensor = 4;</code>
     */
    public org.tensorflow.framework.TensorDescription.Builder getTensorBuilder() {
      
      onChanged();
      return getTensorFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Output tensor details.
     * </pre>
     *
     * <code>.tensorflow.TensorDescription tensor = 4;</code>
     */
    public org.tensorflow.framework.TensorDescriptionOrBuilder getTensorOrBuilder() {
      if (tensorBuilder_ != null) {
        return tensorBuilder_.getMessageOrBuilder();
      } else {
        return tensor_ == null ?
            org.tensorflow.framework.TensorDescription.getDefaultInstance() : tensor_;
      }
    }
    /**
     * <pre>
     * Output tensor details.
     * </pre>
     *
     * <code>.tensorflow.TensorDescription tensor = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.framework.TensorDescription, org.tensorflow.framework.TensorDescription.Builder, org.tensorflow.framework.TensorDescriptionOrBuilder> 
        getTensorFieldBuilder() {
      if (tensorBuilder_ == null) {
        tensorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.framework.TensorDescription, org.tensorflow.framework.TensorDescription.Builder, org.tensorflow.framework.TensorDescriptionOrBuilder>(
                getTensor(),
                getParentForChildren(),
                isClean());
        tensor_ = null;
      }
      return tensorBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:tensorflow.MemoryLogTensorOutput)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.MemoryLogTensorOutput)
  private static final org.tensorflow.framework.MemoryLogTensorOutput DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.framework.MemoryLogTensorOutput();
  }

  public static org.tensorflow.framework.MemoryLogTensorOutput getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MemoryLogTensorOutput>
      PARSER = new com.google.protobuf.AbstractParser<MemoryLogTensorOutput>() {
    @java.lang.Override
    public MemoryLogTensorOutput parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MemoryLogTensorOutput(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MemoryLogTensorOutput> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MemoryLogTensorOutput> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.framework.MemoryLogTensorOutput getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

