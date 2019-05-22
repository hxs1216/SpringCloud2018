package com.biyao.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author:hxs
 * @Description:springmvc中applicationContext.xml
 * 相当于springboot的@Configuration配置的ConfigBean
 */
@Configuration
public class ConfigBean {

    @LoadBalanced //Spring Cloud Ribbon客户端负载均衡的工具
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
//<bean id="userService" class="com.biyao.UserService"/>
