package com.skynet.dipper.commons.mapper;

import com.skynet.dipper.commons.domain.Blog;

import org.springframework.stereotype.Repository;

import tk.mybatis.mapper.MyMapper;
@Repository
public interface BlogMapper extends MyMapper<Blog> {
}