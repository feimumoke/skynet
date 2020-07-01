package com.skynet.dipper.service.chat.api.entity;

import lombok.Data;

import java.util.List;

@Data
public class MVMData {

    private MVUser owner;

    private List<MVUser> list;
}
