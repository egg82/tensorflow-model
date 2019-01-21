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
 * Leaves can either hold dense or sparse information.
 * </pre>
 *
 * Protobuf type {@code tensorflow.boosted_trees.Leaf}
 */
public  final class Leaf extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.boosted_trees.Leaf)
    LeafOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Leaf.newBuilder() to construct.
  private Leaf(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Leaf() {
    scalar_ = 0F;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Leaf(
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
            org.tensorflow.framework.Vector.Builder subBuilder = null;
            if (leafCase_ == 1) {
              subBuilder = ((org.tensorflow.framework.Vector) leaf_).toBuilder();
            }
            leaf_ =
                input.readMessage(org.tensorflow.framework.Vector.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((org.tensorflow.framework.Vector) leaf_);
              leaf_ = subBuilder.buildPartial();
            }
            leafCase_ = 1;
            break;
          }
          case 18: {
            org.tensorflow.framework.SparseVector.Builder subBuilder = null;
            if (leafCase_ == 2) {
              subBuilder = ((org.tensorflow.framework.SparseVector) leaf_).toBuilder();
            }
            leaf_ =
                input.readMessage(org.tensorflow.framework.SparseVector.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((org.tensorflow.framework.SparseVector) leaf_);
              leaf_ = subBuilder.buildPartial();
            }
            leafCase_ = 2;
            break;
          }
          case 29: {

            scalar_ = input.readFloat();
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
    return org.tensorflow.framework.BoostedTreesProtos.internal_static_tensorflow_boosted_trees_Leaf_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.framework.BoostedTreesProtos.internal_static_tensorflow_boosted_trees_Leaf_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.framework.Leaf.class, org.tensorflow.framework.Leaf.Builder.class);
  }

  private int leafCase_ = 0;
  private java.lang.Object leaf_;
  public enum LeafCase
      implements com.google.protobuf.Internal.EnumLite {
    VECTOR(1),
    SPARSE_VECTOR(2),
    LEAF_NOT_SET(0);
    private final int value;
    LeafCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static LeafCase valueOf(int value) {
      return forNumber(value);
    }

    public static LeafCase forNumber(int value) {
      switch (value) {
        case 1: return VECTOR;
        case 2: return SPARSE_VECTOR;
        case 0: return LEAF_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  }

  public LeafCase
  getLeafCase() {
    return LeafCase.forNumber(
        leafCase_);
  }

  public static final int VECTOR_FIELD_NUMBER = 1;
  /**
   * <pre>
   * See third_party/tensorflow/contrib/decision_trees/
   * proto/generic_tree_model.proto
   * for a description of how vector and sparse_vector might be used.
   * </pre>
   *
   * <code>.tensorflow.boosted_trees.Vector vector = 1;</code>
   */
  public boolean hasVector() {
    return leafCase_ == 1;
  }
  /**
   * <pre>
   * See third_party/tensorflow/contrib/decision_trees/
   * proto/generic_tree_model.proto
   * for a description of how vector and sparse_vector might be used.
   * </pre>
   *
   * <code>.tensorflow.boosted_trees.Vector vector = 1;</code>
   */
  public org.tensorflow.framework.Vector getVector() {
    if (leafCase_ == 1) {
       return (org.tensorflow.framework.Vector) leaf_;
    }
    return org.tensorflow.framework.Vector.getDefaultInstance();
  }
  /**
   * <pre>
   * See third_party/tensorflow/contrib/decision_trees/
   * proto/generic_tree_model.proto
   * for a description of how vector and sparse_vector might be used.
   * </pre>
   *
   * <code>.tensorflow.boosted_trees.Vector vector = 1;</code>
   */
  public org.tensorflow.framework.VectorOrBuilder getVectorOrBuilder() {
    if (leafCase_ == 1) {
       return (org.tensorflow.framework.Vector) leaf_;
    }
    return org.tensorflow.framework.Vector.getDefaultInstance();
  }

  public static final int SPARSE_VECTOR_FIELD_NUMBER = 2;
  /**
   * <code>.tensorflow.boosted_trees.SparseVector sparse_vector = 2;</code>
   */
  public boolean hasSparseVector() {
    return leafCase_ == 2;
  }
  /**
   * <code>.tensorflow.boosted_trees.SparseVector sparse_vector = 2;</code>
   */
  public org.tensorflow.framework.SparseVector getSparseVector() {
    if (leafCase_ == 2) {
       return (org.tensorflow.framework.SparseVector) leaf_;
    }
    return org.tensorflow.framework.SparseVector.getDefaultInstance();
  }
  /**
   * <code>.tensorflow.boosted_trees.SparseVector sparse_vector = 2;</code>
   */
  public org.tensorflow.framework.SparseVectorOrBuilder getSparseVectorOrBuilder() {
    if (leafCase_ == 2) {
       return (org.tensorflow.framework.SparseVector) leaf_;
    }
    return org.tensorflow.framework.SparseVector.getDefaultInstance();
  }

  public static final int SCALAR_FIELD_NUMBER = 3;
  private float scalar_;
  /**
   * <code>float scalar = 3;</code>
   */
  public float getScalar() {
    return scalar_;
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
    if (leafCase_ == 1) {
      output.writeMessage(1, (org.tensorflow.framework.Vector) leaf_);
    }
    if (leafCase_ == 2) {
      output.writeMessage(2, (org.tensorflow.framework.SparseVector) leaf_);
    }
    if (scalar_ != 0F) {
      output.writeFloat(3, scalar_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (leafCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (org.tensorflow.framework.Vector) leaf_);
    }
    if (leafCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (org.tensorflow.framework.SparseVector) leaf_);
    }
    if (scalar_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, scalar_);
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
    if (!(obj instanceof org.tensorflow.framework.Leaf)) {
      return super.equals(obj);
    }
    org.tensorflow.framework.Leaf other = (org.tensorflow.framework.Leaf) obj;

    boolean result = true;
    result = result && (
        java.lang.Float.floatToIntBits(getScalar())
        == java.lang.Float.floatToIntBits(
            other.getScalar()));
    result = result && getLeafCase().equals(
        other.getLeafCase());
    if (!result) return false;
    switch (leafCase_) {
      case 1:
        result = result && getVector()
            .equals(other.getVector());
        break;
      case 2:
        result = result && getSparseVector()
            .equals(other.getSparseVector());
        break;
      case 0:
      default:
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
    hash = (37 * hash) + SCALAR_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getScalar());
    switch (leafCase_) {
      case 1:
        hash = (37 * hash) + VECTOR_FIELD_NUMBER;
        hash = (53 * hash) + getVector().hashCode();
        break;
      case 2:
        hash = (37 * hash) + SPARSE_VECTOR_FIELD_NUMBER;
        hash = (53 * hash) + getSparseVector().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.framework.Leaf parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.Leaf parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.Leaf parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.Leaf parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.Leaf parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.Leaf parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.Leaf parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.Leaf parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.Leaf parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.Leaf parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.Leaf parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.Leaf parseFrom(
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
  public static Builder newBuilder(org.tensorflow.framework.Leaf prototype) {
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
   * Leaves can either hold dense or sparse information.
   * </pre>
   *
   * Protobuf type {@code tensorflow.boosted_trees.Leaf}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.boosted_trees.Leaf)
      org.tensorflow.framework.LeafOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.framework.BoostedTreesProtos.internal_static_tensorflow_boosted_trees_Leaf_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.framework.BoostedTreesProtos.internal_static_tensorflow_boosted_trees_Leaf_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.framework.Leaf.class, org.tensorflow.framework.Leaf.Builder.class);
    }

    // Construct using org.tensorflow.framework.Leaf.newBuilder()
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
      scalar_ = 0F;

      leafCase_ = 0;
      leaf_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.framework.BoostedTreesProtos.internal_static_tensorflow_boosted_trees_Leaf_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.framework.Leaf getDefaultInstanceForType() {
      return org.tensorflow.framework.Leaf.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.framework.Leaf build() {
      org.tensorflow.framework.Leaf result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.framework.Leaf buildPartial() {
      org.tensorflow.framework.Leaf result = new org.tensorflow.framework.Leaf(this);
      if (leafCase_ == 1) {
        if (vectorBuilder_ == null) {
          result.leaf_ = leaf_;
        } else {
          result.leaf_ = vectorBuilder_.build();
        }
      }
      if (leafCase_ == 2) {
        if (sparseVectorBuilder_ == null) {
          result.leaf_ = leaf_;
        } else {
          result.leaf_ = sparseVectorBuilder_.build();
        }
      }
      result.scalar_ = scalar_;
      result.leafCase_ = leafCase_;
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
      if (other instanceof org.tensorflow.framework.Leaf) {
        return mergeFrom((org.tensorflow.framework.Leaf)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.framework.Leaf other) {
      if (other == org.tensorflow.framework.Leaf.getDefaultInstance()) return this;
      if (other.getScalar() != 0F) {
        setScalar(other.getScalar());
      }
      switch (other.getLeafCase()) {
        case VECTOR: {
          mergeVector(other.getVector());
          break;
        }
        case SPARSE_VECTOR: {
          mergeSparseVector(other.getSparseVector());
          break;
        }
        case LEAF_NOT_SET: {
          break;
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
      org.tensorflow.framework.Leaf parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.framework.Leaf) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int leafCase_ = 0;
    private java.lang.Object leaf_;
    public LeafCase
        getLeafCase() {
      return LeafCase.forNumber(
          leafCase_);
    }

    public Builder clearLeaf() {
      leafCase_ = 0;
      leaf_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.framework.Vector, org.tensorflow.framework.Vector.Builder, org.tensorflow.framework.VectorOrBuilder> vectorBuilder_;
    /**
     * <pre>
     * See third_party/tensorflow/contrib/decision_trees/
     * proto/generic_tree_model.proto
     * for a description of how vector and sparse_vector might be used.
     * </pre>
     *
     * <code>.tensorflow.boosted_trees.Vector vector = 1;</code>
     */
    public boolean hasVector() {
      return leafCase_ == 1;
    }
    /**
     * <pre>
     * See third_party/tensorflow/contrib/decision_trees/
     * proto/generic_tree_model.proto
     * for a description of how vector and sparse_vector might be used.
     * </pre>
     *
     * <code>.tensorflow.boosted_trees.Vector vector = 1;</code>
     */
    public org.tensorflow.framework.Vector getVector() {
      if (vectorBuilder_ == null) {
        if (leafCase_ == 1) {
          return (org.tensorflow.framework.Vector) leaf_;
        }
        return org.tensorflow.framework.Vector.getDefaultInstance();
      } else {
        if (leafCase_ == 1) {
          return vectorBuilder_.getMessage();
        }
        return org.tensorflow.framework.Vector.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * See third_party/tensorflow/contrib/decision_trees/
     * proto/generic_tree_model.proto
     * for a description of how vector and sparse_vector might be used.
     * </pre>
     *
     * <code>.tensorflow.boosted_trees.Vector vector = 1;</code>
     */
    public Builder setVector(org.tensorflow.framework.Vector value) {
      if (vectorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        leaf_ = value;
        onChanged();
      } else {
        vectorBuilder_.setMessage(value);
      }
      leafCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * See third_party/tensorflow/contrib/decision_trees/
     * proto/generic_tree_model.proto
     * for a description of how vector and sparse_vector might be used.
     * </pre>
     *
     * <code>.tensorflow.boosted_trees.Vector vector = 1;</code>
     */
    public Builder setVector(
        org.tensorflow.framework.Vector.Builder builderForValue) {
      if (vectorBuilder_ == null) {
        leaf_ = builderForValue.build();
        onChanged();
      } else {
        vectorBuilder_.setMessage(builderForValue.build());
      }
      leafCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * See third_party/tensorflow/contrib/decision_trees/
     * proto/generic_tree_model.proto
     * for a description of how vector and sparse_vector might be used.
     * </pre>
     *
     * <code>.tensorflow.boosted_trees.Vector vector = 1;</code>
     */
    public Builder mergeVector(org.tensorflow.framework.Vector value) {
      if (vectorBuilder_ == null) {
        if (leafCase_ == 1 &&
            leaf_ != org.tensorflow.framework.Vector.getDefaultInstance()) {
          leaf_ = org.tensorflow.framework.Vector.newBuilder((org.tensorflow.framework.Vector) leaf_)
              .mergeFrom(value).buildPartial();
        } else {
          leaf_ = value;
        }
        onChanged();
      } else {
        if (leafCase_ == 1) {
          vectorBuilder_.mergeFrom(value);
        }
        vectorBuilder_.setMessage(value);
      }
      leafCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * See third_party/tensorflow/contrib/decision_trees/
     * proto/generic_tree_model.proto
     * for a description of how vector and sparse_vector might be used.
     * </pre>
     *
     * <code>.tensorflow.boosted_trees.Vector vector = 1;</code>
     */
    public Builder clearVector() {
      if (vectorBuilder_ == null) {
        if (leafCase_ == 1) {
          leafCase_ = 0;
          leaf_ = null;
          onChanged();
        }
      } else {
        if (leafCase_ == 1) {
          leafCase_ = 0;
          leaf_ = null;
        }
        vectorBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * See third_party/tensorflow/contrib/decision_trees/
     * proto/generic_tree_model.proto
     * for a description of how vector and sparse_vector might be used.
     * </pre>
     *
     * <code>.tensorflow.boosted_trees.Vector vector = 1;</code>
     */
    public org.tensorflow.framework.Vector.Builder getVectorBuilder() {
      return getVectorFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * See third_party/tensorflow/contrib/decision_trees/
     * proto/generic_tree_model.proto
     * for a description of how vector and sparse_vector might be used.
     * </pre>
     *
     * <code>.tensorflow.boosted_trees.Vector vector = 1;</code>
     */
    public org.tensorflow.framework.VectorOrBuilder getVectorOrBuilder() {
      if ((leafCase_ == 1) && (vectorBuilder_ != null)) {
        return vectorBuilder_.getMessageOrBuilder();
      } else {
        if (leafCase_ == 1) {
          return (org.tensorflow.framework.Vector) leaf_;
        }
        return org.tensorflow.framework.Vector.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * See third_party/tensorflow/contrib/decision_trees/
     * proto/generic_tree_model.proto
     * for a description of how vector and sparse_vector might be used.
     * </pre>
     *
     * <code>.tensorflow.boosted_trees.Vector vector = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.framework.Vector, org.tensorflow.framework.Vector.Builder, org.tensorflow.framework.VectorOrBuilder> 
        getVectorFieldBuilder() {
      if (vectorBuilder_ == null) {
        if (!(leafCase_ == 1)) {
          leaf_ = org.tensorflow.framework.Vector.getDefaultInstance();
        }
        vectorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.framework.Vector, org.tensorflow.framework.Vector.Builder, org.tensorflow.framework.VectorOrBuilder>(
                (org.tensorflow.framework.Vector) leaf_,
                getParentForChildren(),
                isClean());
        leaf_ = null;
      }
      leafCase_ = 1;
      onChanged();
      return vectorBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.framework.SparseVector, org.tensorflow.framework.SparseVector.Builder, org.tensorflow.framework.SparseVectorOrBuilder> sparseVectorBuilder_;
    /**
     * <code>.tensorflow.boosted_trees.SparseVector sparse_vector = 2;</code>
     */
    public boolean hasSparseVector() {
      return leafCase_ == 2;
    }
    /**
     * <code>.tensorflow.boosted_trees.SparseVector sparse_vector = 2;</code>
     */
    public org.tensorflow.framework.SparseVector getSparseVector() {
      if (sparseVectorBuilder_ == null) {
        if (leafCase_ == 2) {
          return (org.tensorflow.framework.SparseVector) leaf_;
        }
        return org.tensorflow.framework.SparseVector.getDefaultInstance();
      } else {
        if (leafCase_ == 2) {
          return sparseVectorBuilder_.getMessage();
        }
        return org.tensorflow.framework.SparseVector.getDefaultInstance();
      }
    }
    /**
     * <code>.tensorflow.boosted_trees.SparseVector sparse_vector = 2;</code>
     */
    public Builder setSparseVector(org.tensorflow.framework.SparseVector value) {
      if (sparseVectorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        leaf_ = value;
        onChanged();
      } else {
        sparseVectorBuilder_.setMessage(value);
      }
      leafCase_ = 2;
      return this;
    }
    /**
     * <code>.tensorflow.boosted_trees.SparseVector sparse_vector = 2;</code>
     */
    public Builder setSparseVector(
        org.tensorflow.framework.SparseVector.Builder builderForValue) {
      if (sparseVectorBuilder_ == null) {
        leaf_ = builderForValue.build();
        onChanged();
      } else {
        sparseVectorBuilder_.setMessage(builderForValue.build());
      }
      leafCase_ = 2;
      return this;
    }
    /**
     * <code>.tensorflow.boosted_trees.SparseVector sparse_vector = 2;</code>
     */
    public Builder mergeSparseVector(org.tensorflow.framework.SparseVector value) {
      if (sparseVectorBuilder_ == null) {
        if (leafCase_ == 2 &&
            leaf_ != org.tensorflow.framework.SparseVector.getDefaultInstance()) {
          leaf_ = org.tensorflow.framework.SparseVector.newBuilder((org.tensorflow.framework.SparseVector) leaf_)
              .mergeFrom(value).buildPartial();
        } else {
          leaf_ = value;
        }
        onChanged();
      } else {
        if (leafCase_ == 2) {
          sparseVectorBuilder_.mergeFrom(value);
        }
        sparseVectorBuilder_.setMessage(value);
      }
      leafCase_ = 2;
      return this;
    }
    /**
     * <code>.tensorflow.boosted_trees.SparseVector sparse_vector = 2;</code>
     */
    public Builder clearSparseVector() {
      if (sparseVectorBuilder_ == null) {
        if (leafCase_ == 2) {
          leafCase_ = 0;
          leaf_ = null;
          onChanged();
        }
      } else {
        if (leafCase_ == 2) {
          leafCase_ = 0;
          leaf_ = null;
        }
        sparseVectorBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.tensorflow.boosted_trees.SparseVector sparse_vector = 2;</code>
     */
    public org.tensorflow.framework.SparseVector.Builder getSparseVectorBuilder() {
      return getSparseVectorFieldBuilder().getBuilder();
    }
    /**
     * <code>.tensorflow.boosted_trees.SparseVector sparse_vector = 2;</code>
     */
    public org.tensorflow.framework.SparseVectorOrBuilder getSparseVectorOrBuilder() {
      if ((leafCase_ == 2) && (sparseVectorBuilder_ != null)) {
        return sparseVectorBuilder_.getMessageOrBuilder();
      } else {
        if (leafCase_ == 2) {
          return (org.tensorflow.framework.SparseVector) leaf_;
        }
        return org.tensorflow.framework.SparseVector.getDefaultInstance();
      }
    }
    /**
     * <code>.tensorflow.boosted_trees.SparseVector sparse_vector = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.framework.SparseVector, org.tensorflow.framework.SparseVector.Builder, org.tensorflow.framework.SparseVectorOrBuilder> 
        getSparseVectorFieldBuilder() {
      if (sparseVectorBuilder_ == null) {
        if (!(leafCase_ == 2)) {
          leaf_ = org.tensorflow.framework.SparseVector.getDefaultInstance();
        }
        sparseVectorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.framework.SparseVector, org.tensorflow.framework.SparseVector.Builder, org.tensorflow.framework.SparseVectorOrBuilder>(
                (org.tensorflow.framework.SparseVector) leaf_,
                getParentForChildren(),
                isClean());
        leaf_ = null;
      }
      leafCase_ = 2;
      onChanged();
      return sparseVectorBuilder_;
    }

    private float scalar_ ;
    /**
     * <code>float scalar = 3;</code>
     */
    public float getScalar() {
      return scalar_;
    }
    /**
     * <code>float scalar = 3;</code>
     */
    public Builder setScalar(float value) {
      
      scalar_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float scalar = 3;</code>
     */
    public Builder clearScalar() {
      
      scalar_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.boosted_trees.Leaf)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.boosted_trees.Leaf)
  private static final org.tensorflow.framework.Leaf DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.framework.Leaf();
  }

  public static org.tensorflow.framework.Leaf getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Leaf>
      PARSER = new com.google.protobuf.AbstractParser<Leaf>() {
    @java.lang.Override
    public Leaf parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Leaf(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Leaf> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Leaf> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.framework.Leaf getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

