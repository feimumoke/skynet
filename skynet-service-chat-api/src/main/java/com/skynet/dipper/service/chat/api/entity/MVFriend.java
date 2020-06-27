package com.skynet.dipper.service.chat.api.entity;

import lombok.Data;

import java.util.List;

@Data
public class MVFriend {

    private String groupname;
    private Integer id;
    private Integer online;
    private List<MVUser> list;

}
