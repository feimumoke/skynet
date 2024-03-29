// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChatService.proto

package com.skynet.dipper.commons.grpc.chat;

/**
 * Protobuf type {@code com.skynet.dipper.commons.grpc.chat.MVFriend}
 */
public  final class MVFriend extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.skynet.dipper.commons.grpc.chat.MVFriend)
    MVFriendOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MVFriend.newBuilder() to construct.
  private MVFriend(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MVFriend() {
    groupname_ = "";
    list_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MVFriend();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MVFriend(
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

            groupname_ = s;
            break;
          }
          case 16: {

            id_ = input.readInt32();
            break;
          }
          case 24: {

            online_ = input.readInt32();
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              list_ = new java.util.ArrayList<com.skynet.dipper.commons.grpc.chat.MVUser>();
              mutable_bitField0_ |= 0x00000001;
            }
            list_.add(
                input.readMessage(com.skynet.dipper.commons.grpc.chat.MVUser.parser(), extensionRegistry));
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
        list_ = java.util.Collections.unmodifiableList(list_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.skynet.dipper.commons.grpc.chat.ChatProto.internal_static_com_skynet_dipper_commons_grpc_chat_MVFriend_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.skynet.dipper.commons.grpc.chat.ChatProto.internal_static_com_skynet_dipper_commons_grpc_chat_MVFriend_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.skynet.dipper.commons.grpc.chat.MVFriend.class, com.skynet.dipper.commons.grpc.chat.MVFriend.Builder.class);
  }

  public static final int GROUPNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object groupname_;
  /**
   * <code>string groupname = 1;</code>
   * @return The groupname.
   */
  public java.lang.String getGroupname() {
    java.lang.Object ref = groupname_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      groupname_ = s;
      return s;
    }
  }
  /**
   * <code>string groupname = 1;</code>
   * @return The bytes for groupname.
   */
  public com.google.protobuf.ByteString
      getGroupnameBytes() {
    java.lang.Object ref = groupname_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      groupname_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ID_FIELD_NUMBER = 2;
  private int id_;
  /**
   * <code>int32 id = 2;</code>
   * @return The id.
   */
  public int getId() {
    return id_;
  }

  public static final int ONLINE_FIELD_NUMBER = 3;
  private int online_;
  /**
   * <code>int32 online = 3;</code>
   * @return The online.
   */
  public int getOnline() {
    return online_;
  }

  public static final int LIST_FIELD_NUMBER = 4;
  private java.util.List<com.skynet.dipper.commons.grpc.chat.MVUser> list_;
  /**
   * <code>repeated .com.skynet.dipper.commons.grpc.chat.MVUser list = 4;</code>
   */
  public java.util.List<com.skynet.dipper.commons.grpc.chat.MVUser> getListList() {
    return list_;
  }
  /**
   * <code>repeated .com.skynet.dipper.commons.grpc.chat.MVUser list = 4;</code>
   */
  public java.util.List<? extends com.skynet.dipper.commons.grpc.chat.MVUserOrBuilder> 
      getListOrBuilderList() {
    return list_;
  }
  /**
   * <code>repeated .com.skynet.dipper.commons.grpc.chat.MVUser list = 4;</code>
   */
  public int getListCount() {
    return list_.size();
  }
  /**
   * <code>repeated .com.skynet.dipper.commons.grpc.chat.MVUser list = 4;</code>
   */
  public com.skynet.dipper.commons.grpc.chat.MVUser getList(int index) {
    return list_.get(index);
  }
  /**
   * <code>repeated .com.skynet.dipper.commons.grpc.chat.MVUser list = 4;</code>
   */
  public com.skynet.dipper.commons.grpc.chat.MVUserOrBuilder getListOrBuilder(
      int index) {
    return list_.get(index);
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
    if (!getGroupnameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, groupname_);
    }
    if (id_ != 0) {
      output.writeInt32(2, id_);
    }
    if (online_ != 0) {
      output.writeInt32(3, online_);
    }
    for (int i = 0; i < list_.size(); i++) {
      output.writeMessage(4, list_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getGroupnameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, groupname_);
    }
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, id_);
    }
    if (online_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, online_);
    }
    for (int i = 0; i < list_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, list_.get(i));
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
    if (!(obj instanceof com.skynet.dipper.commons.grpc.chat.MVFriend)) {
      return super.equals(obj);
    }
    com.skynet.dipper.commons.grpc.chat.MVFriend other = (com.skynet.dipper.commons.grpc.chat.MVFriend) obj;

    if (!getGroupname()
        .equals(other.getGroupname())) return false;
    if (getId()
        != other.getId()) return false;
    if (getOnline()
        != other.getOnline()) return false;
    if (!getListList()
        .equals(other.getListList())) return false;
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
    hash = (37 * hash) + GROUPNAME_FIELD_NUMBER;
    hash = (53 * hash) + getGroupname().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + ONLINE_FIELD_NUMBER;
    hash = (53 * hash) + getOnline();
    if (getListCount() > 0) {
      hash = (37 * hash) + LIST_FIELD_NUMBER;
      hash = (53 * hash) + getListList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.skynet.dipper.commons.grpc.chat.MVFriend parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.skynet.dipper.commons.grpc.chat.MVFriend parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.skynet.dipper.commons.grpc.chat.MVFriend parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.skynet.dipper.commons.grpc.chat.MVFriend parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.skynet.dipper.commons.grpc.chat.MVFriend parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.skynet.dipper.commons.grpc.chat.MVFriend parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.skynet.dipper.commons.grpc.chat.MVFriend parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.skynet.dipper.commons.grpc.chat.MVFriend parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.skynet.dipper.commons.grpc.chat.MVFriend parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.skynet.dipper.commons.grpc.chat.MVFriend parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.skynet.dipper.commons.grpc.chat.MVFriend parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.skynet.dipper.commons.grpc.chat.MVFriend parseFrom(
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
  public static Builder newBuilder(com.skynet.dipper.commons.grpc.chat.MVFriend prototype) {
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
   * Protobuf type {@code com.skynet.dipper.commons.grpc.chat.MVFriend}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.skynet.dipper.commons.grpc.chat.MVFriend)
      com.skynet.dipper.commons.grpc.chat.MVFriendOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.skynet.dipper.commons.grpc.chat.ChatProto.internal_static_com_skynet_dipper_commons_grpc_chat_MVFriend_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.skynet.dipper.commons.grpc.chat.ChatProto.internal_static_com_skynet_dipper_commons_grpc_chat_MVFriend_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.skynet.dipper.commons.grpc.chat.MVFriend.class, com.skynet.dipper.commons.grpc.chat.MVFriend.Builder.class);
    }

    // Construct using com.skynet.dipper.commons.grpc.chat.MVFriend.newBuilder()
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
        getListFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      groupname_ = "";

      id_ = 0;

      online_ = 0;

      if (listBuilder_ == null) {
        list_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        listBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.skynet.dipper.commons.grpc.chat.ChatProto.internal_static_com_skynet_dipper_commons_grpc_chat_MVFriend_descriptor;
    }

    @java.lang.Override
    public com.skynet.dipper.commons.grpc.chat.MVFriend getDefaultInstanceForType() {
      return com.skynet.dipper.commons.grpc.chat.MVFriend.getDefaultInstance();
    }

    @java.lang.Override
    public com.skynet.dipper.commons.grpc.chat.MVFriend build() {
      com.skynet.dipper.commons.grpc.chat.MVFriend result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.skynet.dipper.commons.grpc.chat.MVFriend buildPartial() {
      com.skynet.dipper.commons.grpc.chat.MVFriend result = new com.skynet.dipper.commons.grpc.chat.MVFriend(this);
      int from_bitField0_ = bitField0_;
      result.groupname_ = groupname_;
      result.id_ = id_;
      result.online_ = online_;
      if (listBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          list_ = java.util.Collections.unmodifiableList(list_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.list_ = list_;
      } else {
        result.list_ = listBuilder_.build();
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
      if (other instanceof com.skynet.dipper.commons.grpc.chat.MVFriend) {
        return mergeFrom((com.skynet.dipper.commons.grpc.chat.MVFriend)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.skynet.dipper.commons.grpc.chat.MVFriend other) {
      if (other == com.skynet.dipper.commons.grpc.chat.MVFriend.getDefaultInstance()) return this;
      if (!other.getGroupname().isEmpty()) {
        groupname_ = other.groupname_;
        onChanged();
      }
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (other.getOnline() != 0) {
        setOnline(other.getOnline());
      }
      if (listBuilder_ == null) {
        if (!other.list_.isEmpty()) {
          if (list_.isEmpty()) {
            list_ = other.list_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureListIsMutable();
            list_.addAll(other.list_);
          }
          onChanged();
        }
      } else {
        if (!other.list_.isEmpty()) {
          if (listBuilder_.isEmpty()) {
            listBuilder_.dispose();
            listBuilder_ = null;
            list_ = other.list_;
            bitField0_ = (bitField0_ & ~0x00000001);
            listBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getListFieldBuilder() : null;
          } else {
            listBuilder_.addAllMessages(other.list_);
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
      com.skynet.dipper.commons.grpc.chat.MVFriend parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.skynet.dipper.commons.grpc.chat.MVFriend) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object groupname_ = "";
    /**
     * <code>string groupname = 1;</code>
     * @return The groupname.
     */
    public java.lang.String getGroupname() {
      java.lang.Object ref = groupname_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        groupname_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string groupname = 1;</code>
     * @return The bytes for groupname.
     */
    public com.google.protobuf.ByteString
        getGroupnameBytes() {
      java.lang.Object ref = groupname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        groupname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string groupname = 1;</code>
     * @param value The groupname to set.
     * @return This builder for chaining.
     */
    public Builder setGroupname(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      groupname_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string groupname = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGroupname() {
      
      groupname_ = getDefaultInstance().getGroupname();
      onChanged();
      return this;
    }
    /**
     * <code>string groupname = 1;</code>
     * @param value The bytes for groupname to set.
     * @return This builder for chaining.
     */
    public Builder setGroupnameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      groupname_ = value;
      onChanged();
      return this;
    }

    private int id_ ;
    /**
     * <code>int32 id = 2;</code>
     * @return The id.
     */
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 2;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private int online_ ;
    /**
     * <code>int32 online = 3;</code>
     * @return The online.
     */
    public int getOnline() {
      return online_;
    }
    /**
     * <code>int32 online = 3;</code>
     * @param value The online to set.
     * @return This builder for chaining.
     */
    public Builder setOnline(int value) {
      
      online_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 online = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOnline() {
      
      online_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.skynet.dipper.commons.grpc.chat.MVUser> list_ =
      java.util.Collections.emptyList();
    private void ensureListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        list_ = new java.util.ArrayList<com.skynet.dipper.commons.grpc.chat.MVUser>(list_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.skynet.dipper.commons.grpc.chat.MVUser, com.skynet.dipper.commons.grpc.chat.MVUser.Builder, com.skynet.dipper.commons.grpc.chat.MVUserOrBuilder> listBuilder_;

    /**
     * <code>repeated .com.skynet.dipper.commons.grpc.chat.MVUser list = 4;</code>
     */
    public java.util.List<com.skynet.dipper.commons.grpc.chat.MVUser> getListList() {
      if (listBuilder_ == null) {
        return java.util.Collections.unmodifiableList(list_);
      } else {
        return listBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.skynet.dipper.commons.grpc.chat.MVUser list = 4;</code>
     */
    public int getListCount() {
      if (listBuilder_ == null) {
        return list_.size();
      } else {
        return listBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.skynet.dipper.commons.grpc.chat.MVUser list = 4;</code>
     */
    public com.skynet.dipper.commons.grpc.chat.MVUser getList(int index) {
      if (listBuilder_ == null) {
        return list_.get(index);
      } else {
        return listBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.skynet.dipper.commons.grpc.chat.MVUser list = 4;</code>
     */
    public Builder setList(
        int index, com.skynet.dipper.commons.grpc.chat.MVUser value) {
      if (listBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureListIsMutable();
        list_.set(index, value);
        onChanged();
      } else {
        listBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.skynet.dipper.commons.grpc.chat.MVUser list = 4;</code>
     */
    public Builder setList(
        int index, com.skynet.dipper.commons.grpc.chat.MVUser.Builder builderForValue) {
      if (listBuilder_ == null) {
        ensureListIsMutable();
        list_.set(index, builderForValue.build());
        onChanged();
      } else {
        listBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.skynet.dipper.commons.grpc.chat.MVUser list = 4;</code>
     */
    public Builder addList(com.skynet.dipper.commons.grpc.chat.MVUser value) {
      if (listBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureListIsMutable();
        list_.add(value);
        onChanged();
      } else {
        listBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.skynet.dipper.commons.grpc.chat.MVUser list = 4;</code>
     */
    public Builder addList(
        int index, com.skynet.dipper.commons.grpc.chat.MVUser value) {
      if (listBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureListIsMutable();
        list_.add(index, value);
        onChanged();
      } else {
        listBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.skynet.dipper.commons.grpc.chat.MVUser list = 4;</code>
     */
    public Builder addList(
        com.skynet.dipper.commons.grpc.chat.MVUser.Builder builderForValue) {
      if (listBuilder_ == null) {
        ensureListIsMutable();
        list_.add(builderForValue.build());
        onChanged();
      } else {
        listBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.skynet.dipper.commons.grpc.chat.MVUser list = 4;</code>
     */
    public Builder addList(
        int index, com.skynet.dipper.commons.grpc.chat.MVUser.Builder builderForValue) {
      if (listBuilder_ == null) {
        ensureListIsMutable();
        list_.add(index, builderForValue.build());
        onChanged();
      } else {
        listBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.skynet.dipper.commons.grpc.chat.MVUser list = 4;</code>
     */
    public Builder addAllList(
        java.lang.Iterable<? extends com.skynet.dipper.commons.grpc.chat.MVUser> values) {
      if (listBuilder_ == null) {
        ensureListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, list_);
        onChanged();
      } else {
        listBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.skynet.dipper.commons.grpc.chat.MVUser list = 4;</code>
     */
    public Builder clearList() {
      if (listBuilder_ == null) {
        list_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        listBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.skynet.dipper.commons.grpc.chat.MVUser list = 4;</code>
     */
    public Builder removeList(int index) {
      if (listBuilder_ == null) {
        ensureListIsMutable();
        list_.remove(index);
        onChanged();
      } else {
        listBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.skynet.dipper.commons.grpc.chat.MVUser list = 4;</code>
     */
    public com.skynet.dipper.commons.grpc.chat.MVUser.Builder getListBuilder(
        int index) {
      return getListFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.skynet.dipper.commons.grpc.chat.MVUser list = 4;</code>
     */
    public com.skynet.dipper.commons.grpc.chat.MVUserOrBuilder getListOrBuilder(
        int index) {
      if (listBuilder_ == null) {
        return list_.get(index);  } else {
        return listBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.skynet.dipper.commons.grpc.chat.MVUser list = 4;</code>
     */
    public java.util.List<? extends com.skynet.dipper.commons.grpc.chat.MVUserOrBuilder> 
         getListOrBuilderList() {
      if (listBuilder_ != null) {
        return listBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(list_);
      }
    }
    /**
     * <code>repeated .com.skynet.dipper.commons.grpc.chat.MVUser list = 4;</code>
     */
    public com.skynet.dipper.commons.grpc.chat.MVUser.Builder addListBuilder() {
      return getListFieldBuilder().addBuilder(
          com.skynet.dipper.commons.grpc.chat.MVUser.getDefaultInstance());
    }
    /**
     * <code>repeated .com.skynet.dipper.commons.grpc.chat.MVUser list = 4;</code>
     */
    public com.skynet.dipper.commons.grpc.chat.MVUser.Builder addListBuilder(
        int index) {
      return getListFieldBuilder().addBuilder(
          index, com.skynet.dipper.commons.grpc.chat.MVUser.getDefaultInstance());
    }
    /**
     * <code>repeated .com.skynet.dipper.commons.grpc.chat.MVUser list = 4;</code>
     */
    public java.util.List<com.skynet.dipper.commons.grpc.chat.MVUser.Builder> 
         getListBuilderList() {
      return getListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.skynet.dipper.commons.grpc.chat.MVUser, com.skynet.dipper.commons.grpc.chat.MVUser.Builder, com.skynet.dipper.commons.grpc.chat.MVUserOrBuilder> 
        getListFieldBuilder() {
      if (listBuilder_ == null) {
        listBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.skynet.dipper.commons.grpc.chat.MVUser, com.skynet.dipper.commons.grpc.chat.MVUser.Builder, com.skynet.dipper.commons.grpc.chat.MVUserOrBuilder>(
                list_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        list_ = null;
      }
      return listBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.skynet.dipper.commons.grpc.chat.MVFriend)
  }

  // @@protoc_insertion_point(class_scope:com.skynet.dipper.commons.grpc.chat.MVFriend)
  private static final com.skynet.dipper.commons.grpc.chat.MVFriend DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.skynet.dipper.commons.grpc.chat.MVFriend();
  }

  public static com.skynet.dipper.commons.grpc.chat.MVFriend getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MVFriend>
      PARSER = new com.google.protobuf.AbstractParser<MVFriend>() {
    @java.lang.Override
    public MVFriend parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MVFriend(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MVFriend> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MVFriend> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.skynet.dipper.commons.grpc.chat.MVFriend getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

