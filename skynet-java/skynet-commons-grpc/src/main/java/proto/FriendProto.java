// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FriendService.proto

package proto;

public final class FriendProto {
  private FriendProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_skynet_commons_grpc_dipper_proto_FriendPro_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_skynet_commons_grpc_dipper_proto_FriendPro_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\023FriendService.proto\022$com.skynet.common" +
      "s.grpc.dipper.proto\"r\n\tFriendPro\022\n\n\002id\030\001" +
      " \001(\005\022\017\n\007user_id\030\002 \001(\005\022\020\n\010password\030\003 \001(\t\022" +
      "\021\n\tfriend_id\030\004 \001(\005\022\022\n\nbuild_time\030\005 \001(\t\022\017" +
      "\n\007type_id\030\006 \001(\0052\017\n\rFriendServiceB5\n$com." +
      "skynet.commons.grpc.dipper.protoB\013Friend" +
      "ProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_skynet_commons_grpc_dipper_proto_FriendPro_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_skynet_commons_grpc_dipper_proto_FriendPro_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_skynet_commons_grpc_dipper_proto_FriendPro_descriptor,
        new String[] { "Id", "UserId", "Password", "FriendId", "BuildTime", "TypeId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}