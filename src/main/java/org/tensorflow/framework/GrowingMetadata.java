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
// source: boosted_trees.proto

package org.tensorflow.framework;

/**
 * Protobuf type {@code tensorflow.boosted_trees.GrowingMetadata}
 */
public  final class GrowingMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.boosted_trees.GrowingMetadata)
    GrowingMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GrowingMetadata.newBuilder() to construct.
  private GrowingMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GrowingMetadata() {
    numTreesAttempted_ = 0L;
    numLayersAttempted_ = 0L;
    lastLayerNodeStart_ = 0;
    lastLayerNodeEnd_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GrowingMetadata(
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

            numTreesAttempted_ = input.readInt64();
            break;
          }
          case 16: {

            numLayersAttempted_ = input.readInt64();
            break;
          }
          case 24: {

            lastLayerNodeStart_ = input.readInt32();
            break;
          }
          case 32: {

            lastLayerNodeEnd_ = input.readInt32();
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
    return org.tensorflow.framework.BoostedTreesProtos.internal_static_tensorflow_boosted_trees_GrowingMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.framework.BoostedTreesProtos.internal_static_tensorflow_boosted_trees_GrowingMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.framework.GrowingMetadata.class, org.tensorflow.framework.GrowingMetadata.Builder.class);
  }

  public static final int NUM_TREES_ATTEMPTED_FIELD_NUMBER = 1;
  private long numTreesAttempted_;
  /**
   * <pre>
   * Number of trees that we have attempted to build. After pruning, these
   * trees might have been removed.
   * </pre>
   *
   * <code>int64 num_trees_attempted = 1;</code>
   */
  public long getNumTreesAttempted() {
    return numTreesAttempted_;
  }

  public static final int NUM_LAYERS_ATTEMPTED_FIELD_NUMBER = 2;
  private long numLayersAttempted_;
  /**
   * <pre>
   * Number of layers that we have attempted to build. After pruning, these
   * layers might have been removed.
   * </pre>
   *
   * <code>int64 num_layers_attempted = 2;</code>
   */
  public long getNumLayersAttempted() {
    return numLayersAttempted_;
  }

  public static final int LAST_LAYER_NODE_START_FIELD_NUMBER = 3;
  private int lastLayerNodeStart_;
  /**
   * <pre>
   * The start (inclusive) and end (exclusive) ids of the nodes in the latest
   * layer of the latest tree.
   * </pre>
   *
   * <code>int32 last_layer_node_start = 3;</code>
   */
  public int getLastLayerNodeStart() {
    return lastLayerNodeStart_;
  }

  public static final int LAST_LAYER_NODE_END_FIELD_NUMBER = 4;
  private int lastLayerNodeEnd_;
  /**
   * <code>int32 last_layer_node_end = 4;</code>
   */
  public int getLastLayerNodeEnd() {
    return lastLayerNodeEnd_;
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
    if (numTreesAttempted_ != 0L) {
      output.writeInt64(1, numTreesAttempted_);
    }
    if (numLayersAttempted_ != 0L) {
      output.writeInt64(2, numLayersAttempted_);
    }
    if (lastLayerNodeStart_ != 0) {
      output.writeInt32(3, lastLayerNodeStart_);
    }
    if (lastLayerNodeEnd_ != 0) {
      output.writeInt32(4, lastLayerNodeEnd_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (numTreesAttempted_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, numTreesAttempted_);
    }
    if (numLayersAttempted_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, numLayersAttempted_);
    }
    if (lastLayerNodeStart_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, lastLayerNodeStart_);
    }
    if (lastLayerNodeEnd_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, lastLayerNodeEnd_);
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
    if (!(obj instanceof org.tensorflow.framework.GrowingMetadata)) {
      return super.equals(obj);
    }
    org.tensorflow.framework.GrowingMetadata other = (org.tensorflow.framework.GrowingMetadata) obj;

    boolean result = true;
    result = result && (getNumTreesAttempted()
        == other.getNumTreesAttempted());
    result = result && (getNumLayersAttempted()
        == other.getNumLayersAttempted());
    result = result && (getLastLayerNodeStart()
        == other.getLastLayerNodeStart());
    result = result && (getLastLayerNodeEnd()
        == other.getLastLayerNodeEnd());
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
    hash = (37 * hash) + NUM_TREES_ATTEMPTED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNumTreesAttempted());
    hash = (37 * hash) + NUM_LAYERS_ATTEMPTED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNumLayersAttempted());
    hash = (37 * hash) + LAST_LAYER_NODE_START_FIELD_NUMBER;
    hash = (53 * hash) + getLastLayerNodeStart();
    hash = (37 * hash) + LAST_LAYER_NODE_END_FIELD_NUMBER;
    hash = (53 * hash) + getLastLayerNodeEnd();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.framework.GrowingMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.GrowingMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.GrowingMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.GrowingMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.GrowingMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.GrowingMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.GrowingMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.GrowingMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.GrowingMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.GrowingMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.GrowingMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.GrowingMetadata parseFrom(
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
  public static Builder newBuilder(org.tensorflow.framework.GrowingMetadata prototype) {
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
   * Protobuf type {@code tensorflow.boosted_trees.GrowingMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.boosted_trees.GrowingMetadata)
      org.tensorflow.framework.GrowingMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.framework.BoostedTreesProtos.internal_static_tensorflow_boosted_trees_GrowingMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.framework.BoostedTreesProtos.internal_static_tensorflow_boosted_trees_GrowingMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.framework.GrowingMetadata.class, org.tensorflow.framework.GrowingMetadata.Builder.class);
    }

    // Construct using org.tensorflow.framework.GrowingMetadata.newBuilder()
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
      numTreesAttempted_ = 0L;

      numLayersAttempted_ = 0L;

      lastLayerNodeStart_ = 0;

      lastLayerNodeEnd_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.framework.BoostedTreesProtos.internal_static_tensorflow_boosted_trees_GrowingMetadata_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.framework.GrowingMetadata getDefaultInstanceForType() {
      return org.tensorflow.framework.GrowingMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.framework.GrowingMetadata build() {
      org.tensorflow.framework.GrowingMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.framework.GrowingMetadata buildPartial() {
      org.tensorflow.framework.GrowingMetadata result = new org.tensorflow.framework.GrowingMetadata(this);
      result.numTreesAttempted_ = numTreesAttempted_;
      result.numLayersAttempted_ = numLayersAttempted_;
      result.lastLayerNodeStart_ = lastLayerNodeStart_;
      result.lastLayerNodeEnd_ = lastLayerNodeEnd_;
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
      if (other instanceof org.tensorflow.framework.GrowingMetadata) {
        return mergeFrom((org.tensorflow.framework.GrowingMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.framework.GrowingMetadata other) {
      if (other == org.tensorflow.framework.GrowingMetadata.getDefaultInstance()) return this;
      if (other.getNumTreesAttempted() != 0L) {
        setNumTreesAttempted(other.getNumTreesAttempted());
      }
      if (other.getNumLayersAttempted() != 0L) {
        setNumLayersAttempted(other.getNumLayersAttempted());
      }
      if (other.getLastLayerNodeStart() != 0) {
        setLastLayerNodeStart(other.getLastLayerNodeStart());
      }
      if (other.getLastLayerNodeEnd() != 0) {
        setLastLayerNodeEnd(other.getLastLayerNodeEnd());
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
      org.tensorflow.framework.GrowingMetadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.framework.GrowingMetadata) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long numTreesAttempted_ ;
    /**
     * <pre>
     * Number of trees that we have attempted to build. After pruning, these
     * trees might have been removed.
     * </pre>
     *
     * <code>int64 num_trees_attempted = 1;</code>
     */
    public long getNumTreesAttempted() {
      return numTreesAttempted_;
    }
    /**
     * <pre>
     * Number of trees that we have attempted to build. After pruning, these
     * trees might have been removed.
     * </pre>
     *
     * <code>int64 num_trees_attempted = 1;</code>
     */
    public Builder setNumTreesAttempted(long value) {
      
      numTreesAttempted_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of trees that we have attempted to build. After pruning, these
     * trees might have been removed.
     * </pre>
     *
     * <code>int64 num_trees_attempted = 1;</code>
     */
    public Builder clearNumTreesAttempted() {
      
      numTreesAttempted_ = 0L;
      onChanged();
      return this;
    }

    private long numLayersAttempted_ ;
    /**
     * <pre>
     * Number of layers that we have attempted to build. After pruning, these
     * layers might have been removed.
     * </pre>
     *
     * <code>int64 num_layers_attempted = 2;</code>
     */
    public long getNumLayersAttempted() {
      return numLayersAttempted_;
    }
    /**
     * <pre>
     * Number of layers that we have attempted to build. After pruning, these
     * layers might have been removed.
     * </pre>
     *
     * <code>int64 num_layers_attempted = 2;</code>
     */
    public Builder setNumLayersAttempted(long value) {
      
      numLayersAttempted_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of layers that we have attempted to build. After pruning, these
     * layers might have been removed.
     * </pre>
     *
     * <code>int64 num_layers_attempted = 2;</code>
     */
    public Builder clearNumLayersAttempted() {
      
      numLayersAttempted_ = 0L;
      onChanged();
      return this;
    }

    private int lastLayerNodeStart_ ;
    /**
     * <pre>
     * The start (inclusive) and end (exclusive) ids of the nodes in the latest
     * layer of the latest tree.
     * </pre>
     *
     * <code>int32 last_layer_node_start = 3;</code>
     */
    public int getLastLayerNodeStart() {
      return lastLayerNodeStart_;
    }
    /**
     * <pre>
     * The start (inclusive) and end (exclusive) ids of the nodes in the latest
     * layer of the latest tree.
     * </pre>
     *
     * <code>int32 last_layer_node_start = 3;</code>
     */
    public Builder setLastLayerNodeStart(int value) {
      
      lastLayerNodeStart_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The start (inclusive) and end (exclusive) ids of the nodes in the latest
     * layer of the latest tree.
     * </pre>
     *
     * <code>int32 last_layer_node_start = 3;</code>
     */
    public Builder clearLastLayerNodeStart() {
      
      lastLayerNodeStart_ = 0;
      onChanged();
      return this;
    }

    private int lastLayerNodeEnd_ ;
    /**
     * <code>int32 last_layer_node_end = 4;</code>
     */
    public int getLastLayerNodeEnd() {
      return lastLayerNodeEnd_;
    }
    /**
     * <code>int32 last_layer_node_end = 4;</code>
     */
    public Builder setLastLayerNodeEnd(int value) {
      
      lastLayerNodeEnd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 last_layer_node_end = 4;</code>
     */
    public Builder clearLastLayerNodeEnd() {
      
      lastLayerNodeEnd_ = 0;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.boosted_trees.GrowingMetadata)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.boosted_trees.GrowingMetadata)
  private static final org.tensorflow.framework.GrowingMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.framework.GrowingMetadata();
  }

  public static org.tensorflow.framework.GrowingMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GrowingMetadata>
      PARSER = new com.google.protobuf.AbstractParser<GrowingMetadata>() {
    @java.lang.Override
    public GrowingMetadata parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GrowingMetadata(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GrowingMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GrowingMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.framework.GrowingMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

