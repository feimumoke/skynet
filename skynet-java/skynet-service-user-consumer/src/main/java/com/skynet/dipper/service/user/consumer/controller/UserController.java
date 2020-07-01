package com.skynet.dipper.service.user.consumer.controller;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.skynet.dipper.commons.constant.RpcConstant;
import com.skynet.dipper.commons.domain.TUser;
import com.skynet.dipper.commons.dubbo.service.consumer.BaseConsumerService;
import com.skynet.dipper.commons.grpc.base.RpcResult;
import com.skynet.dipper.commons.grpc.image.DubboImageServiceGrpc;
import com.skynet.dipper.commons.grpc.image.ImageData;
import com.skynet.dipper.commons.grpc.user.DubboUserServiceGrpc;
import com.skynet.dipper.commons.grpc.user.LoginInfo;
import com.skynet.dipper.commons.grpc.user.UserPro;
import com.skynet.dipper.commons.utils.JSONParserUtils;
import com.skynet.dipper.commons.utils.ProtobufUtils;
import com.skynet.dipper.statics.backend.dto.DataDTO;
import com.skynet.dipper.statics.backend.dto.DataTableDTO;

import org.apache.dubbo.config.annotation.Reference;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "user")
public class UserController {

    @Resource(name = RpcConstant.USER)
    private BaseConsumerService userBaseService;

    @Reference(version = "${services.versions.user.v1}", protocol = "grpc")
    private DubboUserServiceGrpc.IUserService iUserService;

    @Reference(version = "${services.versions.image.v1}", protocol = "grpc", group = "Image")
    private DubboImageServiceGrpc.IImageService iImageService;

    @RequestMapping(value = "login", method = RequestMethod.GET)
    @ResponseBody
    public DataDTO<TUser> userLogin() {
        RpcResult login = iUserService.login(LoginInfo.newBuilder().setUserName("生命练习生").setPassword("123").build());
        int rpcCode = login.getRpcCode();
        DataDTO<TUser> userDataDTO = new DataDTO<>();
        if (rpcCode == RpcConstant.RESULT_OK) {
            try {
                UserPro userPro = login.getData().unpack(UserPro.class);
                TUser user = JSONParserUtils.entry2Object(ProtobufUtils.pfToJson(userPro), TUser.class);
                userDataDTO.setCode(200);
                userDataDTO.setData(user);
            } catch (InvalidProtocolBufferException e) {
                e.printStackTrace();
            }
        }
        return userDataDTO;
    }

    @RequestMapping(value = "account", method = RequestMethod.GET)
    public ModelAndView accountInfo() {
        ModelAndView modelAndView = new ModelAndView("user/account");
        UserPro userPro = UserPro.newBuilder().setUserName("生命练习生").setPassword("123").build();
        UserPro realUser = (UserPro) userBaseService.selectOne(userPro);
        if (realUser != null) {
            try {
                TUser user = JSONParserUtils.entry2Object(ProtobufUtils.pfToJson(realUser), TUser.class);
                System.out.println(user);
                modelAndView.addObject("user", user);
            } catch (InvalidProtocolBufferException e) {
                e.printStackTrace();
            }
        }
        return modelAndView;
    }

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String list() {
        return "user/list";
    }

    @RequestMapping(value = "/avatar/upload", method = RequestMethod.POST)
    @ResponseBody
    public DataDTO<String> updateAvatar(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("updateAvatar");
        DataDTO<String> dto = new DataDTO<>();
        try {
            if (ServletFileUpload.isMultipartContent(request)) {
                MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
                List<MultipartFile> fileList = multipartRequest.getFiles("file");
                for (MultipartFile item : fileList) {
                    System.out.println(item);
                    Date date = new Date();
                    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    String day = dateFormat.format(date);
                    long overTime = (System.currentTimeMillis() - dateFormat.parse(day).getTime()) / 1000;
                    String name = item.getOriginalFilename();
                    item.getBytes();
                    ByteString bytes = ByteString.copyFrom(item.getBytes());
                    System.out.println(name);
                    String filename = day + "/" + overTime + "/" + name;
                    ImageData.Builder builder = ImageData.newBuilder().setName(filename).setPhoto(bytes);
                    iImageService.save(builder.build());
                }
                dto.setCode(200);
                dto.setData("OK");
                response.setStatus(200);
            } else {
                System.out.println("Non isMultipartContent");
            }
        } catch (Exception e) {

        }

        return dto;
    }


    @RequestMapping(value = "page", method = RequestMethod.GET)
    @ResponseBody
    public DataTableDTO<TUser> userPage(HttpServletRequest request) {
        List<TUser> list = new ArrayList<>();
        String strStart = request.getParameter("start");
        String strLength = request.getParameter("length");
        int start = strStart == null ? 0 : Integer.parseInt(strStart);
        int length = strLength == null ? 100 : Integer.parseInt(strLength);
        List<UserPro> proList = userBaseService.selectAndPaging(start, length);
        try {
            list = proList.stream().map(p -> {
                try {
                    return JSONParserUtils.entry2Object(ProtobufUtils.pfToJson(p), TUser.class);
                } catch (InvalidProtocolBufferException e) {
                    e.printStackTrace();
                }
                return null;
            }).collect(Collectors.toList());
        } catch (Exception e) {
            e.printStackTrace();
        }
        DataTableDTO<TUser> dto = new DataTableDTO<>();
        dto.setData(list);
        return dto;
    }
}
