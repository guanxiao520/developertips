package com.example.developertips.nacosfeigndemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 启动类
 * @author cary
 */
@SpringBootApplication
@RestController
public class ApplicationDemo {
    private static final Logger logger = LoggerFactory.getLogger(ApplicationDemo.class);

    public static void main(String[] args) {
        SpringApplication.run(ApplicationDemo.class, args);
        logger.info("nacos-discovery-server启动");
    }

    @GetMapping("getMessage")
    public String getMessage(){
        return "来调戏我啊！！！";
    }
}