package com.skynet.dipper.service.user.consumer.api.impl;

import com.skynet.dipper.service.chat.api.IUserConsumerService;

import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.rpc.RpcContext;

@Service(version = "${services.versions.user.v1}", protocol = "dubbo")
public class UserConsumerService implements IUserConsumerService {
    @Override
    public void info() {
        String remoteHost = RpcContext.getContext().getRemoteHost();
        System.out.println("remoteHost" + remoteHost);
        System.out.println("UserConsumerService invoked");
    }
}
