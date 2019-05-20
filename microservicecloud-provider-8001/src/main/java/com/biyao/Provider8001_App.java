package com.biyao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author:hxs
 * @Description:启动类
 */
@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
public class Provider8001_App {
    public static void main(String[] args) {
        SpringApplication.run(Provider8001_App.class,args);
    }
}
