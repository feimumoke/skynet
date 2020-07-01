package com.skynet.dipper.commons.mapper;

import com.skynet.dipper.commons.domain.TbOrder;

import org.springframework.stereotype.Repository;

import tk.mybatis.mapper.MyMapper;
@Repository
public interface TbOrderMapper extends MyMapper<TbOrder> {
}