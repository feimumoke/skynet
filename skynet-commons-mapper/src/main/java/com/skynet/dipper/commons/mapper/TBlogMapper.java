package com.skynet.dipper.commons.mapper;

import com.skynet.dipper.commons.domain.TBlog;

import org.springframework.stereotype.Repository;

import tk.mybatis.mapper.MyMapper;
@Repository
public interface TBlogMapper extends MyMapper<TBlog> {
}