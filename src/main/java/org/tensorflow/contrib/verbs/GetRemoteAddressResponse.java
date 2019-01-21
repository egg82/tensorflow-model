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
// source: verbs_service.proto

package org.tensorflow.contrib.verbs;

/**
 * Protobuf type {@code tensorflow.GetRemoteAddressResponse}
 */
public  final class GetRemoteAddressResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.GetRemoteAddressResponse)
    GetRemoteAddressResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetRemoteAddressResponse.newBuilder() to construct.
  private GetRemoteAddressResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetRemoteAddressResponse() {
    hostName_ = "";
    mr_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetRemoteAddressResponse(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            hostName_ = s;
            break;
          }
          case 18: {
            org.tensorflow.contrib.verbs.Channel.Builder subBuilder = null;
            if (channel_ != null) {
              subBuilder = channel_.toBuilder();
            }
            channel_ = input.readMessage(org.tensorflow.contrib.verbs.Channel.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(channel_);
              channel_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              mr_ = new java.util.ArrayList<org.tensorflow.contrib.verbs.MemoryRegion>();
              mutable_bitField0_ |= 0x00000004;
            }
            mr_.add(
                input.readMessage(org.tensorflow.contrib.verbs.MemoryRegion.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        mr_ = java.util.Collections.unmodifiableList(mr_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.contrib.verbs.VerbsServiceProtos.internal_static_tensorflow_GetRemoteAddressResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.contrib.verbs.VerbsServiceProtos.internal_static_tensorflow_GetRemoteAddressResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.contrib.verbs.GetRemoteAddressResponse.class, org.tensorflow.contrib.verbs.GetRemoteAddressResponse.Builder.class);
  }

  private int bitField0_;
  public static final int HOST_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object hostName_;
  /**
   * <code>string host_name = 1;</code>
   */
  public java.lang.String getHostName() {
    java.lang.Object ref = hostName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hostName_ = s;
      return s;
    }
  }
  /**
   * <code>string host_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getHostNameBytes() {
    java.lang.Object ref = hostName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hostName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CHANNEL_FIELD_NUMBER = 2;
  private org.tensorflow.contrib.verbs.Channel channel_;
  /**
   * <code>.tensorflow.Channel channel = 2;</code>
   */
  public boolean hasChannel() {
    return channel_ != null;
  }
  /**
   * <code>.tensorflow.Channel channel = 2;</code>
   */
  public org.tensorflow.contrib.verbs.Channel getChannel() {
    return channel_ == null ? org.tensorflow.contrib.verbs.Channel.getDefaultInstance() : channel_;
  }
  /**
   * <code>.tensorflow.Channel channel = 2;</code>
   */
  public org.tensorflow.contrib.verbs.ChannelOrBuilder getChannelOrBuilder() {
    return getChannel();
  }

  public static final int MR_FIELD_NUMBER = 3;
  private java.util.List<org.tensorflow.contrib.verbs.MemoryRegion> mr_;
  /**
   * <code>repeated .tensorflow.MemoryRegion mr = 3;</code>
   */
  public java.util.List<org.tensorflow.contrib.verbs.MemoryRegion> getMrList() {
    return mr_;
  }
  /**
   * <code>repeated .tensorflow.MemoryRegion mr = 3;</code>
   */
  public java.util.List<? extends org.tensorflow.contrib.verbs.MemoryRegionOrBuilder> 
      getMrOrBuilderList() {
    return mr_;
  }
  /**
   * <code>repeated .tensorflow.MemoryRegion mr = 3;</code>
   */
  public int getMrCount() {
    return mr_.size();
  }
  /**
   * <code>repeated .tensorflow.MemoryRegion mr = 3;</code>
   */
  public org.tensorflow.contrib.verbs.MemoryRegion getMr(int index) {
    return mr_.get(index);
  }
  /**
   * <code>repeated .tensorflow.MemoryRegion mr = 3;</code>
   */
  public org.tensorflow.contrib.verbs.MemoryRegionOrBuilder getMrOrBuilder(
      int index) {
    return mr_.get(index);
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
    if (!getHostNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, hostName_);
    }
    if (channel_ != null) {
      output.writeMessage(2, getChannel());
    }
    for (int i = 0; i < mr_.size(); i++) {
      output.writeMessage(3, mr_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getHostNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, hostName_);
    }
    if (channel_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getChannel());
    }
    for (int i = 0; i < mr_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, mr_.get(i));
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
    if (!(obj instanceof org.tensorflow.contrib.verbs.GetRemoteAddressResponse)) {
      return super.equals(obj);
    }
    org.tensorflow.contrib.verbs.GetRemoteAddressResponse other = (org.tensorflow.contrib.verbs.GetRemoteAddressResponse) obj;

    boolean result = true;
    result = result && getHostName()
        .equals(other.getHostName());
    result = result && (hasChannel() == other.hasChannel());
    if (hasChannel()) {
      result = result && getChannel()
          .equals(other.getChannel());
    }
    result = result && getMrList()
        .equals(other.getMrList());
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
    hash = (37 * hash) + HOST_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getHostName().hashCode();
    if (hasChannel()) {
      hash = (37 * hash) + CHANNEL_FIELD_NUMBER;
      hash = (53 * hash) + getChannel().hashCode();
    }
    if (getMrCount() > 0) {
      hash = (37 * hash) + MR_FIELD_NUMBER;
      hash = (53 * hash) + getMrList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.contrib.verbs.GetRemoteAddressResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.contrib.verbs.GetRemoteAddressResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.contrib.verbs.GetRemoteAddressResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.contrib.verbs.GetRemoteAddressResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.contrib.verbs.GetRemoteAddressResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.contrib.verbs.GetRemoteAddressResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.contrib.verbs.GetRemoteAddressResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.contrib.verbs.GetRemoteAddressResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.contrib.verbs.GetRemoteAddressResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.contrib.verbs.GetRemoteAddressResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.contrib.verbs.GetRemoteAddressResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.contrib.verbs.GetRemoteAddressResponse parseFrom(
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
  public static Builder newBuilder(org.tensorflow.contrib.verbs.GetRemoteAddressResponse prototype) {
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
   * Protobuf type {@code tensorflow.GetRemoteAddressResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.GetRemoteAddressResponse)
      org.tensorflow.contrib.verbs.GetRemoteAddressResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.contrib.verbs.VerbsServiceProtos.internal_static_tensorflow_GetRemoteAddressResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.contrib.verbs.VerbsServiceProtos.internal_static_tensorflow_GetRemoteAddressResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.contrib.verbs.GetRemoteAddressResponse.class, org.tensorflow.contrib.verbs.GetRemoteAddressResponse.Builder.class);
    }

    // Construct using org.tensorflow.contrib.verbs.GetRemoteAddressResponse.newBuilder()
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
        getMrFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      hostName_ = "";

      if (channelBuilder_ == null) {
        channel_ = null;
      } else {
        channel_ = null;
        channelBuilder_ = null;
      }
      if (mrBuilder_ == null) {
        mr_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        mrBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.contrib.verbs.VerbsServiceProtos.internal_static_tensorflow_GetRemoteAddressResponse_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.contrib.verbs.GetRemoteAddressResponse getDefaultInstanceForType() {
      return org.tensorflow.contrib.verbs.GetRemoteAddressResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.contrib.verbs.GetRemoteAddressResponse build() {
      org.tensorflow.contrib.verbs.GetRemoteAddressResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.contrib.verbs.GetRemoteAddressResponse buildPartial() {
      org.tensorflow.contrib.verbs.GetRemoteAddressResponse result = new org.tensorflow.contrib.verbs.GetRemoteAddressResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.hostName_ = hostName_;
      if (channelBuilder_ == null) {
        result.channel_ = channel_;
      } else {
        result.channel_ = channelBuilder_.build();
      }
      if (mrBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          mr_ = java.util.Collections.unmodifiableList(mr_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.mr_ = mr_;
      } else {
        result.mr_ = mrBuilder_.build();
      }
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
      if (other instanceof org.tensorflow.contrib.verbs.GetRemoteAddressResponse) {
        return mergeFrom((org.tensorflow.contrib.verbs.GetRemoteAddressResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.contrib.verbs.GetRemoteAddressResponse other) {
      if (other == org.tensorflow.contrib.verbs.GetRemoteAddressResponse.getDefaultInstance()) return this;
      if (!other.getHostName().isEmpty()) {
        hostName_ = other.hostName_;
        onChanged();
      }
      if (other.hasChannel()) {
        mergeChannel(other.getChannel());
      }
      if (mrBuilder_ == null) {
        if (!other.mr_.isEmpty()) {
          if (mr_.isEmpty()) {
            mr_ = other.mr_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureMrIsMutable();
            mr_.addAll(other.mr_);
          }
          onChanged();
        }
      } else {
        if (!other.mr_.isEmpty()) {
          if (mrBuilder_.isEmpty()) {
            mrBuilder_.dispose();
            mrBuilder_ = null;
            mr_ = other.mr_;
            bitField0_ = (bitField0_ & ~0x00000004);
            mrBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMrFieldBuilder() : null;
          } else {
            mrBuilder_.addAllMessages(other.mr_);
          }
        }
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
      org.tensorflow.contrib.verbs.GetRemoteAddressResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.contrib.verbs.GetRemoteAddressResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object hostName_ = "";
    /**
     * <code>string host_name = 1;</code>
     */
    public java.lang.String getHostName() {
      java.lang.Object ref = hostName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hostName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string host_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getHostNameBytes() {
      java.lang.Object ref = hostName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hostName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string host_name = 1;</code>
     */
    public Builder setHostName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      hostName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string host_name = 1;</code>
     */
    public Builder clearHostName() {
      
      hostName_ = getDefaultInstance().getHostName();
      onChanged();
      return this;
    }
    /**
     * <code>string host_name = 1;</code>
     */
    public Builder setHostNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      hostName_ = value;
      onChanged();
      return this;
    }

    private org.tensorflow.contrib.verbs.Channel channel_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.contrib.verbs.Channel, org.tensorflow.contrib.verbs.Channel.Builder, org.tensorflow.contrib.verbs.ChannelOrBuilder> channelBuilder_;
    /**
     * <code>.tensorflow.Channel channel = 2;</code>
     */
    public boolean hasChannel() {
      return channelBuilder_ != null || channel_ != null;
    }
    /**
     * <code>.tensorflow.Channel channel = 2;</code>
     */
    public org.tensorflow.contrib.verbs.Channel getChannel() {
      if (channelBuilder_ == null) {
        return channel_ == null ? org.tensorflow.contrib.verbs.Channel.getDefaultInstance() : channel_;
      } else {
        return channelBuilder_.getMessage();
      }
    }
    /**
     * <code>.tensorflow.Channel channel = 2;</code>
     */
    public Builder setChannel(org.tensorflow.contrib.verbs.Channel value) {
      if (channelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        channel_ = value;
        onChanged();
      } else {
        channelBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.tensorflow.Channel channel = 2;</code>
     */
    public Builder setChannel(
        org.tensorflow.contrib.verbs.Channel.Builder builderForValue) {
      if (channelBuilder_ == null) {
        channel_ = builderForValue.build();
        onChanged();
      } else {
        channelBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.tensorflow.Channel channel = 2;</code>
     */
    public Builder mergeChannel(org.tensorflow.contrib.verbs.Channel value) {
      if (channelBuilder_ == null) {
        if (channel_ != null) {
          channel_ =
            org.tensorflow.contrib.verbs.Channel.newBuilder(channel_).mergeFrom(value).buildPartial();
        } else {
          channel_ = value;
        }
        onChanged();
      } else {
        channelBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.tensorflow.Channel channel = 2;</code>
     */
    public Builder clearChannel() {
      if (channelBuilder_ == null) {
        channel_ = null;
        onChanged();
      } else {
        channel_ = null;
        channelBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.tensorflow.Channel channel = 2;</code>
     */
    public org.tensorflow.contrib.verbs.Channel.Builder getChannelBuilder() {
      
      onChanged();
      return getChannelFieldBuilder().getBuilder();
    }
    /**
     * <code>.tensorflow.Channel channel = 2;</code>
     */
    public org.tensorflow.contrib.verbs.ChannelOrBuilder getChannelOrBuilder() {
      if (channelBuilder_ != null) {
        return channelBuilder_.getMessageOrBuilder();
      } else {
        return channel_ == null ?
            org.tensorflow.contrib.verbs.Channel.getDefaultInstance() : channel_;
      }
    }
    /**
     * <code>.tensorflow.Channel channel = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.contrib.verbs.Channel, org.tensorflow.contrib.verbs.Channel.Builder, org.tensorflow.contrib.verbs.ChannelOrBuilder> 
        getChannelFieldBuilder() {
      if (channelBuilder_ == null) {
        channelBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.contrib.verbs.Channel, org.tensorflow.contrib.verbs.Channel.Builder, org.tensorflow.contrib.verbs.ChannelOrBuilder>(
                getChannel(),
                getParentForChildren(),
                isClean());
        channel_ = null;
      }
      return channelBuilder_;
    }

    private java.util.List<org.tensorflow.contrib.verbs.MemoryRegion> mr_ =
      java.util.Collections.emptyList();
    private void ensureMrIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        mr_ = new java.util.ArrayList<org.tensorflow.contrib.verbs.MemoryRegion>(mr_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tensorflow.contrib.verbs.MemoryRegion, org.tensorflow.contrib.verbs.MemoryRegion.Builder, org.tensorflow.contrib.verbs.MemoryRegionOrBuilder> mrBuilder_;

    /**
     * <code>repeated .tensorflow.MemoryRegion mr = 3;</code>
     */
    public java.util.List<org.tensorflow.contrib.verbs.MemoryRegion> getMrList() {
      if (mrBuilder_ == null) {
        return java.util.Collections.unmodifiableList(mr_);
      } else {
        return mrBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .tensorflow.MemoryRegion mr = 3;</code>
     */
    public int getMrCount() {
      if (mrBuilder_ == null) {
        return mr_.size();
      } else {
        return mrBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .tensorflow.MemoryRegion mr = 3;</code>
     */
    public org.tensorflow.contrib.verbs.MemoryRegion getMr(int index) {
      if (mrBuilder_ == null) {
        return mr_.get(index);
      } else {
        return mrBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .tensorflow.MemoryRegion mr = 3;</code>
     */
    public Builder setMr(
        int index, org.tensorflow.contrib.verbs.MemoryRegion value) {
      if (mrBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMrIsMutable();
        mr_.set(index, value);
        onChanged();
      } else {
        mrBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.MemoryRegion mr = 3;</code>
     */
    public Builder setMr(
        int index, org.tensorflow.contrib.verbs.MemoryRegion.Builder builderForValue) {
      if (mrBuilder_ == null) {
        ensureMrIsMutable();
        mr_.set(index, builderForValue.build());
        onChanged();
      } else {
        mrBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.MemoryRegion mr = 3;</code>
     */
    public Builder addMr(org.tensorflow.contrib.verbs.MemoryRegion value) {
      if (mrBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMrIsMutable();
        mr_.add(value);
        onChanged();
      } else {
        mrBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.MemoryRegion mr = 3;</code>
     */
    public Builder addMr(
        int index, org.tensorflow.contrib.verbs.MemoryRegion value) {
      if (mrBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMrIsMutable();
        mr_.add(index, value);
        onChanged();
      } else {
        mrBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.MemoryRegion mr = 3;</code>
     */
    public Builder addMr(
        org.tensorflow.contrib.verbs.MemoryRegion.Builder builderForValue) {
      if (mrBuilder_ == null) {
        ensureMrIsMutable();
        mr_.add(builderForValue.build());
        onChanged();
      } else {
        mrBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.MemoryRegion mr = 3;</code>
     */
    public Builder addMr(
        int index, org.tensorflow.contrib.verbs.MemoryRegion.Builder builderForValue) {
      if (mrBuilder_ == null) {
        ensureMrIsMutable();
        mr_.add(index, builderForValue.build());
        onChanged();
      } else {
        mrBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.MemoryRegion mr = 3;</code>
     */
    public Builder addAllMr(
        java.lang.Iterable<? extends org.tensorflow.contrib.verbs.MemoryRegion> values) {
      if (mrBuilder_ == null) {
        ensureMrIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, mr_);
        onChanged();
      } else {
        mrBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.MemoryRegion mr = 3;</code>
     */
    public Builder clearMr() {
      if (mrBuilder_ == null) {
        mr_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        mrBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.MemoryRegion mr = 3;</code>
     */
    public Builder removeMr(int index) {
      if (mrBuilder_ == null) {
        ensureMrIsMutable();
        mr_.remove(index);
        onChanged();
      } else {
        mrBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.MemoryRegion mr = 3;</code>
     */
    public org.tensorflow.contrib.verbs.MemoryRegion.Builder getMrBuilder(
        int index) {
      return getMrFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .tensorflow.MemoryRegion mr = 3;</code>
     */
    public org.tensorflow.contrib.verbs.MemoryRegionOrBuilder getMrOrBuilder(
        int index) {
      if (mrBuilder_ == null) {
        return mr_.get(index);  } else {
        return mrBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .tensorflow.MemoryRegion mr = 3;</code>
     */
    public java.util.List<? extends org.tensorflow.contrib.verbs.MemoryRegionOrBuilder> 
         getMrOrBuilderList() {
      if (mrBuilder_ != null) {
        return mrBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(mr_);
      }
    }
    /**
     * <code>repeated .tensorflow.MemoryRegion mr = 3;</code>
     */
    public org.tensorflow.contrib.verbs.MemoryRegion.Builder addMrBuilder() {
      return getMrFieldBuilder().addBuilder(
          org.tensorflow.contrib.verbs.MemoryRegion.getDefaultInstance());
    }
    /**
     * <code>repeated .tensorflow.MemoryRegion mr = 3;</code>
     */
    public org.tensorflow.contrib.verbs.MemoryRegion.Builder addMrBuilder(
        int index) {
      return getMrFieldBuilder().addBuilder(
          index, org.tensorflow.contrib.verbs.MemoryRegion.getDefaultInstance());
    }
    /**
     * <code>repeated .tensorflow.MemoryRegion mr = 3;</code>
     */
    public java.util.List<org.tensorflow.contrib.verbs.MemoryRegion.Builder> 
         getMrBuilderList() {
      return getMrFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tensorflow.contrib.verbs.MemoryRegion, org.tensorflow.contrib.verbs.MemoryRegion.Builder, org.tensorflow.contrib.verbs.MemoryRegionOrBuilder> 
        getMrFieldBuilder() {
      if (mrBuilder_ == null) {
        mrBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.tensorflow.contrib.verbs.MemoryRegion, org.tensorflow.contrib.verbs.MemoryRegion.Builder, org.tensorflow.contrib.verbs.MemoryRegionOrBuilder>(
                mr_,
                ((bitField0_ & 0x00000004) == 0x00000004),
                getParentForChildren(),
                isClean());
        mr_ = null;
      }
      return mrBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.GetRemoteAddressResponse)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.GetRemoteAddressResponse)
  private static final org.tensorflow.contrib.verbs.GetRemoteAddressResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.contrib.verbs.GetRemoteAddressResponse();
  }

  public static org.tensorflow.contrib.verbs.GetRemoteAddressResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetRemoteAddressResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetRemoteAddressResponse>() {
    @java.lang.Override
    public GetRemoteAddressResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetRemoteAddressResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetRemoteAddressResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetRemoteAddressResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.contrib.verbs.GetRemoteAddressResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

