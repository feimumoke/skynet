package com.skynet.dipper.service.chat.api.entity;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class MVUser {

    private Integer id;            //我的ID,即userId
    private String username;   //我的真是姓名，即ucName
    private String status;     //在线状态 online：在线、hide：隐身
    private String sign;       //我的签名
    private String avatar;     //我的头像
}
