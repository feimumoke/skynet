package com.skynet.dipper.service.chat.consumer.websocket;

import com.alibaba.fastjson.JSONObject;
import com.google.protobuf.Message;
import com.skynet.dipper.commons.constant.RedisConst;
import com.skynet.dipper.commons.constant.RpcConstant;
import com.skynet.dipper.commons.dubbo.service.consumer.BaseConsumerService;
import com.skynet.dipper.commons.grpc.friend.FriendMessagePro;
import com.skynet.dipper.commons.grpc.redis.DubboRedisServiceGrpc;
import com.skynet.dipper.commons.grpc.redis.RPair;
import com.skynet.dipper.commons.utils.JSONParserUtils;

import io.netty.channel.Channel;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@Component
public class MessageHandler {

    private static final Executor DB_EXECUTOR = Executors.newSingleThreadExecutor();


    @Resource(name = RpcConstant.FRIEND_MESSAGE)
    private BaseConsumerService friendMessageService;

    @Reference(version = "${services.versions.redis.v1}", protocol = "grpc")
    private DubboRedisServiceGrpc.IRedisService redisService;

    public void dealWithMessage(Channel channel, JSONObject message) {
        System.out.println("{}:" + message);
        String action = message.getJSONObject("to").getString("type");
        if (action.equals("login")) {
            Integer userId = Integer.valueOf(message.getString("userId"));
            ChatHandler.getOnlineUser().put(userId, channel);
        } else if (action.equals("friend")) {
            handerFriendMessage(channel, message);
        } else if (action.equals("close")) {
            Integer userId = Integer.valueOf(message.getString("userId"));
            RPair.Builder builder = RPair.newBuilder().setKey(userId + RedisConst.USER_STATUS).setValue(RedisConst.STATUS_OFFLINE);
            redisService.set(builder.build() );
        }
    }

    private void handerFriendMessage(Channel channel, JSONObject message) {
        int toId = message.getJSONObject("to").getInteger("id");
        Channel receiverChannel = ChatHandler.getOnlineUser().get(toId);
        JSONObject friendMessage = loadFriendMessage(message);
        FriendMessagePro.Builder messagePro = loadFriendMessagePro(message);
        if (receiverChannel == null) {
            storeFriendMessage(messagePro, false);
        } else {
            Channel findChannel = ChatHandler.getChannels().find(receiverChannel.id());
            if (findChannel != null) {
                receiverChannel.writeAndFlush(new TextWebSocketFrame(JSONParserUtils.object2JsonString(friendMessage)));
                storeFriendMessage(messagePro, true);
            } else {
                storeFriendMessage(messagePro, false);
            }
        }
    }

    private JSONObject loadFriendMessage(JSONObject message) {
        SimpleDateFormat df = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        Date date = new Date();
        String time = df.format(date);
        message.put("time", time);
        JSONObject toMessage = new JSONObject();
        toMessage.put("avatar", message.getJSONObject("mine").getString("avatar"));
        toMessage.put("content", message.getJSONObject("mine").getString("content"));
        toMessage.put("timestamp", date.getTime());
        toMessage.put("time", time);
        toMessage.put("mine", false);
        toMessage.put("type", message.getJSONObject("to").getString("type"));
        toMessage.put("username", message.getJSONObject("mine").getString("username"));
        toMessage.put("id", message.getJSONObject("mine").getIntValue("id"));
        return toMessage;
    }

    private FriendMessagePro.Builder loadFriendMessagePro(JSONObject message) {
        FriendMessagePro.Builder builder = FriendMessagePro.newBuilder();
        builder.setFromUserId(message.getJSONObject("mine").getIntValue("id"));
        builder.setToUserId(message.getJSONObject("to").getIntValue("id"));
        builder.setContent(message.getJSONObject("mine").getString("content"));
        builder.setIsDel(0);
        builder.setIsBack(0);
        builder.setSendTime(message.getString("time"));
        return builder;
    }

    private void storeFriendMessage(FriendMessagePro.Builder builder, boolean isRead) {
        int read = isRead ? 1 : 0;
        builder.setIsRead(read);
        DB_EXECUTOR.execute(() -> {
            Message save = friendMessageService.save(builder.build());
            System.out.println(save);
        });
    }
}
