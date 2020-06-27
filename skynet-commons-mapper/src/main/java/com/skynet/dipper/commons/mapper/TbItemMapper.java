package com.skynet.dipper.commons.mapper;

import com.skynet.dipper.commons.domain.TbItem;

import org.springframework.stereotype.Repository;

import tk.mybatis.mapper.MyMapper;
@Repository
public interface TbItemMapper extends MyMapper<TbItem> {
}