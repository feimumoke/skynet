package com.skynet.dipper.commons.mapper;

import com.skynet.dipper.commons.domain.History;

import org.springframework.stereotype.Repository;

import tk.mybatis.mapper.MyMapper;
@Repository
public interface HistoryMapper extends MyMapper<History> {
}