package com.skynet.dipper.service.blog.consumer.api.impl;


import com.skynet.dipper.service.blog.api.IBlogConsumerService;

import org.apache.dubbo.config.annotation.Service;

@Service(version = "${services.versions.blog.v1}", protocol = "dubbo")
public class BlogConsumerService implements IBlogConsumerService {
    @Override
    public void info() {
        System.out.println("BlogConsumerService info");
    }
}
