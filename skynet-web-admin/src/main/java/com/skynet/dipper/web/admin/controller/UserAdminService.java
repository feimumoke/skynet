package com.skynet.dipper.web.admin.controller;

import com.google.protobuf.InvalidProtocolBufferException;
import com.skynet.dipper.commons.constant.RpcConstant;
import com.skynet.dipper.commons.domain.TUser;
import com.skynet.dipper.commons.grpc.base.RpcResult;
import com.skynet.dipper.commons.grpc.user.DubboUserServiceGrpc;
import com.skynet.dipper.commons.grpc.user.LoginInfo;
import com.skynet.dipper.commons.grpc.user.UserPro;
import com.skynet.dipper.commons.utils.JSONParserUtils;
import com.skynet.dipper.commons.utils.ProtobufUtils;
import com.skynet.dipper.statics.backend.dto.DataDTO;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping
class UserAdminService {

    @Reference(version = "${services.versions.user.v1}", protocol = "grpc")
    private DubboUserServiceGrpc.IUserService iUserService;

    @RequestMapping(value = {"", "login", "user/login"}, method = RequestMethod.POST)
    @ResponseBody
    public DataDTO<TUser> userLogin(String username, String password, HttpServletResponse response) {
        System.out.println("username:" + username + ":" + password);
        RpcResult login = iUserService.login(LoginInfo.newBuilder().setUserName(username).setPassword(password).build());
        int rpcCode = login.getRpcCode();
        DataDTO<TUser> dto = new DataDTO<>();
        if (rpcCode == RpcConstant.RESULT_OK) {
            try {
                UserPro userPro = login.getData().unpack(UserPro.class);
                TUser user = JSONParserUtils.entry2Object(ProtobufUtils.pfToJson(userPro), TUser.class);
                dto.setCode(200);
                dto.setData(user);
                response.addCookie(new Cookie("username", user.getUserName()));
                response.addCookie(new Cookie("userid", user.getId().toString()));
            } catch (InvalidProtocolBufferException e) {
                e.printStackTrace();
            }
        }
        return dto;
    }
}
