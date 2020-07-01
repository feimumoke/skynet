package com.skynet.dipper.web.admin.controller;

import com.skynet.dipper.service.blog.api.IBlogConsumerService;
import com.skynet.dipper.service.chat.api.IChatConsumerService;
import com.skynet.dipper.service.chat.api.IUserConsumerService;

import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.rpc.Constants;
import org.apache.dubbo.rpc.RpcContext;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "service")
public class RouterController {
    @Value(value = "${services.ports.user}")
    private String userPort;

    @Value(value = "${services.ports.chat}")
    private String chatPort;

    @Value(value = "${services.ports.blog}")
    private String blogPort;

    @Reference(version = "${services.versions.user.v1}", protocol = "dubbo")
    private IUserConsumerService userConsumerService;


    @Reference(version = "${services.versions.chat.v1}", protocol = "dubbo")
    private IChatConsumerService chatConsumerService;


    @Reference(version = "${services.versions.chat.v1}", protocol = "dubbo")
    private IBlogConsumerService blogConsumerService;

    /**
     * http://localhost:9000/service/user/?path=/user/list
     *
     * @param path
     * @return
     */
    @RequestMapping(value = "user", method = RequestMethod.GET)
    public String user(String path) {
        // 远程调用
        RpcContext context = RpcContext.getContext();
        userConsumerService.info();
        return getRequestPath(userPort, path, context);
    }

    @RequestMapping(value = "blog", method = RequestMethod.GET)
    public String blog(String path) {
        // 远程调用
        RpcContext context = RpcContext.getContext();
        blogConsumerService.info();
        return getRequestPath(blogPort, path, context);
    }

    @CrossOrigin
    @RequestMapping(value = "chat", method = RequestMethod.GET)
    public String chat(HttpServletRequest request, String path, HttpServletResponse response) {
        // 远程调用
        Cookie[] cookies = request.getCookies();
        if (null != cookies) {
            System.out.println("cookie len:" + cookies.length);
            for (Cookie c : cookies) {
                System.out.println(c);
            }
        }
        System.out.println("chat:" + path);
        RpcContext context = RpcContext.getContext();
        chatConsumerService.info();
        return getRequestPath(chatPort, path, context);
    }

    private String getRequestPath(String serverPort, String path, RpcContext context) {
        RpcContext.getContext().setAttachment(Constants.ASYNC_KEY, "false");
        boolean consumerSide = context.isConsumerSide();
        if (consumerSide) {
            //获取最后一次调用方提供的IP地址
            String serverIP = context.getRemoteHost();
            System.out.println("serverIP:" + serverIP);
            return String.format("redirect:http://%s:%s%s", serverIP, serverPort, path);
        }
        System.out.println("not consumerSide");
        return null;
    }
}
