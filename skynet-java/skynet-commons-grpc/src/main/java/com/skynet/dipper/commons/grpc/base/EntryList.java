// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BaseService.proto

package com.skynet.dipper.commons.grpc.base;

/**
 * Protobuf type {@code com.skynet.dipper.commons.grpc.base.EntryList}
 */
public  final class EntryList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.skynet.dipper.commons.grpc.base.EntryList)
    EntryListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EntryList.newBuilder() to construct.
  private EntryList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EntryList() {
    type_ = 0;
    entry_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EntryList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EntryList(
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
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              entry_ = new java.util.ArrayList<com.google.protobuf.Any>();
              mutable_bitField0_ |= 0x00000001;
            }
            entry_.add(
                input.readMessage(com.google.protobuf.Any.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        entry_ = java.util.Collections.unmodifiableList(entry_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.skynet.dipper.commons.grpc.base.BaseServiceProto.internal_static_com_skynet_dipper_commons_grpc_base_EntryList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.skynet.dipper.commons.grpc.base.BaseServiceProto.internal_static_com_skynet_dipper_commons_grpc_base_EntryList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.skynet.dipper.commons.grpc.base.EntryList.class, com.skynet.dipper.commons.grpc.base.EntryList.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <code>.com.skynet.dipper.commons.grpc.base.MessageType type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.com.skynet.dipper.commons.grpc.base.MessageType type = 1;</code>
   * @return The type.
   */
  public com.skynet.dipper.commons.grpc.base.MessageType getType() {
    @SuppressWarnings("deprecation")
    com.skynet.dipper.commons.grpc.base.MessageType result = com.skynet.dipper.commons.grpc.base.MessageType.valueOf(type_);
    return result == null ? com.skynet.dipper.commons.grpc.base.MessageType.UNRECOGNIZED : result;
  }

  public static final int ENTRY_FIELD_NUMBER = 2;
  private java.util.List<com.google.protobuf.Any> entry_;
  /**
   * <code>repeated .google.protobuf.Any entry = 2;</code>
   */
  public java.util.List<com.google.protobuf.Any> getEntryList() {
    return entry_;
  }
  /**
   * <code>repeated .google.protobuf.Any entry = 2;</code>
   */
  public java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
      getEntryOrBuilderList() {
    return entry_;
  }
  /**
   * <code>repeated .google.protobuf.Any entry = 2;</code>
   */
  public int getEntryCount() {
    return entry_.size();
  }
  /**
   * <code>repeated .google.protobuf.Any entry = 2;</code>
   */
  public com.google.protobuf.Any getEntry(int index) {
    return entry_.get(index);
  }
  /**
   * <code>repeated .google.protobuf.Any entry = 2;</code>
   */
  public com.google.protobuf.AnyOrBuilder getEntryOrBuilder(
      int index) {
    return entry_.get(index);
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
    if (type_ != com.skynet.dipper.commons.grpc.base.MessageType.FRIEND.getNumber()) {
      output.writeEnum(1, type_);
    }
    for (int i = 0; i < entry_.size(); i++) {
      output.writeMessage(2, entry_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != com.skynet.dipper.commons.grpc.base.MessageType.FRIEND.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    for (int i = 0; i < entry_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, entry_.get(i));
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
    if (!(obj instanceof com.skynet.dipper.commons.grpc.base.EntryList)) {
      return super.equals(obj);
    }
    com.skynet.dipper.commons.grpc.base.EntryList other = (com.skynet.dipper.commons.grpc.base.EntryList) obj;

    if (type_ != other.type_) return false;
    if (!getEntryList()
        .equals(other.getEntryList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    if (getEntryCount() > 0) {
      hash = (37 * hash) + ENTRY_FIELD_NUMBER;
      hash = (53 * hash) + getEntryList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.skynet.dipper.commons.grpc.base.EntryList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.skynet.dipper.commons.grpc.base.EntryList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.skynet.dipper.commons.grpc.base.EntryList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.skynet.dipper.commons.grpc.base.EntryList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.skynet.dipper.commons.grpc.base.EntryList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.skynet.dipper.commons.grpc.base.EntryList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.skynet.dipper.commons.grpc.base.EntryList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.skynet.dipper.commons.grpc.base.EntryList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.skynet.dipper.commons.grpc.base.EntryList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.skynet.dipper.commons.grpc.base.EntryList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.skynet.dipper.commons.grpc.base.EntryList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.skynet.dipper.commons.grpc.base.EntryList parseFrom(
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
  public static Builder newBuilder(com.skynet.dipper.commons.grpc.base.EntryList prototype) {
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
   * Protobuf type {@code com.skynet.dipper.commons.grpc.base.EntryList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.skynet.dipper.commons.grpc.base.EntryList)
      com.skynet.dipper.commons.grpc.base.EntryListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.skynet.dipper.commons.grpc.base.BaseServiceProto.internal_static_com_skynet_dipper_commons_grpc_base_EntryList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.skynet.dipper.commons.grpc.base.BaseServiceProto.internal_static_com_skynet_dipper_commons_grpc_base_EntryList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.skynet.dipper.commons.grpc.base.EntryList.class, com.skynet.dipper.commons.grpc.base.EntryList.Builder.class);
    }

    // Construct using com.skynet.dipper.commons.grpc.base.EntryList.newBuilder()
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
        getEntryFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      type_ = 0;

      if (entryBuilder_ == null) {
        entry_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        entryBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.skynet.dipper.commons.grpc.base.BaseServiceProto.internal_static_com_skynet_dipper_commons_grpc_base_EntryList_descriptor;
    }

    @java.lang.Override
    public com.skynet.dipper.commons.grpc.base.EntryList getDefaultInstanceForType() {
      return com.skynet.dipper.commons.grpc.base.EntryList.getDefaultInstance();
    }

    @java.lang.Override
    public com.skynet.dipper.commons.grpc.base.EntryList build() {
      com.skynet.dipper.commons.grpc.base.EntryList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.skynet.dipper.commons.grpc.base.EntryList buildPartial() {
      com.skynet.dipper.commons.grpc.base.EntryList result = new com.skynet.dipper.commons.grpc.base.EntryList(this);
      int from_bitField0_ = bitField0_;
      result.type_ = type_;
      if (entryBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          entry_ = java.util.Collections.unmodifiableList(entry_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.entry_ = entry_;
      } else {
        result.entry_ = entryBuilder_.build();
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
      if (other instanceof com.skynet.dipper.commons.grpc.base.EntryList) {
        return mergeFrom((com.skynet.dipper.commons.grpc.base.EntryList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.skynet.dipper.commons.grpc.base.EntryList other) {
      if (other == com.skynet.dipper.commons.grpc.base.EntryList.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (entryBuilder_ == null) {
        if (!other.entry_.isEmpty()) {
          if (entry_.isEmpty()) {
            entry_ = other.entry_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEntryIsMutable();
            entry_.addAll(other.entry_);
          }
          onChanged();
        }
      } else {
        if (!other.entry_.isEmpty()) {
          if (entryBuilder_.isEmpty()) {
            entryBuilder_.dispose();
            entryBuilder_ = null;
            entry_ = other.entry_;
            bitField0_ = (bitField0_ & ~0x00000001);
            entryBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEntryFieldBuilder() : null;
          } else {
            entryBuilder_.addAllMessages(other.entry_);
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
      com.skynet.dipper.commons.grpc.base.EntryList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.skynet.dipper.commons.grpc.base.EntryList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int type_ = 0;
    /**
     * <code>.com.skynet.dipper.commons.grpc.base.MessageType type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.com.skynet.dipper.commons.grpc.base.MessageType type = 1;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.com.skynet.dipper.commons.grpc.base.MessageType type = 1;</code>
     * @return The type.
     */
    public com.skynet.dipper.commons.grpc.base.MessageType getType() {
      @SuppressWarnings("deprecation")
      com.skynet.dipper.commons.grpc.base.MessageType result = com.skynet.dipper.commons.grpc.base.MessageType.valueOf(type_);
      return result == null ? com.skynet.dipper.commons.grpc.base.MessageType.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.skynet.dipper.commons.grpc.base.MessageType type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.skynet.dipper.commons.grpc.base.MessageType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.skynet.dipper.commons.grpc.base.MessageType type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.google.protobuf.Any> entry_ =
      java.util.Collections.emptyList();
    private void ensureEntryIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        entry_ = new java.util.ArrayList<com.google.protobuf.Any>(entry_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> entryBuilder_;

    /**
     * <code>repeated .google.protobuf.Any entry = 2;</code>
     */
    public java.util.List<com.google.protobuf.Any> getEntryList() {
      if (entryBuilder_ == null) {
        return java.util.Collections.unmodifiableList(entry_);
      } else {
        return entryBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .google.protobuf.Any entry = 2;</code>
     */
    public int getEntryCount() {
      if (entryBuilder_ == null) {
        return entry_.size();
      } else {
        return entryBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .google.protobuf.Any entry = 2;</code>
     */
    public com.google.protobuf.Any getEntry(int index) {
      if (entryBuilder_ == null) {
        return entry_.get(index);
      } else {
        return entryBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .google.protobuf.Any entry = 2;</code>
     */
    public Builder setEntry(
        int index, com.google.protobuf.Any value) {
      if (entryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntryIsMutable();
        entry_.set(index, value);
        onChanged();
      } else {
        entryBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Any entry = 2;</code>
     */
    public Builder setEntry(
        int index, com.google.protobuf.Any.Builder builderForValue) {
      if (entryBuilder_ == null) {
        ensureEntryIsMutable();
        entry_.set(index, builderForValue.build());
        onChanged();
      } else {
        entryBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Any entry = 2;</code>
     */
    public Builder addEntry(com.google.protobuf.Any value) {
      if (entryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntryIsMutable();
        entry_.add(value);
        onChanged();
      } else {
        entryBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Any entry = 2;</code>
     */
    public Builder addEntry(
        int index, com.google.protobuf.Any value) {
      if (entryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntryIsMutable();
        entry_.add(index, value);
        onChanged();
      } else {
        entryBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Any entry = 2;</code>
     */
    public Builder addEntry(
        com.google.protobuf.Any.Builder builderForValue) {
      if (entryBuilder_ == null) {
        ensureEntryIsMutable();
        entry_.add(builderForValue.build());
        onChanged();
      } else {
        entryBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Any entry = 2;</code>
     */
    public Builder addEntry(
        int index, com.google.protobuf.Any.Builder builderForValue) {
      if (entryBuilder_ == null) {
        ensureEntryIsMutable();
        entry_.add(index, builderForValue.build());
        onChanged();
      } else {
        entryBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Any entry = 2;</code>
     */
    public Builder addAllEntry(
        java.lang.Iterable<? extends com.google.protobuf.Any> values) {
      if (entryBuilder_ == null) {
        ensureEntryIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, entry_);
        onChanged();
      } else {
        entryBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Any entry = 2;</code>
     */
    public Builder clearEntry() {
      if (entryBuilder_ == null) {
        entry_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        entryBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Any entry = 2;</code>
     */
    public Builder removeEntry(int index) {
      if (entryBuilder_ == null) {
        ensureEntryIsMutable();
        entry_.remove(index);
        onChanged();
      } else {
        entryBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Any entry = 2;</code>
     */
    public com.google.protobuf.Any.Builder getEntryBuilder(
        int index) {
      return getEntryFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .google.protobuf.Any entry = 2;</code>
     */
    public com.google.protobuf.AnyOrBuilder getEntryOrBuilder(
        int index) {
      if (entryBuilder_ == null) {
        return entry_.get(index);  } else {
        return entryBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .google.protobuf.Any entry = 2;</code>
     */
    public java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
         getEntryOrBuilderList() {
      if (entryBuilder_ != null) {
        return entryBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(entry_);
      }
    }
    /**
     * <code>repeated .google.protobuf.Any entry = 2;</code>
     */
    public com.google.protobuf.Any.Builder addEntryBuilder() {
      return getEntryFieldBuilder().addBuilder(
          com.google.protobuf.Any.getDefaultInstance());
    }
    /**
     * <code>repeated .google.protobuf.Any entry = 2;</code>
     */
    public com.google.protobuf.Any.Builder addEntryBuilder(
        int index) {
      return getEntryFieldBuilder().addBuilder(
          index, com.google.protobuf.Any.getDefaultInstance());
    }
    /**
     * <code>repeated .google.protobuf.Any entry = 2;</code>
     */
    public java.util.List<com.google.protobuf.Any.Builder> 
         getEntryBuilderList() {
      return getEntryFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getEntryFieldBuilder() {
      if (entryBuilder_ == null) {
        entryBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                entry_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        entry_ = null;
      }
      return entryBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.skynet.dipper.commons.grpc.base.EntryList)
  }

  // @@protoc_insertion_point(class_scope:com.skynet.dipper.commons.grpc.base.EntryList)
  private static final com.skynet.dipper.commons.grpc.base.EntryList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.skynet.dipper.commons.grpc.base.EntryList();
  }

  public static com.skynet.dipper.commons.grpc.base.EntryList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EntryList>
      PARSER = new com.google.protobuf.AbstractParser<EntryList>() {
    @java.lang.Override
    public EntryList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EntryList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EntryList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EntryList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.skynet.dipper.commons.grpc.base.EntryList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

