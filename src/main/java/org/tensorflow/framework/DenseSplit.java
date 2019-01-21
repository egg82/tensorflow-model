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
 * <pre>
 * TODO(nponomareva): move out of boosted_trees and rename to trees.proto
 * </pre>
 *
 * Protobuf type {@code tensorflow.boosted_trees.DenseSplit}
 */
public  final class DenseSplit extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.boosted_trees.DenseSplit)
    DenseSplitOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DenseSplit.newBuilder() to construct.
  private DenseSplit(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DenseSplit() {
    featureId_ = 0;
    threshold_ = 0F;
    leftId_ = 0;
    rightId_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DenseSplit(
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

            featureId_ = input.readInt32();
            break;
          }
          case 21: {

            threshold_ = input.readFloat();
            break;
          }
          case 24: {

            leftId_ = input.readInt32();
            break;
          }
          case 32: {

            rightId_ = input.readInt32();
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
    return org.tensorflow.framework.BoostedTreesProtos.internal_static_tensorflow_boosted_trees_DenseSplit_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.framework.BoostedTreesProtos.internal_static_tensorflow_boosted_trees_DenseSplit_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.framework.DenseSplit.class, org.tensorflow.framework.DenseSplit.Builder.class);
  }

  public static final int FEATURE_ID_FIELD_NUMBER = 1;
  private int featureId_;
  /**
   * <pre>
   * Float feature column and split threshold describing
   * the rule feature &lt;= threshold.
   * </pre>
   *
   * <code>int32 feature_id = 1;</code>
   */
  public int getFeatureId() {
    return featureId_;
  }

  public static final int THRESHOLD_FIELD_NUMBER = 2;
  private float threshold_;
  /**
   * <code>float threshold = 2;</code>
   */
  public float getThreshold() {
    return threshold_;
  }

  public static final int LEFT_ID_FIELD_NUMBER = 3;
  private int leftId_;
  /**
   * <pre>
   * Node children indexing into a contiguous
   * vector of nodes starting from the root.
   * </pre>
   *
   * <code>int32 left_id = 3;</code>
   */
  public int getLeftId() {
    return leftId_;
  }

  public static final int RIGHT_ID_FIELD_NUMBER = 4;
  private int rightId_;
  /**
   * <code>int32 right_id = 4;</code>
   */
  public int getRightId() {
    return rightId_;
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
    if (featureId_ != 0) {
      output.writeInt32(1, featureId_);
    }
    if (threshold_ != 0F) {
      output.writeFloat(2, threshold_);
    }
    if (leftId_ != 0) {
      output.writeInt32(3, leftId_);
    }
    if (rightId_ != 0) {
      output.writeInt32(4, rightId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (featureId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, featureId_);
    }
    if (threshold_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, threshold_);
    }
    if (leftId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, leftId_);
    }
    if (rightId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, rightId_);
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
    if (!(obj instanceof org.tensorflow.framework.DenseSplit)) {
      return super.equals(obj);
    }
    org.tensorflow.framework.DenseSplit other = (org.tensorflow.framework.DenseSplit) obj;

    boolean result = true;
    result = result && (getFeatureId()
        == other.getFeatureId());
    result = result && (
        java.lang.Float.floatToIntBits(getThreshold())
        == java.lang.Float.floatToIntBits(
            other.getThreshold()));
    result = result && (getLeftId()
        == other.getLeftId());
    result = result && (getRightId()
        == other.getRightId());
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
    hash = (37 * hash) + FEATURE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getFeatureId();
    hash = (37 * hash) + THRESHOLD_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getThreshold());
    hash = (37 * hash) + LEFT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getLeftId();
    hash = (37 * hash) + RIGHT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRightId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.framework.DenseSplit parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.DenseSplit parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.DenseSplit parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.DenseSplit parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.DenseSplit parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.DenseSplit parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.DenseSplit parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.DenseSplit parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.DenseSplit parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.DenseSplit parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.DenseSplit parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.DenseSplit parseFrom(
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
  public static Builder newBuilder(org.tensorflow.framework.DenseSplit prototype) {
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
   * TODO(nponomareva): move out of boosted_trees and rename to trees.proto
   * </pre>
   *
   * Protobuf type {@code tensorflow.boosted_trees.DenseSplit}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.boosted_trees.DenseSplit)
      org.tensorflow.framework.DenseSplitOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.framework.BoostedTreesProtos.internal_static_tensorflow_boosted_trees_DenseSplit_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.framework.BoostedTreesProtos.internal_static_tensorflow_boosted_trees_DenseSplit_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.framework.DenseSplit.class, org.tensorflow.framework.DenseSplit.Builder.class);
    }

    // Construct using org.tensorflow.framework.DenseSplit.newBuilder()
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
      featureId_ = 0;

      threshold_ = 0F;

      leftId_ = 0;

      rightId_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.framework.BoostedTreesProtos.internal_static_tensorflow_boosted_trees_DenseSplit_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.framework.DenseSplit getDefaultInstanceForType() {
      return org.tensorflow.framework.DenseSplit.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.framework.DenseSplit build() {
      org.tensorflow.framework.DenseSplit result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.framework.DenseSplit buildPartial() {
      org.tensorflow.framework.DenseSplit result = new org.tensorflow.framework.DenseSplit(this);
      result.featureId_ = featureId_;
      result.threshold_ = threshold_;
      result.leftId_ = leftId_;
      result.rightId_ = rightId_;
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
      if (other instanceof org.tensorflow.framework.DenseSplit) {
        return mergeFrom((org.tensorflow.framework.DenseSplit)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.framework.DenseSplit other) {
      if (other == org.tensorflow.framework.DenseSplit.getDefaultInstance()) return this;
      if (other.getFeatureId() != 0) {
        setFeatureId(other.getFeatureId());
      }
      if (other.getThreshold() != 0F) {
        setThreshold(other.getThreshold());
      }
      if (other.getLeftId() != 0) {
        setLeftId(other.getLeftId());
      }
      if (other.getRightId() != 0) {
        setRightId(other.getRightId());
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
      org.tensorflow.framework.DenseSplit parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.framework.DenseSplit) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int featureId_ ;
    /**
     * <pre>
     * Float feature column and split threshold describing
     * the rule feature &lt;= threshold.
     * </pre>
     *
     * <code>int32 feature_id = 1;</code>
     */
    public int getFeatureId() {
      return featureId_;
    }
    /**
     * <pre>
     * Float feature column and split threshold describing
     * the rule feature &lt;= threshold.
     * </pre>
     *
     * <code>int32 feature_id = 1;</code>
     */
    public Builder setFeatureId(int value) {
      
      featureId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Float feature column and split threshold describing
     * the rule feature &lt;= threshold.
     * </pre>
     *
     * <code>int32 feature_id = 1;</code>
     */
    public Builder clearFeatureId() {
      
      featureId_ = 0;
      onChanged();
      return this;
    }

    private float threshold_ ;
    /**
     * <code>float threshold = 2;</code>
     */
    public float getThreshold() {
      return threshold_;
    }
    /**
     * <code>float threshold = 2;</code>
     */
    public Builder setThreshold(float value) {
      
      threshold_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float threshold = 2;</code>
     */
    public Builder clearThreshold() {
      
      threshold_ = 0F;
      onChanged();
      return this;
    }

    private int leftId_ ;
    /**
     * <pre>
     * Node children indexing into a contiguous
     * vector of nodes starting from the root.
     * </pre>
     *
     * <code>int32 left_id = 3;</code>
     */
    public int getLeftId() {
      return leftId_;
    }
    /**
     * <pre>
     * Node children indexing into a contiguous
     * vector of nodes starting from the root.
     * </pre>
     *
     * <code>int32 left_id = 3;</code>
     */
    public Builder setLeftId(int value) {
      
      leftId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Node children indexing into a contiguous
     * vector of nodes starting from the root.
     * </pre>
     *
     * <code>int32 left_id = 3;</code>
     */
    public Builder clearLeftId() {
      
      leftId_ = 0;
      onChanged();
      return this;
    }

    private int rightId_ ;
    /**
     * <code>int32 right_id = 4;</code>
     */
    public int getRightId() {
      return rightId_;
    }
    /**
     * <code>int32 right_id = 4;</code>
     */
    public Builder setRightId(int value) {
      
      rightId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 right_id = 4;</code>
     */
    public Builder clearRightId() {
      
      rightId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.boosted_trees.DenseSplit)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.boosted_trees.DenseSplit)
  private static final org.tensorflow.framework.DenseSplit DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.framework.DenseSplit();
  }

  public static org.tensorflow.framework.DenseSplit getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DenseSplit>
      PARSER = new com.google.protobuf.AbstractParser<DenseSplit>() {
    @java.lang.Override
    public DenseSplit parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DenseSplit(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DenseSplit> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DenseSplit> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.framework.DenseSplit getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
