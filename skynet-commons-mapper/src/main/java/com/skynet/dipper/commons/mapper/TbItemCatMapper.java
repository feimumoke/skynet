package com.skynet.dipper.commons.mapper;

import com.skynet.dipper.commons.domain.TbItemCat;

import org.springframework.stereotype.Repository;

import tk.mybatis.mapper.MyMapper;
@Repository
public interface TbItemCatMapper extends MyMapper<TbItemCat> {
}