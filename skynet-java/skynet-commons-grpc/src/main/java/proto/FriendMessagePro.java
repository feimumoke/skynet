// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FriendMessageService.proto

package proto;

/**
 * Protobuf type {@code com.skynet.commons.grpc.dipper.proto.FriendMessagePro}
 */
public  final class FriendMessagePro extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.skynet.commons.grpc.dipper.proto.FriendMessagePro)
        FriendMessageProOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FriendMessagePro.newBuilder() to construct.
  private FriendMessagePro(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FriendMessagePro() {
    content_ = "";
    sendTime_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new FriendMessagePro();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FriendMessagePro(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
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

            id_ = input.readInt32();
            break;
          }
          case 16: {

            fromUserId_ = input.readInt32();
            break;
          }
          case 24: {

            toUserId_ = input.readInt32();
            break;
          }
          case 34: {
            String s = input.readStringRequireUtf8();

            content_ = s;
            break;
          }
          case 42: {
            String s = input.readStringRequireUtf8();

            sendTime_ = s;
            break;
          }
          case 48: {

            isRead_ = input.readInt32();
            break;
          }
          case 56: {

            isDel_ = input.readInt32();
            break;
          }
          case 64: {

            isBack_ = input.readInt32();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return FriendMessageProto.internal_static_com_skynet_commons_grpc_dipper_proto_FriendMessagePro_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return FriendMessageProto.internal_static_com_skynet_commons_grpc_dipper_proto_FriendMessagePro_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            FriendMessagePro.class, FriendMessagePro.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  public int getId() {
    return id_;
  }

  public static final int FROM_USER_ID_FIELD_NUMBER = 2;
  private int fromUserId_;
  /**
   * <code>int32 from_user_id = 2;</code>
   * @return The fromUserId.
   */
  public int getFromUserId() {
    return fromUserId_;
  }

  public static final int TO_USER_ID_FIELD_NUMBER = 3;
  private int toUserId_;
  /**
   * <code>int32 to_user_id = 3;</code>
   * @return The toUserId.
   */
  public int getToUserId() {
    return toUserId_;
  }

  public static final int CONTENT_FIELD_NUMBER = 4;
  private volatile Object content_;
  /**
   * <code>string content = 4;</code>
   * @return The content.
   */
  public String getContent() {
    Object ref = content_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      content_ = s;
      return s;
    }
  }
  /**
   * <code>string content = 4;</code>
   * @return The bytes for content.
   */
  public com.google.protobuf.ByteString
      getContentBytes() {
    Object ref = content_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      content_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SEND_TIME_FIELD_NUMBER = 5;
  private volatile Object sendTime_;
  /**
   * <code>string send_time = 5;</code>
   * @return The sendTime.
   */
  public String getSendTime() {
    Object ref = sendTime_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      sendTime_ = s;
      return s;
    }
  }
  /**
   * <code>string send_time = 5;</code>
   * @return The bytes for sendTime.
   */
  public com.google.protobuf.ByteString
      getSendTimeBytes() {
    Object ref = sendTime_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      sendTime_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IS_READ_FIELD_NUMBER = 6;
  private int isRead_;
  /**
   * <code>int32 is_read = 6;</code>
   * @return The isRead.
   */
  public int getIsRead() {
    return isRead_;
  }

  public static final int IS_DEL_FIELD_NUMBER = 7;
  private int isDel_;
  /**
   * <code>int32 is_del = 7;</code>
   * @return The isDel.
   */
  public int getIsDel() {
    return isDel_;
  }

  public static final int IS_BACK_FIELD_NUMBER = 8;
  private int isBack_;
  /**
   * <code>int32 is_back = 8;</code>
   * @return The isBack.
   */
  public int getIsBack() {
    return isBack_;
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    if (fromUserId_ != 0) {
      output.writeInt32(2, fromUserId_);
    }
    if (toUserId_ != 0) {
      output.writeInt32(3, toUserId_);
    }
    if (!getContentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, content_);
    }
    if (!getSendTimeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, sendTime_);
    }
    if (isRead_ != 0) {
      output.writeInt32(6, isRead_);
    }
    if (isDel_ != 0) {
      output.writeInt32(7, isDel_);
    }
    if (isBack_ != 0) {
      output.writeInt32(8, isBack_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (fromUserId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, fromUserId_);
    }
    if (toUserId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, toUserId_);
    }
    if (!getContentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, content_);
    }
    if (!getSendTimeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, sendTime_);
    }
    if (isRead_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, isRead_);
    }
    if (isDel_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, isDel_);
    }
    if (isBack_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(8, isBack_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof FriendMessagePro)) {
      return super.equals(obj);
    }
    FriendMessagePro other = (FriendMessagePro) obj;

    if (getId()
        != other.getId()) return false;
    if (getFromUserId()
        != other.getFromUserId()) return false;
    if (getToUserId()
        != other.getToUserId()) return false;
    if (!getContent()
        .equals(other.getContent())) return false;
    if (!getSendTime()
        .equals(other.getSendTime())) return false;
    if (getIsRead()
        != other.getIsRead()) return false;
    if (getIsDel()
        != other.getIsDel()) return false;
    if (getIsBack()
        != other.getIsBack()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + FROM_USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getFromUserId();
    hash = (37 * hash) + TO_USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getToUserId();
    hash = (37 * hash) + CONTENT_FIELD_NUMBER;
    hash = (53 * hash) + getContent().hashCode();
    hash = (37 * hash) + SEND_TIME_FIELD_NUMBER;
    hash = (53 * hash) + getSendTime().hashCode();
    hash = (37 * hash) + IS_READ_FIELD_NUMBER;
    hash = (53 * hash) + getIsRead();
    hash = (37 * hash) + IS_DEL_FIELD_NUMBER;
    hash = (53 * hash) + getIsDel();
    hash = (37 * hash) + IS_BACK_FIELD_NUMBER;
    hash = (53 * hash) + getIsBack();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static FriendMessagePro parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static FriendMessagePro parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static FriendMessagePro parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static FriendMessagePro parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static FriendMessagePro parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static FriendMessagePro parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static FriendMessagePro parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static FriendMessagePro parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static FriendMessagePro parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static FriendMessagePro parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static FriendMessagePro parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static FriendMessagePro parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(FriendMessagePro prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.skynet.commons.grpc.dipper.proto.FriendMessagePro}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.skynet.commons.grpc.dipper.proto.FriendMessagePro)
          FriendMessageProOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return FriendMessageProto.internal_static_com_skynet_commons_grpc_dipper_proto_FriendMessagePro_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return FriendMessageProto.internal_static_com_skynet_commons_grpc_dipper_proto_FriendMessagePro_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              FriendMessagePro.class, FriendMessagePro.Builder.class);
    }

    // Construct using com.skynet.commons.grpc.dipper.proto.FriendMessagePro.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      id_ = 0;

      fromUserId_ = 0;

      toUserId_ = 0;

      content_ = "";

      sendTime_ = "";

      isRead_ = 0;

      isDel_ = 0;

      isBack_ = 0;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return FriendMessageProto.internal_static_com_skynet_commons_grpc_dipper_proto_FriendMessagePro_descriptor;
    }

    @Override
    public FriendMessagePro getDefaultInstanceForType() {
      return FriendMessagePro.getDefaultInstance();
    }

    @Override
    public FriendMessagePro build() {
      FriendMessagePro result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public FriendMessagePro buildPartial() {
      FriendMessagePro result = new FriendMessagePro(this);
      result.id_ = id_;
      result.fromUserId_ = fromUserId_;
      result.toUserId_ = toUserId_;
      result.content_ = content_;
      result.sendTime_ = sendTime_;
      result.isRead_ = isRead_;
      result.isDel_ = isDel_;
      result.isBack_ = isBack_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof FriendMessagePro) {
        return mergeFrom((FriendMessagePro)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(FriendMessagePro other) {
      if (other == FriendMessagePro.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (other.getFromUserId() != 0) {
        setFromUserId(other.getFromUserId());
      }
      if (other.getToUserId() != 0) {
        setToUserId(other.getToUserId());
      }
      if (!other.getContent().isEmpty()) {
        content_ = other.content_;
        onChanged();
      }
      if (!other.getSendTime().isEmpty()) {
        sendTime_ = other.sendTime_;
        onChanged();
      }
      if (other.getIsRead() != 0) {
        setIsRead(other.getIsRead());
      }
      if (other.getIsDel() != 0) {
        setIsDel(other.getIsDel());
      }
      if (other.getIsBack() != 0) {
        setIsBack(other.getIsBack());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      FriendMessagePro parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (FriendMessagePro) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int id_ ;
    /**
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(int value) {

      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {

      id_ = 0;
      onChanged();
      return this;
    }

    private int fromUserId_ ;
    /**
     * <code>int32 from_user_id = 2;</code>
     * @return The fromUserId.
     */
    public int getFromUserId() {
      return fromUserId_;
    }
    /**
     * <code>int32 from_user_id = 2;</code>
     * @param value The fromUserId to set.
     * @return This builder for chaining.
     */
    public Builder setFromUserId(int value) {

      fromUserId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 from_user_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFromUserId() {

      fromUserId_ = 0;
      onChanged();
      return this;
    }

    private int toUserId_ ;
    /**
     * <code>int32 to_user_id = 3;</code>
     * @return The toUserId.
     */
    public int getToUserId() {
      return toUserId_;
    }
    /**
     * <code>int32 to_user_id = 3;</code>
     * @param value The toUserId to set.
     * @return This builder for chaining.
     */
    public Builder setToUserId(int value) {

      toUserId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 to_user_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearToUserId() {

      toUserId_ = 0;
      onChanged();
      return this;
    }

    private Object content_ = "";
    /**
     * <code>string content = 4;</code>
     * @return The content.
     */
    public String getContent() {
      Object ref = content_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        content_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string content = 4;</code>
     * @return The bytes for content.
     */
    public com.google.protobuf.ByteString
        getContentBytes() {
      Object ref = content_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        content_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string content = 4;</code>
     * @param value The content to set.
     * @return This builder for chaining.
     */
    public Builder setContent(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      content_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string content = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearContent() {

      content_ = getDefaultInstance().getContent();
      onChanged();
      return this;
    }
    /**
     * <code>string content = 4;</code>
     * @param value The bytes for content to set.
     * @return This builder for chaining.
     */
    public Builder setContentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      content_ = value;
      onChanged();
      return this;
    }

    private Object sendTime_ = "";
    /**
     * <code>string send_time = 5;</code>
     * @return The sendTime.
     */
    public String getSendTime() {
      Object ref = sendTime_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        sendTime_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string send_time = 5;</code>
     * @return The bytes for sendTime.
     */
    public com.google.protobuf.ByteString
        getSendTimeBytes() {
      Object ref = sendTime_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        sendTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string send_time = 5;</code>
     * @param value The sendTime to set.
     * @return This builder for chaining.
     */
    public Builder setSendTime(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      sendTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string send_time = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearSendTime() {

      sendTime_ = getDefaultInstance().getSendTime();
      onChanged();
      return this;
    }
    /**
     * <code>string send_time = 5;</code>
     * @param value The bytes for sendTime to set.
     * @return This builder for chaining.
     */
    public Builder setSendTimeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      sendTime_ = value;
      onChanged();
      return this;
    }

    private int isRead_ ;
    /**
     * <code>int32 is_read = 6;</code>
     * @return The isRead.
     */
    public int getIsRead() {
      return isRead_;
    }
    /**
     * <code>int32 is_read = 6;</code>
     * @param value The isRead to set.
     * @return This builder for chaining.
     */
    public Builder setIsRead(int value) {

      isRead_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 is_read = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsRead() {

      isRead_ = 0;
      onChanged();
      return this;
    }

    private int isDel_ ;
    /**
     * <code>int32 is_del = 7;</code>
     * @return The isDel.
     */
    public int getIsDel() {
      return isDel_;
    }
    /**
     * <code>int32 is_del = 7;</code>
     * @param value The isDel to set.
     * @return This builder for chaining.
     */
    public Builder setIsDel(int value) {

      isDel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 is_del = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsDel() {

      isDel_ = 0;
      onChanged();
      return this;
    }

    private int isBack_ ;
    /**
     * <code>int32 is_back = 8;</code>
     * @return The isBack.
     */
    public int getIsBack() {
      return isBack_;
    }
    /**
     * <code>int32 is_back = 8;</code>
     * @param value The isBack to set.
     * @return This builder for chaining.
     */
    public Builder setIsBack(int value) {

      isBack_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 is_back = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsBack() {

      isBack_ = 0;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.skynet.commons.grpc.dipper.proto.FriendMessagePro)
  }

  // @@protoc_insertion_point(class_scope:com.skynet.commons.grpc.dipper.proto.FriendMessagePro)
  private static final FriendMessagePro DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new FriendMessagePro();
  }

  public static FriendMessagePro getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FriendMessagePro>
      PARSER = new com.google.protobuf.AbstractParser<FriendMessagePro>() {
    @Override
    public FriendMessagePro parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FriendMessagePro(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FriendMessagePro> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<FriendMessagePro> getParserForType() {
    return PARSER;
  }

  @Override
  public FriendMessagePro getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

