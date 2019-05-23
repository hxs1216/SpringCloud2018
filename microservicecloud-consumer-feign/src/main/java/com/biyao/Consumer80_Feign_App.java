package com.biyao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author:hxs
 * @Description:消费者启动类
 */

@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableFeignClients(basePackages= {"com.biyao"})
@ComponentScan("com.biyao")
public class Consumer80_Feign_App {
    public static void main(String[] args) {
        SpringApplication.run(Consumer80_Feign_App.class,args);
    }
}
