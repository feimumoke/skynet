// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BaseService.proto

package proto;

public final class DipperService {
  private DipperService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_skynet_commons_grpc_dipper_proto_RpcResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_skynet_commons_grpc_dipper_proto_RpcResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_skynet_commons_grpc_dipper_proto_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_skynet_commons_grpc_dipper_proto_Empty_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_skynet_commons_grpc_dipper_proto_DataList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_skynet_commons_grpc_dipper_proto_DataList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_skynet_commons_grpc_dipper_proto_KeyId_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_skynet_commons_grpc_dipper_proto_KeyId_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_skynet_commons_grpc_dipper_proto_Entry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_skynet_commons_grpc_dipper_proto_Entry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_skynet_commons_grpc_dipper_proto_EntryList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_skynet_commons_grpc_dipper_proto_EntryList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_skynet_commons_grpc_dipper_proto_PageInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_skynet_commons_grpc_dipper_proto_PageInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\021BaseService.proto\022$com.skynet.commons." +
      "grpc.dipper.proto\032\031google/protobuf/any.p" +
      "roto\032\021UserService.proto\"R\n\tRpcResult\022\020\n\010" +
      "rpc_code\030\001 \001(\005\022\017\n\007message\030\002 \001(\t\022\"\n\004data\030" +
      "\003 \001(\0132\024.google.protobuf.Any\"H\n\005Empty\022?\n\004" +
      "type\030\001 \001(\01621.com.skynet.commons.grpc.dip" +
      "per.proto.MessageType\".\n\010DataList\022\"\n\004dat" +
      "a\030\001 \003(\0132\024.google.protobuf.Any\"X\n\005KeyId\022?" +
      "\n\004type\030\001 \001(\01621.com.skynet.commons.grpc.d" +
      "ipper.proto.MessageType\022\016\n\006key_id\030\002 \001(\005\"" +
      "m\n\005Entry\022?\n\004type\030\001 \001(\01621.com.skynet.comm" +
      "ons.grpc.dipper.proto.MessageType\022#\n\005ent" +
      "ry\030\002 \001(\0132\024.google.protobuf.Any\"q\n\tEntryL" +
      "ist\022?\n\004type\030\001 \001(\01621.com.skynet.commons.g" +
      "rpc.dipper.proto.MessageType\022#\n\005entry\030\002 " +
      "\003(\0132\024.google.protobuf.Any\"p\n\010PageInfo\022?\n" +
      "\004type\030\001 \001(\01621.com.skynet.commons.grpc.di" +
      "pper.proto.MessageType\022\020\n\010page_num\030\002 \001(\005" +
      "\022\021\n\tpage_size\030\003 \001(\005*v\n\013MessageType\022\n\n\006FR" +
      "IEND\020\000\022\022\n\016FRIEND_MESSAGE\020\001\022\017\n\013FRIEND_TYP" +
      "E\020\002\022\t\n\005GROUP\020\003\022\016\n\nGROUP_USER\020\004\022\010\n\004USER\020\005" +
      "\022\021\n\rGROUP_MESSAGE\020\0062\201\010\n\013BaseService\022f\n\004s" +
      "ave\022+.com.skynet.commons.grpc.dipper.pro" +
      "to.Entry\032/.com.skynet.commons.grpc.dippe" +
      "r.proto.RpcResult\"\000\022l\n\ndeleteById\022+.com." +
      "skynet.commons.grpc.dipper.proto.KeyId\032/" +
      ".com.skynet.commons.grpc.dipper.proto.Rp" +
      "cResult\"\000\022v\n\024deleteByPropertyList\022+.com." +
      "skynet.commons.grpc.dipper.proto.Entry\032/" +
      ".com.skynet.commons.grpc.dipper.proto.Rp" +
      "cResult\"\000\022h\n\006update\022+.com.skynet.commons" +
      ".grpc.dipper.proto.Entry\032/.com.skynet.co" +
      "mmons.grpc.dipper.proto.RpcResult\"\000\022l\n\ns" +
      "electById\022+.com.skynet.commons.grpc.dipp" +
      "er.proto.KeyId\032/.com.skynet.commons.grpc" +
      ".dipper.proto.RpcResult\"\000\022k\n\tselectAll\022+" +
      ".com.skynet.commons.grpc.dipper.proto.Em" +
      "pty\032/.com.skynet.commons.grpc.dipper.pro" +
      "to.RpcResult\"\000\022r\n\020selectByProperty\022+.com" +
      ".skynet.commons.grpc.dipper.proto.Entry\032" +
      "/.com.skynet.commons.grpc.dipper.proto.R" +
      "pcResult\"\000\022v\n\024selectListByProperty\022+.com" +
      ".skynet.commons.grpc.dipper.proto.Entry\032" +
      "/.com.skynet.commons.grpc.dipper.proto.R" +
      "pcResult\"\000\022s\n\016selectPageList\022..com.skyne" +
      "t.commons.grpc.dipper.proto.PageInfo\032/.c" +
      "om.skynet.commons.grpc.dipper.proto.RpcR" +
      "esult\"\000B7\n$com.skynet.commons.grpc.dippe" +
      "r.protoB\rDipperServiceP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
          UserProto.getDescriptor(),
        });
    internal_static_com_skynet_commons_grpc_dipper_proto_RpcResult_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_skynet_commons_grpc_dipper_proto_RpcResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_skynet_commons_grpc_dipper_proto_RpcResult_descriptor,
        new String[] { "RpcCode", "Message", "Data", });
    internal_static_com_skynet_commons_grpc_dipper_proto_Empty_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_skynet_commons_grpc_dipper_proto_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_skynet_commons_grpc_dipper_proto_Empty_descriptor,
        new String[] { "Type", });
    internal_static_com_skynet_commons_grpc_dipper_proto_DataList_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_skynet_commons_grpc_dipper_proto_DataList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_skynet_commons_grpc_dipper_proto_DataList_descriptor,
        new String[] { "Data", });
    internal_static_com_skynet_commons_grpc_dipper_proto_KeyId_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_skynet_commons_grpc_dipper_proto_KeyId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_skynet_commons_grpc_dipper_proto_KeyId_descriptor,
        new String[] { "Type", "KeyId", });
    internal_static_com_skynet_commons_grpc_dipper_proto_Entry_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_skynet_commons_grpc_dipper_proto_Entry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_skynet_commons_grpc_dipper_proto_Entry_descriptor,
        new String[] { "Type", "Entry", });
    internal_static_com_skynet_commons_grpc_dipper_proto_EntryList_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_skynet_commons_grpc_dipper_proto_EntryList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_skynet_commons_grpc_dipper_proto_EntryList_descriptor,
        new String[] { "Type", "Entry", });
    internal_static_com_skynet_commons_grpc_dipper_proto_PageInfo_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_skynet_commons_grpc_dipper_proto_PageInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_skynet_commons_grpc_dipper_proto_PageInfo_descriptor,
        new String[] { "Type", "PageNum", "PageSize", });
    com.google.protobuf.AnyProto.getDescriptor();
    UserProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}