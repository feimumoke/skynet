package com.skynet.dipper.commons.mapper;

import com.skynet.dipper.commons.domain.Friends;

import org.springframework.stereotype.Repository;

import tk.mybatis.mapper.MyMapper;
@Repository
public interface FriendsMapper extends MyMapper<Friends> {
}