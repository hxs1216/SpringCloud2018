package com.biyao.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
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

    //Spring Cloud Ribbon客户端负载均衡的工具
    @LoadBalanced
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    //Ribbon中分配算法轮询服务失败则在指定时间内进行重试获取可用的服务
    @Bean
    public IRule myRule(){
        return new RetryRule();
    }

}
