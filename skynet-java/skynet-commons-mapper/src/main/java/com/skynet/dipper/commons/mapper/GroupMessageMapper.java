package com.skynet.dipper.commons.mapper;

import com.skynet.dipper.commons.domain.GroupMessage;

import org.springframework.stereotype.Repository;

import tk.mybatis.mapper.MyMapper;
@Repository
public interface GroupMessageMapper extends MyMapper<GroupMessage> {
}