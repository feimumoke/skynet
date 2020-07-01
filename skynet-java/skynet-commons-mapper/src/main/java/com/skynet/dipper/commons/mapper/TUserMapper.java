package com.skynet.dipper.commons.mapper;

import com.skynet.dipper.commons.domain.TUser;

import org.springframework.stereotype.Repository;

import tk.mybatis.mapper.MyMapper;

@Repository
public interface TUserMapper extends MyMapper<TUser> {
}