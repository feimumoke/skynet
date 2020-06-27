package com.skynet.dipper.service.blog.consumer.config;

import com.skynet.dipper.commons.constant.RpcConstant;
import com.skynet.dipper.commons.dubbo.service.consumer.BaseConsumerService;
import com.skynet.dipper.commons.grpc.base.DubboBaseServiceGrpc;
import com.skynet.dipper.commons.grpc.base.MessageType;
import com.skynet.dipper.commons.grpc.blog.BlogPro;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BlogConfiguration {
    private static final String INTERFACE_NAME = "com.skynet.dipper.commons.grpc.base.DubboBaseServiceGrpc$IBaseService";

    @Reference(version = "${services.versions.blog.v1}", interfaceName = INTERFACE_NAME,protocol = "grpc", group = RpcConstant.BLOG)
    private DubboBaseServiceGrpc.IBaseService iBaseService;

    @Bean(autowire = Autowire.BY_NAME, value = RpcConstant.BLOG)
    public BaseConsumerService userBaseService() {
        return new BaseConsumerService<BlogPro>(MessageType.BLOG, iBaseService);
    }

}
