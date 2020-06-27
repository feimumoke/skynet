package com.skynet.dipper.commons.mapper;

import com.skynet.dipper.commons.domain.TbOrderItem;

import org.springframework.stereotype.Repository;

import tk.mybatis.mapper.MyMapper;
@Repository
public interface TbOrderItemMapper extends MyMapper<TbOrderItem> {
}