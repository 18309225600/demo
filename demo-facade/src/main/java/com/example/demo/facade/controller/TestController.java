package com.example.demo.facade.controller;

import com.example.demo.domain.entity.Ts;
import com.example.demo.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuhongfei
 * @desc TODO
 * @since v1.0.0
 **/
@Slf4j
@RestController
@RequestMapping("/health")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/health")
    public String health(){
        Ts ts = testService.getTest();
        log.info("id:{}",ts.getId());
        return "health";
    }
}
