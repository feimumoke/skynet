// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BaseService.proto

package proto;

public interface EntryListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.skynet.commons.grpc.dipper.proto.EntryList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.com.skynet.commons.grpc.dipper.proto.MessageType type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.com.skynet.commons.grpc.dipper.proto.MessageType type = 1;</code>
   * @return The type.
   */
  MessageType getType();

  /**
   * <code>repeated .google.protobuf.Any entry = 2;</code>
   */
  java.util.List<com.google.protobuf.Any> 
      getEntryList();
  /**
   * <code>repeated .google.protobuf.Any entry = 2;</code>
   */
  com.google.protobuf.Any getEntry(int index);
  /**
   * <code>repeated .google.protobuf.Any entry = 2;</code>
   */
  int getEntryCount();
  /**
   * <code>repeated .google.protobuf.Any entry = 2;</code>
   */
  java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
      getEntryOrBuilderList();
  /**
   * <code>repeated .google.protobuf.Any entry = 2;</code>
   */
  com.google.protobuf.AnyOrBuilder getEntryOrBuilder(
          int index);
}
