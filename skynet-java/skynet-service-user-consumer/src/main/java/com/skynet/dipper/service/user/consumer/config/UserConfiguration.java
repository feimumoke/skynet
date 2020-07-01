package com.skynet.dipper.service.user.consumer.config;

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
public class UserConfiguration {


    @Reference(version = "${services.versions.user.v1}", interfaceName = RpcConstant.USER, group = RpcConstant.USER)
    private DubboBaseServiceGrpc.IBaseService iBaseService;

    @Bean(autowire = Autowire.BY_NAME, value = RpcConstant.USER)
    public BaseConsumerService userBaseService() {
        return new BaseConsumerService<UserPro>(MessageType.USER, iBaseService);
    }


}
