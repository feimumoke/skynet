package com.skynet.dipper.commons.mapper;

import com.skynet.dipper.commons.domain.Friend;

import org.springframework.stereotype.Repository;

import tk.mybatis.mapper.MyMapper;
@Repository
public interface FriendMapper extends MyMapper<Friend> {
}