// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FriendTypeService.proto

package proto;

/**
 * Protobuf type {@code com.skynet.commons.grpc.dipper.proto.FriendTypePro}
 */
public  final class FriendTypePro extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.skynet.commons.grpc.dipper.proto.FriendTypePro)
        FriendTypeProOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FriendTypePro.newBuilder() to construct.
  private FriendTypePro(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FriendTypePro() {
    typeName_ = "";
    buildTime_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new FriendTypePro();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FriendTypePro(
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
          case 18: {
            String s = input.readStringRequireUtf8();

            typeName_ = s;
            break;
          }
          case 24: {

            userId_ = input.readInt32();
            break;
          }
          case 34: {
            String s = input.readStringRequireUtf8();

            buildTime_ = s;
            break;
          }
          case 40: {

            isDefault_ = input.readInt32();
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
    return FriendTypeProto.internal_static_com_skynet_commons_grpc_dipper_proto_FriendTypePro_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return FriendTypeProto.internal_static_com_skynet_commons_grpc_dipper_proto_FriendTypePro_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            FriendTypePro.class, FriendTypePro.Builder.class);
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

  public static final int TYPE_NAME_FIELD_NUMBER = 2;
  private volatile Object typeName_;
  /**
   * <code>string type_name = 2;</code>
   * @return The typeName.
   */
  public String getTypeName() {
    Object ref = typeName_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      typeName_ = s;
      return s;
    }
  }
  /**
   * <code>string type_name = 2;</code>
   * @return The bytes for typeName.
   */
  public com.google.protobuf.ByteString
      getTypeNameBytes() {
    Object ref = typeName_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      typeName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USER_ID_FIELD_NUMBER = 3;
  private int userId_;
  /**
   * <code>int32 user_id = 3;</code>
   * @return The userId.
   */
  public int getUserId() {
    return userId_;
  }

  public static final int BUILD_TIME_FIELD_NUMBER = 4;
  private volatile Object buildTime_;
  /**
   * <code>string build_time = 4;</code>
   * @return The buildTime.
   */
  public String getBuildTime() {
    Object ref = buildTime_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      buildTime_ = s;
      return s;
    }
  }
  /**
   * <code>string build_time = 4;</code>
   * @return The bytes for buildTime.
   */
  public com.google.protobuf.ByteString
      getBuildTimeBytes() {
    Object ref = buildTime_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      buildTime_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IS_DEFAULT_FIELD_NUMBER = 5;
  private int isDefault_;
  /**
   * <code>int32 is_default = 5;</code>
   * @return The isDefault.
   */
  public int getIsDefault() {
    return isDefault_;
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
    if (!getTypeNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, typeName_);
    }
    if (userId_ != 0) {
      output.writeInt32(3, userId_);
    }
    if (!getBuildTimeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, buildTime_);
    }
    if (isDefault_ != 0) {
      output.writeInt32(5, isDefault_);
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
    if (!getTypeNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, typeName_);
    }
    if (userId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, userId_);
    }
    if (!getBuildTimeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, buildTime_);
    }
    if (isDefault_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, isDefault_);
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
    if (!(obj instanceof FriendTypePro)) {
      return super.equals(obj);
    }
    FriendTypePro other = (FriendTypePro) obj;

    if (getId()
        != other.getId()) return false;
    if (!getTypeName()
        .equals(other.getTypeName())) return false;
    if (getUserId()
        != other.getUserId()) return false;
    if (!getBuildTime()
        .equals(other.getBuildTime())) return false;
    if (getIsDefault()
        != other.getIsDefault()) return false;
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
    hash = (37 * hash) + TYPE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getTypeName().hashCode();
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId();
    hash = (37 * hash) + BUILD_TIME_FIELD_NUMBER;
    hash = (53 * hash) + getBuildTime().hashCode();
    hash = (37 * hash) + IS_DEFAULT_FIELD_NUMBER;
    hash = (53 * hash) + getIsDefault();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static FriendTypePro parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static FriendTypePro parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static FriendTypePro parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static FriendTypePro parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static FriendTypePro parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static FriendTypePro parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static FriendTypePro parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static FriendTypePro parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static FriendTypePro parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static FriendTypePro parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static FriendTypePro parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static FriendTypePro parseFrom(
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
  public static Builder newBuilder(FriendTypePro prototype) {
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
   * Protobuf type {@code com.skynet.commons.grpc.dipper.proto.FriendTypePro}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.skynet.commons.grpc.dipper.proto.FriendTypePro)
          FriendTypeProOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return FriendTypeProto.internal_static_com_skynet_commons_grpc_dipper_proto_FriendTypePro_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return FriendTypeProto.internal_static_com_skynet_commons_grpc_dipper_proto_FriendTypePro_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              FriendTypePro.class, FriendTypePro.Builder.class);
    }

    // Construct using com.skynet.commons.grpc.dipper.proto.FriendTypePro.newBuilder()
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

      typeName_ = "";

      userId_ = 0;

      buildTime_ = "";

      isDefault_ = 0;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return FriendTypeProto.internal_static_com_skynet_commons_grpc_dipper_proto_FriendTypePro_descriptor;
    }

    @Override
    public FriendTypePro getDefaultInstanceForType() {
      return FriendTypePro.getDefaultInstance();
    }

    @Override
    public FriendTypePro build() {
      FriendTypePro result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public FriendTypePro buildPartial() {
      FriendTypePro result = new FriendTypePro(this);
      result.id_ = id_;
      result.typeName_ = typeName_;
      result.userId_ = userId_;
      result.buildTime_ = buildTime_;
      result.isDefault_ = isDefault_;
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
      if (other instanceof FriendTypePro) {
        return mergeFrom((FriendTypePro)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(FriendTypePro other) {
      if (other == FriendTypePro.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (!other.getTypeName().isEmpty()) {
        typeName_ = other.typeName_;
        onChanged();
      }
      if (other.getUserId() != 0) {
        setUserId(other.getUserId());
      }
      if (!other.getBuildTime().isEmpty()) {
        buildTime_ = other.buildTime_;
        onChanged();
      }
      if (other.getIsDefault() != 0) {
        setIsDefault(other.getIsDefault());
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
      FriendTypePro parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (FriendTypePro) e.getUnfinishedMessage();
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

    private Object typeName_ = "";
    /**
     * <code>string type_name = 2;</code>
     * @return The typeName.
     */
    public String getTypeName() {
      Object ref = typeName_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        typeName_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string type_name = 2;</code>
     * @return The bytes for typeName.
     */
    public com.google.protobuf.ByteString
        getTypeNameBytes() {
      Object ref = typeName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        typeName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string type_name = 2;</code>
     * @param value The typeName to set.
     * @return This builder for chaining.
     */
    public Builder setTypeName(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      typeName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string type_name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTypeName() {

      typeName_ = getDefaultInstance().getTypeName();
      onChanged();
      return this;
    }
    /**
     * <code>string type_name = 2;</code>
     * @param value The bytes for typeName to set.
     * @return This builder for chaining.
     */
    public Builder setTypeNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      typeName_ = value;
      onChanged();
      return this;
    }

    private int userId_ ;
    /**
     * <code>int32 user_id = 3;</code>
     * @return The userId.
     */
    public int getUserId() {
      return userId_;
    }
    /**
     * <code>int32 user_id = 3;</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(int value) {

      userId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 user_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {

      userId_ = 0;
      onChanged();
      return this;
    }

    private Object buildTime_ = "";
    /**
     * <code>string build_time = 4;</code>
     * @return The buildTime.
     */
    public String getBuildTime() {
      Object ref = buildTime_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        buildTime_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string build_time = 4;</code>
     * @return The bytes for buildTime.
     */
    public com.google.protobuf.ByteString
        getBuildTimeBytes() {
      Object ref = buildTime_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        buildTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string build_time = 4;</code>
     * @param value The buildTime to set.
     * @return This builder for chaining.
     */
    public Builder setBuildTime(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      buildTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string build_time = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearBuildTime() {

      buildTime_ = getDefaultInstance().getBuildTime();
      onChanged();
      return this;
    }
    /**
     * <code>string build_time = 4;</code>
     * @param value The bytes for buildTime to set.
     * @return This builder for chaining.
     */
    public Builder setBuildTimeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      buildTime_ = value;
      onChanged();
      return this;
    }

    private int isDefault_ ;
    /**
     * <code>int32 is_default = 5;</code>
     * @return The isDefault.
     */
    public int getIsDefault() {
      return isDefault_;
    }
    /**
     * <code>int32 is_default = 5;</code>
     * @param value The isDefault to set.
     * @return This builder for chaining.
     */
    public Builder setIsDefault(int value) {

      isDefault_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 is_default = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsDefault() {

      isDefault_ = 0;
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


    // @@protoc_insertion_point(builder_scope:com.skynet.commons.grpc.dipper.proto.FriendTypePro)
  }

  // @@protoc_insertion_point(class_scope:com.skynet.commons.grpc.dipper.proto.FriendTypePro)
  private static final FriendTypePro DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new FriendTypePro();
  }

  public static FriendTypePro getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FriendTypePro>
      PARSER = new com.google.protobuf.AbstractParser<FriendTypePro>() {
    @Override
    public FriendTypePro parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FriendTypePro(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FriendTypePro> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<FriendTypePro> getParserForType() {
    return PARSER;
  }

  @Override
  public FriendTypePro getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

