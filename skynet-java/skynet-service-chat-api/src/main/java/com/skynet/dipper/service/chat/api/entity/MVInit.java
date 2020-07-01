package com.skynet.dipper.service.chat.api.entity;

import lombok.Data;

@Data
public class MVInit {

    //code=0 表示成功，其余表示失败
    private int code;
    // 失败信息,成功则为空
    private String msg;

    private MVData data;

}
