package com.skynet.dipper.service.chat.api.entity;

import lombok.Data;

import java.util.List;

@Data
public class MVData {

    private MVUser mine;
    private List<MVFriend> friend;
    private List<MVGroup> group;
}
