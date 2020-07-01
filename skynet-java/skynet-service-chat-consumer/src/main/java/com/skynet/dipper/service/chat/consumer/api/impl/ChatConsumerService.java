package com.skynet.dipper.service.chat.consumer.api.impl;

import com.skynet.dipper.service.chat.api.IChatConsumerService;

import org.apache.dubbo.config.annotation.Service;

@Service(version = "${services.versions.chat.v1}", protocol = "dubbo")
public class ChatConsumerService implements IChatConsumerService {
    @Override
    public void info() {
        System.out.println("IChatConsumerService");
    }
}
