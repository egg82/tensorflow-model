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

/**
 * <pre>
 * Gives the complete membership of the group identified by group_key.
 * </pre>
 *
 * Protobuf type {@code tensorflow.CompleteGroupResponse}
 */
public  final class CompleteGroupResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.CompleteGroupResponse)
    CompleteGroupResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CompleteGroupResponse.newBuilder() to construct.
  private CompleteGroupResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CompleteGroupResponse() {
    groupKey_ = 0;
    groupSize_ = 0;
    deviceType_ = "";
    numTasks_ = 0;
    deviceName_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    taskName_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CompleteGroupResponse(
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

            groupKey_ = input.readInt32();
            break;
          }
          case 16: {

            groupSize_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            deviceType_ = s;
            break;
          }
          case 32: {

            numTasks_ = input.readInt32();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
              deviceName_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000010;
            }
            deviceName_.add(s);
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
              taskName_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000020;
            }
            taskName_.add(s);
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
      if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
        deviceName_ = deviceName_.getUnmodifiableView();
      }
      if (((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
        taskName_ = taskName_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.distruntime.WorkerProtos.internal_static_tensorflow_CompleteGroupResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.distruntime.WorkerProtos.internal_static_tensorflow_CompleteGroupResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.distruntime.CompleteGroupResponse.class, org.tensorflow.distruntime.CompleteGroupResponse.Builder.class);
  }

  private int bitField0_;
  public static final int GROUP_KEY_FIELD_NUMBER = 1;
  private int groupKey_;
  /**
   * <code>int32 group_key = 1;</code>
   */
  public int getGroupKey() {
    return groupKey_;
  }

  public static final int GROUP_SIZE_FIELD_NUMBER = 2;
  private int groupSize_;
  /**
   * <code>int32 group_size = 2;</code>
   */
  public int getGroupSize() {
    return groupSize_;
  }

  public static final int DEVICE_TYPE_FIELD_NUMBER = 3;
  private volatile java.lang.Object deviceType_;
  /**
   * <code>string device_type = 3;</code>
   */
  public java.lang.String getDeviceType() {
    java.lang.Object ref = deviceType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deviceType_ = s;
      return s;
    }
  }
  /**
   * <code>string device_type = 3;</code>
   */
  public com.google.protobuf.ByteString
      getDeviceTypeBytes() {
    java.lang.Object ref = deviceType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      deviceType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NUM_TASKS_FIELD_NUMBER = 4;
  private int numTasks_;
  /**
   * <pre>
   * number of distinct tasks hosting the devices
   * </pre>
   *
   * <code>int32 num_tasks = 4;</code>
   */
  public int getNumTasks() {
    return numTasks_;
  }

  public static final int DEVICE_NAME_FIELD_NUMBER = 5;
  private com.google.protobuf.LazyStringList deviceName_;
  /**
   * <code>repeated string device_name = 5;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getDeviceNameList() {
    return deviceName_;
  }
  /**
   * <code>repeated string device_name = 5;</code>
   */
  public int getDeviceNameCount() {
    return deviceName_.size();
  }
  /**
   * <code>repeated string device_name = 5;</code>
   */
  public java.lang.String getDeviceName(int index) {
    return deviceName_.get(index);
  }
  /**
   * <code>repeated string device_name = 5;</code>
   */
  public com.google.protobuf.ByteString
      getDeviceNameBytes(int index) {
    return deviceName_.getByteString(index);
  }

  public static final int TASK_NAME_FIELD_NUMBER = 6;
  private com.google.protobuf.LazyStringList taskName_;
  /**
   * <pre>
   * task name prefixes of device_names
   * </pre>
   *
   * <code>repeated string task_name = 6;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getTaskNameList() {
    return taskName_;
  }
  /**
   * <pre>
   * task name prefixes of device_names
   * </pre>
   *
   * <code>repeated string task_name = 6;</code>
   */
  public int getTaskNameCount() {
    return taskName_.size();
  }
  /**
   * <pre>
   * task name prefixes of device_names
   * </pre>
   *
   * <code>repeated string task_name = 6;</code>
   */
  public java.lang.String getTaskName(int index) {
    return taskName_.get(index);
  }
  /**
   * <pre>
   * task name prefixes of device_names
   * </pre>
   *
   * <code>repeated string task_name = 6;</code>
   */
  public com.google.protobuf.ByteString
      getTaskNameBytes(int index) {
    return taskName_.getByteString(index);
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
    if (groupKey_ != 0) {
      output.writeInt32(1, groupKey_);
    }
    if (groupSize_ != 0) {
      output.writeInt32(2, groupSize_);
    }
    if (!getDeviceTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, deviceType_);
    }
    if (numTasks_ != 0) {
      output.writeInt32(4, numTasks_);
    }
    for (int i = 0; i < deviceName_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, deviceName_.getRaw(i));
    }
    for (int i = 0; i < taskName_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, taskName_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (groupKey_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, groupKey_);
    }
    if (groupSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, groupSize_);
    }
    if (!getDeviceTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, deviceType_);
    }
    if (numTasks_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, numTasks_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < deviceName_.size(); i++) {
        dataSize += computeStringSizeNoTag(deviceName_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getDeviceNameList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < taskName_.size(); i++) {
        dataSize += computeStringSizeNoTag(taskName_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getTaskNameList().size();
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
    if (!(obj instanceof org.tensorflow.distruntime.CompleteGroupResponse)) {
      return super.equals(obj);
    }
    org.tensorflow.distruntime.CompleteGroupResponse other = (org.tensorflow.distruntime.CompleteGroupResponse) obj;

    boolean result = true;
    result = result && (getGroupKey()
        == other.getGroupKey());
    result = result && (getGroupSize()
        == other.getGroupSize());
    result = result && getDeviceType()
        .equals(other.getDeviceType());
    result = result && (getNumTasks()
        == other.getNumTasks());
    result = result && getDeviceNameList()
        .equals(other.getDeviceNameList());
    result = result && getTaskNameList()
        .equals(other.getTaskNameList());
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
    hash = (37 * hash) + GROUP_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getGroupKey();
    hash = (37 * hash) + GROUP_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getGroupSize();
    hash = (37 * hash) + DEVICE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getDeviceType().hashCode();
    hash = (37 * hash) + NUM_TASKS_FIELD_NUMBER;
    hash = (53 * hash) + getNumTasks();
    if (getDeviceNameCount() > 0) {
      hash = (37 * hash) + DEVICE_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getDeviceNameList().hashCode();
    }
    if (getTaskNameCount() > 0) {
      hash = (37 * hash) + TASK_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getTaskNameList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.distruntime.CompleteGroupResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.CompleteGroupResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.CompleteGroupResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.CompleteGroupResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.CompleteGroupResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.CompleteGroupResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.CompleteGroupResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.CompleteGroupResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.distruntime.CompleteGroupResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.CompleteGroupResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.distruntime.CompleteGroupResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.CompleteGroupResponse parseFrom(
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
  public static Builder newBuilder(org.tensorflow.distruntime.CompleteGroupResponse prototype) {
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
   * Gives the complete membership of the group identified by group_key.
   * </pre>
   *
   * Protobuf type {@code tensorflow.CompleteGroupResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.CompleteGroupResponse)
      org.tensorflow.distruntime.CompleteGroupResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.distruntime.WorkerProtos.internal_static_tensorflow_CompleteGroupResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.distruntime.WorkerProtos.internal_static_tensorflow_CompleteGroupResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.distruntime.CompleteGroupResponse.class, org.tensorflow.distruntime.CompleteGroupResponse.Builder.class);
    }

    // Construct using org.tensorflow.distruntime.CompleteGroupResponse.newBuilder()
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
      groupKey_ = 0;

      groupSize_ = 0;

      deviceType_ = "";

      numTasks_ = 0;

      deviceName_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000010);
      taskName_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000020);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.distruntime.WorkerProtos.internal_static_tensorflow_CompleteGroupResponse_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.distruntime.CompleteGroupResponse getDefaultInstanceForType() {
      return org.tensorflow.distruntime.CompleteGroupResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.distruntime.CompleteGroupResponse build() {
      org.tensorflow.distruntime.CompleteGroupResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.distruntime.CompleteGroupResponse buildPartial() {
      org.tensorflow.distruntime.CompleteGroupResponse result = new org.tensorflow.distruntime.CompleteGroupResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.groupKey_ = groupKey_;
      result.groupSize_ = groupSize_;
      result.deviceType_ = deviceType_;
      result.numTasks_ = numTasks_;
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        deviceName_ = deviceName_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000010);
      }
      result.deviceName_ = deviceName_;
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        taskName_ = taskName_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000020);
      }
      result.taskName_ = taskName_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof org.tensorflow.distruntime.CompleteGroupResponse) {
        return mergeFrom((org.tensorflow.distruntime.CompleteGroupResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.distruntime.CompleteGroupResponse other) {
      if (other == org.tensorflow.distruntime.CompleteGroupResponse.getDefaultInstance()) return this;
      if (other.getGroupKey() != 0) {
        setGroupKey(other.getGroupKey());
      }
      if (other.getGroupSize() != 0) {
        setGroupSize(other.getGroupSize());
      }
      if (!other.getDeviceType().isEmpty()) {
        deviceType_ = other.deviceType_;
        onChanged();
      }
      if (other.getNumTasks() != 0) {
        setNumTasks(other.getNumTasks());
      }
      if (!other.deviceName_.isEmpty()) {
        if (deviceName_.isEmpty()) {
          deviceName_ = other.deviceName_;
          bitField0_ = (bitField0_ & ~0x00000010);
        } else {
          ensureDeviceNameIsMutable();
          deviceName_.addAll(other.deviceName_);
        }
        onChanged();
      }
      if (!other.taskName_.isEmpty()) {
        if (taskName_.isEmpty()) {
          taskName_ = other.taskName_;
          bitField0_ = (bitField0_ & ~0x00000020);
        } else {
          ensureTaskNameIsMutable();
          taskName_.addAll(other.taskName_);
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
      org.tensorflow.distruntime.CompleteGroupResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.distruntime.CompleteGroupResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int groupKey_ ;
    /**
     * <code>int32 group_key = 1;</code>
     */
    public int getGroupKey() {
      return groupKey_;
    }
    /**
     * <code>int32 group_key = 1;</code>
     */
    public Builder setGroupKey(int value) {
      
      groupKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 group_key = 1;</code>
     */
    public Builder clearGroupKey() {
      
      groupKey_ = 0;
      onChanged();
      return this;
    }

    private int groupSize_ ;
    /**
     * <code>int32 group_size = 2;</code>
     */
    public int getGroupSize() {
      return groupSize_;
    }
    /**
     * <code>int32 group_size = 2;</code>
     */
    public Builder setGroupSize(int value) {
      
      groupSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 group_size = 2;</code>
     */
    public Builder clearGroupSize() {
      
      groupSize_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object deviceType_ = "";
    /**
     * <code>string device_type = 3;</code>
     */
    public java.lang.String getDeviceType() {
      java.lang.Object ref = deviceType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deviceType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string device_type = 3;</code>
     */
    public com.google.protobuf.ByteString
        getDeviceTypeBytes() {
      java.lang.Object ref = deviceType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deviceType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string device_type = 3;</code>
     */
    public Builder setDeviceType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      deviceType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string device_type = 3;</code>
     */
    public Builder clearDeviceType() {
      
      deviceType_ = getDefaultInstance().getDeviceType();
      onChanged();
      return this;
    }
    /**
     * <code>string device_type = 3;</code>
     */
    public Builder setDeviceTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      deviceType_ = value;
      onChanged();
      return this;
    }

    private int numTasks_ ;
    /**
     * <pre>
     * number of distinct tasks hosting the devices
     * </pre>
     *
     * <code>int32 num_tasks = 4;</code>
     */
    public int getNumTasks() {
      return numTasks_;
    }
    /**
     * <pre>
     * number of distinct tasks hosting the devices
     * </pre>
     *
     * <code>int32 num_tasks = 4;</code>
     */
    public Builder setNumTasks(int value) {
      
      numTasks_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * number of distinct tasks hosting the devices
     * </pre>
     *
     * <code>int32 num_tasks = 4;</code>
     */
    public Builder clearNumTasks() {
      
      numTasks_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList deviceName_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureDeviceNameIsMutable() {
      if (!((bitField0_ & 0x00000010) == 0x00000010)) {
        deviceName_ = new com.google.protobuf.LazyStringArrayList(deviceName_);
        bitField0_ |= 0x00000010;
       }
    }
    /**
     * <code>repeated string device_name = 5;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getDeviceNameList() {
      return deviceName_.getUnmodifiableView();
    }
    /**
     * <code>repeated string device_name = 5;</code>
     */
    public int getDeviceNameCount() {
      return deviceName_.size();
    }
    /**
     * <code>repeated string device_name = 5;</code>
     */
    public java.lang.String getDeviceName(int index) {
      return deviceName_.get(index);
    }
    /**
     * <code>repeated string device_name = 5;</code>
     */
    public com.google.protobuf.ByteString
        getDeviceNameBytes(int index) {
      return deviceName_.getByteString(index);
    }
    /**
     * <code>repeated string device_name = 5;</code>
     */
    public Builder setDeviceName(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureDeviceNameIsMutable();
      deviceName_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string device_name = 5;</code>
     */
    public Builder addDeviceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureDeviceNameIsMutable();
      deviceName_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string device_name = 5;</code>
     */
    public Builder addAllDeviceName(
        java.lang.Iterable<java.lang.String> values) {
      ensureDeviceNameIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, deviceName_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string device_name = 5;</code>
     */
    public Builder clearDeviceName() {
      deviceName_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string device_name = 5;</code>
     */
    public Builder addDeviceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureDeviceNameIsMutable();
      deviceName_.add(value);
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList taskName_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureTaskNameIsMutable() {
      if (!((bitField0_ & 0x00000020) == 0x00000020)) {
        taskName_ = new com.google.protobuf.LazyStringArrayList(taskName_);
        bitField0_ |= 0x00000020;
       }
    }
    /**
     * <pre>
     * task name prefixes of device_names
     * </pre>
     *
     * <code>repeated string task_name = 6;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getTaskNameList() {
      return taskName_.getUnmodifiableView();
    }
    /**
     * <pre>
     * task name prefixes of device_names
     * </pre>
     *
     * <code>repeated string task_name = 6;</code>
     */
    public int getTaskNameCount() {
      return taskName_.size();
    }
    /**
     * <pre>
     * task name prefixes of device_names
     * </pre>
     *
     * <code>repeated string task_name = 6;</code>
     */
    public java.lang.String getTaskName(int index) {
      return taskName_.get(index);
    }
    /**
     * <pre>
     * task name prefixes of device_names
     * </pre>
     *
     * <code>repeated string task_name = 6;</code>
     */
    public com.google.protobuf.ByteString
        getTaskNameBytes(int index) {
      return taskName_.getByteString(index);
    }
    /**
     * <pre>
     * task name prefixes of device_names
     * </pre>
     *
     * <code>repeated string task_name = 6;</code>
     */
    public Builder setTaskName(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTaskNameIsMutable();
      taskName_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * task name prefixes of device_names
     * </pre>
     *
     * <code>repeated string task_name = 6;</code>
     */
    public Builder addTaskName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTaskNameIsMutable();
      taskName_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * task name prefixes of device_names
     * </pre>
     *
     * <code>repeated string task_name = 6;</code>
     */
    public Builder addAllTaskName(
        java.lang.Iterable<java.lang.String> values) {
      ensureTaskNameIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, taskName_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * task name prefixes of device_names
     * </pre>
     *
     * <code>repeated string task_name = 6;</code>
     */
    public Builder clearTaskName() {
      taskName_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000020);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * task name prefixes of device_names
     * </pre>
     *
     * <code>repeated string task_name = 6;</code>
     */
    public Builder addTaskNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureTaskNameIsMutable();
      taskName_.add(value);
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.CompleteGroupResponse)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.CompleteGroupResponse)
  private static final org.tensorflow.distruntime.CompleteGroupResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.distruntime.CompleteGroupResponse();
  }

  public static org.tensorflow.distruntime.CompleteGroupResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CompleteGroupResponse>
      PARSER = new com.google.protobuf.AbstractParser<CompleteGroupResponse>() {
    @java.lang.Override
    public CompleteGroupResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CompleteGroupResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CompleteGroupResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CompleteGroupResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.distruntime.CompleteGroupResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

