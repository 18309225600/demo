package com.example.demo.facade;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * @author liuhongfei
 * @desc 入口
 * @since v1.0.0
 **/
@SpringBootApplication
@ComponentScan(basePackages = {
        "com.example.demo.repository.config.datasource.*",
        "com.example.demo.facade.*",
        "com.example.demo.service.*"})
@MapperScan("com.example.demo.repository.mapper")
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class,args);
    }
}
