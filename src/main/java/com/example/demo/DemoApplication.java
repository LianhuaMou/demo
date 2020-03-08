package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.demo.Controller","com.example.demo.Service.impl"})
//要扫描的两个包controller和service
//此注释自动载入应用程序所需的所有Bean——这依赖于Spring Boot在类路径中的查找。
@MapperScan(basePackages = "com.example.demo.dao")//要扫描的dao包
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
