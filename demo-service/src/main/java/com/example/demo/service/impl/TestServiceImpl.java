package com.example.demo.service.impl;

import com.example.demo.domain.entity.Ts;
import com.example.demo.repository.mapper.TsMapper;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.weekend.Weekend;

/**
 * @author liuhongfei
 * @desc TODO
 * @since v1.0.0
 **/
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TsMapper tsMapper;

    @Override
    public Ts getTest() {
        Ts ts = tsMapper.selectA(1);
        return ts;
    }
}
