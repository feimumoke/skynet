// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GroupMessageService.proto

package proto;

/**
 * Protobuf type {@code com.skynet.commons.grpc.dipper.proto.GroupMessagePro}
 */
public  final class GroupMessagePro extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.skynet.commons.grpc.dipper.proto.GroupMessagePro)
        GroupMessageProOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GroupMessagePro.newBuilder() to construct.
  private GroupMessagePro(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GroupMessagePro() {
    content_ = "";
    sendTime_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new GroupMessagePro();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GroupMessagePro(
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

            userId_ = input.readInt32();
            break;
          }
          case 24: {

            groupId_ = input.readInt32();
            break;
          }
          case 34: {
            String s = input.readStringRequireUtf8();

            content_ = s;
            break;
          }
          case 40: {

            isDel_ = input.readInt32();
            break;
          }
          case 48: {

            isRead_ = input.readInt32();
            break;
          }
          case 58: {
            String s = input.readStringRequireUtf8();

            sendTime_ = s;
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
    return GroupMessageProto.internal_static_com_skynet_commons_grpc_dipper_proto_GroupMessagePro_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return GroupMessageProto.internal_static_com_skynet_commons_grpc_dipper_proto_GroupMessagePro_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            GroupMessagePro.class, GroupMessagePro.Builder.class);
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

  public static final int USER_ID_FIELD_NUMBER = 2;
  private int userId_;
  /**
   * <code>int32 user_id = 2;</code>
   * @return The userId.
   */
  public int getUserId() {
    return userId_;
  }

  public static final int GROUP_ID_FIELD_NUMBER = 3;
  private int groupId_;
  /**
   * <code>int32 group_id = 3;</code>
   * @return The groupId.
   */
  public int getGroupId() {
    return groupId_;
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

  public static final int IS_DEL_FIELD_NUMBER = 5;
  private int isDel_;
  /**
   * <code>int32 is_del = 5;</code>
   * @return The isDel.
   */
  public int getIsDel() {
    return isDel_;
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

  public static final int SEND_TIME_FIELD_NUMBER = 7;
  private volatile Object sendTime_;
  /**
   * <code>string send_time = 7;</code>
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
   * <code>string send_time = 7;</code>
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
    if (userId_ != 0) {
      output.writeInt32(2, userId_);
    }
    if (groupId_ != 0) {
      output.writeInt32(3, groupId_);
    }
    if (!getContentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, content_);
    }
    if (isDel_ != 0) {
      output.writeInt32(5, isDel_);
    }
    if (isRead_ != 0) {
      output.writeInt32(6, isRead_);
    }
    if (!getSendTimeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, sendTime_);
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
    if (userId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, userId_);
    }
    if (groupId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, groupId_);
    }
    if (!getContentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, content_);
    }
    if (isDel_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, isDel_);
    }
    if (isRead_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, isRead_);
    }
    if (!getSendTimeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, sendTime_);
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
    if (!(obj instanceof GroupMessagePro)) {
      return super.equals(obj);
    }
    GroupMessagePro other = (GroupMessagePro) obj;

    if (getId()
        != other.getId()) return false;
    if (getUserId()
        != other.getUserId()) return false;
    if (getGroupId()
        != other.getGroupId()) return false;
    if (!getContent()
        .equals(other.getContent())) return false;
    if (getIsDel()
        != other.getIsDel()) return false;
    if (getIsRead()
        != other.getIsRead()) return false;
    if (!getSendTime()
        .equals(other.getSendTime())) return false;
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
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId();
    hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
    hash = (53 * hash) + getGroupId();
    hash = (37 * hash) + CONTENT_FIELD_NUMBER;
    hash = (53 * hash) + getContent().hashCode();
    hash = (37 * hash) + IS_DEL_FIELD_NUMBER;
    hash = (53 * hash) + getIsDel();
    hash = (37 * hash) + IS_READ_FIELD_NUMBER;
    hash = (53 * hash) + getIsRead();
    hash = (37 * hash) + SEND_TIME_FIELD_NUMBER;
    hash = (53 * hash) + getSendTime().hashCode();
    hash = (37 * hash) + IS_BACK_FIELD_NUMBER;
    hash = (53 * hash) + getIsBack();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static GroupMessagePro parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GroupMessagePro parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GroupMessagePro parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GroupMessagePro parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GroupMessagePro parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GroupMessagePro parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GroupMessagePro parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static GroupMessagePro parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static GroupMessagePro parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static GroupMessagePro parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static GroupMessagePro parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static GroupMessagePro parseFrom(
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
  public static Builder newBuilder(GroupMessagePro prototype) {
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
   * Protobuf type {@code com.skynet.commons.grpc.dipper.proto.GroupMessagePro}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.skynet.commons.grpc.dipper.proto.GroupMessagePro)
          GroupMessageProOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GroupMessageProto.internal_static_com_skynet_commons_grpc_dipper_proto_GroupMessagePro_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GroupMessageProto.internal_static_com_skynet_commons_grpc_dipper_proto_GroupMessagePro_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              GroupMessagePro.class, GroupMessagePro.Builder.class);
    }

    // Construct using com.skynet.commons.grpc.dipper.proto.GroupMessagePro.newBuilder()
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

      userId_ = 0;

      groupId_ = 0;

      content_ = "";

      isDel_ = 0;

      isRead_ = 0;

      sendTime_ = "";

      isBack_ = 0;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return GroupMessageProto.internal_static_com_skynet_commons_grpc_dipper_proto_GroupMessagePro_descriptor;
    }

    @Override
    public GroupMessagePro getDefaultInstanceForType() {
      return GroupMessagePro.getDefaultInstance();
    }

    @Override
    public GroupMessagePro build() {
      GroupMessagePro result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public GroupMessagePro buildPartial() {
      GroupMessagePro result = new GroupMessagePro(this);
      result.id_ = id_;
      result.userId_ = userId_;
      result.groupId_ = groupId_;
      result.content_ = content_;
      result.isDel_ = isDel_;
      result.isRead_ = isRead_;
      result.sendTime_ = sendTime_;
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
      if (other instanceof GroupMessagePro) {
        return mergeFrom((GroupMessagePro)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(GroupMessagePro other) {
      if (other == GroupMessagePro.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (other.getUserId() != 0) {
        setUserId(other.getUserId());
      }
      if (other.getGroupId() != 0) {
        setGroupId(other.getGroupId());
      }
      if (!other.getContent().isEmpty()) {
        content_ = other.content_;
        onChanged();
      }
      if (other.getIsDel() != 0) {
        setIsDel(other.getIsDel());
      }
      if (other.getIsRead() != 0) {
        setIsRead(other.getIsRead());
      }
      if (!other.getSendTime().isEmpty()) {
        sendTime_ = other.sendTime_;
        onChanged();
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
      GroupMessagePro parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (GroupMessagePro) e.getUnfinishedMessage();
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

    private int userId_ ;
    /**
     * <code>int32 user_id = 2;</code>
     * @return The userId.
     */
    public int getUserId() {
      return userId_;
    }
    /**
     * <code>int32 user_id = 2;</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(int value) {

      userId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 user_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {

      userId_ = 0;
      onChanged();
      return this;
    }

    private int groupId_ ;
    /**
     * <code>int32 group_id = 3;</code>
     * @return The groupId.
     */
    public int getGroupId() {
      return groupId_;
    }
    /**
     * <code>int32 group_id = 3;</code>
     * @param value The groupId to set.
     * @return This builder for chaining.
     */
    public Builder setGroupId(int value) {

      groupId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 group_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearGroupId() {

      groupId_ = 0;
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

    private int isDel_ ;
    /**
     * <code>int32 is_del = 5;</code>
     * @return The isDel.
     */
    public int getIsDel() {
      return isDel_;
    }
    /**
     * <code>int32 is_del = 5;</code>
     * @param value The isDel to set.
     * @return This builder for chaining.
     */
    public Builder setIsDel(int value) {

      isDel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 is_del = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsDel() {

      isDel_ = 0;
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

    private Object sendTime_ = "";
    /**
     * <code>string send_time = 7;</code>
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
     * <code>string send_time = 7;</code>
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
     * <code>string send_time = 7;</code>
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
     * <code>string send_time = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearSendTime() {

      sendTime_ = getDefaultInstance().getSendTime();
      onChanged();
      return this;
    }
    /**
     * <code>string send_time = 7;</code>
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


    // @@protoc_insertion_point(builder_scope:com.skynet.commons.grpc.dipper.proto.GroupMessagePro)
  }

  // @@protoc_insertion_point(class_scope:com.skynet.commons.grpc.dipper.proto.GroupMessagePro)
  private static final GroupMessagePro DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new GroupMessagePro();
  }

  public static GroupMessagePro getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GroupMessagePro>
      PARSER = new com.google.protobuf.AbstractParser<GroupMessagePro>() {
    @Override
    public GroupMessagePro parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GroupMessagePro(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GroupMessagePro> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<GroupMessagePro> getParserForType() {
    return PARSER;
  }

  @Override
  public GroupMessagePro getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

