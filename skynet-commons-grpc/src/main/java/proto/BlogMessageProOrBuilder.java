// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BlogMessageService.proto

package proto;

public interface BlogMessageProOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.skynet.commons.grpc.dipper.proto.BlogMessagePro)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>int32 blog_id = 2;</code>
   * @return The blogId.
   */
  int getBlogId();

  /**
   * <code>int32 user_id = 3;</code>
   * @return The userId.
   */
  int getUserId();

  /**
   * <code>int32 msg_type = 4;</code>
   * @return The msgType.
   */
  int getMsgType();

  /**
   * <code>string content = 5;</code>
   * @return The content.
   */
  String getContent();
  /**
   * <code>string content = 5;</code>
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString
      getContentBytes();

  /**
   * <code>int32 build_time = 6;</code>
   * @return The buildTime.
   */
  int getBuildTime();
}
