package com.example.demo.repository.mapper;

import com.example.demo.domain.entity.Ts;
import com.example.demo.repository.config.PlatformMapper;

public interface TsMapper extends PlatformMapper<Ts> {
    Ts selectA(Integer id);
}