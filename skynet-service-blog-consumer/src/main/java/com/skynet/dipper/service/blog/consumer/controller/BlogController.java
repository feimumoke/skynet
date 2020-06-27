package com.skynet.dipper.service.blog.consumer.controller;

import com.google.protobuf.InvalidProtocolBufferException;
import com.skynet.dipper.commons.constant.RpcConstant;
import com.skynet.dipper.commons.domain.TBlog;
import com.skynet.dipper.commons.domain.TUser;
import com.skynet.dipper.commons.dubbo.service.consumer.BaseConsumerService;
import com.skynet.dipper.commons.grpc.base.DubboBaseServiceGrpc;
import com.skynet.dipper.commons.grpc.blog.BlogPro;
import com.skynet.dipper.commons.grpc.blog.DubboBlogServiceGrpc;
import com.skynet.dipper.commons.grpc.image.DubboImageServiceGrpc;
import com.skynet.dipper.commons.utils.JSONParserUtils;
import com.skynet.dipper.commons.utils.ProtobufUtils;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.annotation.Resource;

@Controller
@RequestMapping("blog")
public class BlogController {

    @Reference(version = "${services.versions.image.v1}", protocol = "grpc", group = "Image")
    private DubboImageServiceGrpc.IImageService iImageService;

    @Resource(name = RpcConstant.BLOG)
    private BaseConsumerService baseConsumerService;


    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String list() {
        return "blog/list";
    }

    @GetMapping("detail")
    @ResponseBody
    public ResponseEntity<Map<String, Object>> list(@RequestParam("page") int page) {
        HashMap<String, Object> map = new HashMap<>();
        System.out.println(page);
        List<TBlog> list = new ArrayList<>();
        int pageSize = 4;
        try {
            List<BlogPro> proList = baseConsumerService.selectAll();
            list = proList.stream().map(p -> {
                try {
                    TBlog tBlog = JSONParserUtils.entry2Object(ProtobufUtils.pfToJson(p), TBlog.class);
                    if(tBlog.getImage()!=null){
                        String[] split = tBlog.getImage().split(":");
                        tBlog.setImage(split[0]);
                    }
                    return tBlog;
                } catch (InvalidProtocolBufferException e) {
                    e.printStackTrace();
                }
                return null;
            }).collect(Collectors.toList());
            int count = list.size();
            int totalPage = count / pageSize;// 计算总页数
            if (count % pageSize != 0) {// 不满一页的数据按一页计算
                totalPage++;
            }
            map.put("page", page);
            map.put("pageSize", pageSize);
            map.put("totalPage", totalPage);
            int start = (page - 1) * pageSize;
            int end = start + pageSize > count ? count : start + pageSize;
            map.put("list", list.subList(start, end));
            System.out.println(list.subList(start, end));
            return new ResponseEntity<>(map, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
