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
 * Protobuf type {@code tensorflow.MemoryRegion}
 */
public  final class MemoryRegion extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.MemoryRegion)
    MemoryRegionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MemoryRegion.newBuilder() to construct.
  private MemoryRegion(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MemoryRegion() {
    remoteAddr_ = 0L;
    rkey_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MemoryRegion(
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

            remoteAddr_ = input.readUInt64();
            break;
          }
          case 16: {

            rkey_ = input.readUInt32();
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
    return org.tensorflow.contrib.verbs.VerbsServiceProtos.internal_static_tensorflow_MemoryRegion_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.contrib.verbs.VerbsServiceProtos.internal_static_tensorflow_MemoryRegion_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.contrib.verbs.MemoryRegion.class, org.tensorflow.contrib.verbs.MemoryRegion.Builder.class);
  }

  public static final int REMOTE_ADDR_FIELD_NUMBER = 1;
  private long remoteAddr_;
  /**
   * <code>uint64 remote_addr = 1;</code>
   */
  public long getRemoteAddr() {
    return remoteAddr_;
  }

  public static final int RKEY_FIELD_NUMBER = 2;
  private int rkey_;
  /**
   * <code>uint32 rkey = 2;</code>
   */
  public int getRkey() {
    return rkey_;
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
    if (remoteAddr_ != 0L) {
      output.writeUInt64(1, remoteAddr_);
    }
    if (rkey_ != 0) {
      output.writeUInt32(2, rkey_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (remoteAddr_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, remoteAddr_);
    }
    if (rkey_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, rkey_);
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
    if (!(obj instanceof org.tensorflow.contrib.verbs.MemoryRegion)) {
      return super.equals(obj);
    }
    org.tensorflow.contrib.verbs.MemoryRegion other = (org.tensorflow.contrib.verbs.MemoryRegion) obj;

    boolean result = true;
    result = result && (getRemoteAddr()
        == other.getRemoteAddr());
    result = result && (getRkey()
        == other.getRkey());
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
    hash = (37 * hash) + REMOTE_ADDR_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRemoteAddr());
    hash = (37 * hash) + RKEY_FIELD_NUMBER;
    hash = (53 * hash) + getRkey();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.contrib.verbs.MemoryRegion parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.contrib.verbs.MemoryRegion parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.contrib.verbs.MemoryRegion parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.contrib.verbs.MemoryRegion parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.contrib.verbs.MemoryRegion parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.contrib.verbs.MemoryRegion parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.contrib.verbs.MemoryRegion parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.contrib.verbs.MemoryRegion parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.contrib.verbs.MemoryRegion parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.contrib.verbs.MemoryRegion parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.contrib.verbs.MemoryRegion parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.contrib.verbs.MemoryRegion parseFrom(
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
  public static Builder newBuilder(org.tensorflow.contrib.verbs.MemoryRegion prototype) {
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
   * Protobuf type {@code tensorflow.MemoryRegion}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.MemoryRegion)
      org.tensorflow.contrib.verbs.MemoryRegionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.contrib.verbs.VerbsServiceProtos.internal_static_tensorflow_MemoryRegion_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.contrib.verbs.VerbsServiceProtos.internal_static_tensorflow_MemoryRegion_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.contrib.verbs.MemoryRegion.class, org.tensorflow.contrib.verbs.MemoryRegion.Builder.class);
    }

    // Construct using org.tensorflow.contrib.verbs.MemoryRegion.newBuilder()
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
      remoteAddr_ = 0L;

      rkey_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.contrib.verbs.VerbsServiceProtos.internal_static_tensorflow_MemoryRegion_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.contrib.verbs.MemoryRegion getDefaultInstanceForType() {
      return org.tensorflow.contrib.verbs.MemoryRegion.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.contrib.verbs.MemoryRegion build() {
      org.tensorflow.contrib.verbs.MemoryRegion result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.contrib.verbs.MemoryRegion buildPartial() {
      org.tensorflow.contrib.verbs.MemoryRegion result = new org.tensorflow.contrib.verbs.MemoryRegion(this);
      result.remoteAddr_ = remoteAddr_;
      result.rkey_ = rkey_;
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
      if (other instanceof org.tensorflow.contrib.verbs.MemoryRegion) {
        return mergeFrom((org.tensorflow.contrib.verbs.MemoryRegion)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.contrib.verbs.MemoryRegion other) {
      if (other == org.tensorflow.contrib.verbs.MemoryRegion.getDefaultInstance()) return this;
      if (other.getRemoteAddr() != 0L) {
        setRemoteAddr(other.getRemoteAddr());
      }
      if (other.getRkey() != 0) {
        setRkey(other.getRkey());
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
      org.tensorflow.contrib.verbs.MemoryRegion parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.contrib.verbs.MemoryRegion) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long remoteAddr_ ;
    /**
     * <code>uint64 remote_addr = 1;</code>
     */
    public long getRemoteAddr() {
      return remoteAddr_;
    }
    /**
     * <code>uint64 remote_addr = 1;</code>
     */
    public Builder setRemoteAddr(long value) {
      
      remoteAddr_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 remote_addr = 1;</code>
     */
    public Builder clearRemoteAddr() {
      
      remoteAddr_ = 0L;
      onChanged();
      return this;
    }

    private int rkey_ ;
    /**
     * <code>uint32 rkey = 2;</code>
     */
    public int getRkey() {
      return rkey_;
    }
    /**
     * <code>uint32 rkey = 2;</code>
     */
    public Builder setRkey(int value) {
      
      rkey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 rkey = 2;</code>
     */
    public Builder clearRkey() {
      
      rkey_ = 0;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.MemoryRegion)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.MemoryRegion)
  private static final org.tensorflow.contrib.verbs.MemoryRegion DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.contrib.verbs.MemoryRegion();
  }

  public static org.tensorflow.contrib.verbs.MemoryRegion getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MemoryRegion>
      PARSER = new com.google.protobuf.AbstractParser<MemoryRegion>() {
    @java.lang.Override
    public MemoryRegion parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MemoryRegion(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MemoryRegion> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MemoryRegion> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.contrib.verbs.MemoryRegion getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
