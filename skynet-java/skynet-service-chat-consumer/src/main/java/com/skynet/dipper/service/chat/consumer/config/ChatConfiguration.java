package com.skynet.dipper.service.chat.consumer.config;

import com.skynet.dipper.commons.constant.RpcConstant;
import com.skynet.dipper.commons.dubbo.service.consumer.BaseConsumerService;
import com.skynet.dipper.commons.grpc.base.DubboBaseServiceGrpc;
import com.skynet.dipper.commons.grpc.base.MessageType;
import com.skynet.dipper.commons.grpc.user.UserPro;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChatConfiguration {
    @Reference(version = "${services.versions.chat.v1}", interfaceName = RpcConstant.FRIEND_MESSAGE, group = RpcConstant.FRIEND_MESSAGE)
    private DubboBaseServiceGrpc.IBaseService friendMessageService;

    @Bean(autowire = Autowire.BY_NAME, value = RpcConstant.FRIEND_MESSAGE)
    public BaseConsumerService friendMessageService() {
        return new BaseConsumerService<UserPro>(MessageType.FRIEND_MESSAGE, friendMessageService);
    }
}
