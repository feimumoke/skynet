package com.skynet.dipper.service.chat.provider;

import org.apache.dubbo.container.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import tk.mybatis.spring.annotation.MapperScan;

@EnableHystrix
@EnableHystrixDashboard
@SpringBootApplication(scanBasePackages = "com.skynet.dipper")
@EnableTransactionManagement
@MapperScan(basePackages = "com.skynet.dipper.commons.mapper")
public class SkynetServiceChatProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkynetServiceChatProviderApplication.class, args);
        Main.main(args);
    }
}
