package com.skynet.dipper.commons.mapper;

import com.skynet.dipper.commons.domain.FriendMessage;

import org.springframework.stereotype.Repository;

import tk.mybatis.mapper.MyMapper;
@Repository
public interface FriendMessageMapper extends MyMapper<FriendMessage> {
}