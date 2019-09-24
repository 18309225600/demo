package com.example.demo.repository.config;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

/**
 * @author liuhongfei
 * @desc 通用Mapper
 * @since v1.0.0
 **/
public interface PlatformMapper<T> extends Mapper<T>, InsertListMapper<T> {
}
