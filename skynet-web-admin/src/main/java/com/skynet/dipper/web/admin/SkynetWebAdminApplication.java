package com.skynet.dipper.web.admin;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;

import org.apache.dubbo.container.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


@EnableHystrix
@EnableHystrixDashboard
@SpringBootApplication(scanBasePackages = "com.skynet.dipper", exclude = {DruidDataSourceAutoConfigure.class,
        DataSourceTransactionManagerAutoConfiguration.class, DataSourceAutoConfiguration.class})
public class SkynetWebAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(SkynetWebAdminApplication.class, args);
        Main.main(args);
    }

}
