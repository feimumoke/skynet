package com.skynet.dipper.service.chat.consumer.controller;

import com.google.protobuf.InvalidProtocolBufferException;
import com.skynet.dipper.commons.domain.TUser;
import com.skynet.dipper.commons.grpc.chat.DubboChatServiceGrpc;
import com.skynet.dipper.commons.grpc.chat.MVInit;
import com.skynet.dipper.commons.grpc.chat.UserId;
import com.skynet.dipper.commons.utils.JSONParserUtils;
import com.skynet.dipper.commons.utils.ProtobufUtils;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "chat")
public class ChatController {
    @Reference(version = "${services.versions.chat.v1}", protocol = "grpc")
    private DubboChatServiceGrpc.IChatService chatService;

    @CrossOrigin
    @RequestMapping(value = "init", method = RequestMethod.GET)
    public String chat() {
        System.out.println("chat init");
        return "chat/nav";
    }

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index() {
        return "chat/index";
    }

    @CrossOrigin
    @RequestMapping(value = "getInitList", produces = "text/plain; charste=utf-8")
    @ResponseBody
    public String initChat(int userId) {
        System.out.println("userId:" + userId);
        MVInit init = chatService.init(UserId.newBuilder().setId(userId).build());
        System.out.println("init:"+init);
        try {
            com.skynet.dipper.service.chat.api.entity.MVInit mvInit = JSONParserUtils.entry2Object(ProtobufUtils.pfToJson(init), com.skynet.dipper.service.chat.api.entity.MVInit.class);
            String s = JSONParserUtils.object2JsonString(mvInit);
            System.out.println("s:"+s);
            return s;
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }
        String s = JSONParserUtils.object2JsonString(init);
        System.out.println(s);
        return s;
    }


}
