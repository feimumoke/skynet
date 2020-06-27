package com.skynet.dipper.commons.mapper;

import com.skynet.dipper.commons.domain.BlogMessage;

import org.springframework.stereotype.Repository;

import tk.mybatis.mapper.MyMapper;
@Repository
public interface BlogMessageMapper extends MyMapper<BlogMessage> {
}