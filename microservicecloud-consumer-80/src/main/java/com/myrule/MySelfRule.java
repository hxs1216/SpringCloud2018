package com.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:hxs
 * @Description:Ribbon分配策略
 */

@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        return new RandomRule_ZY(); // 自定义为每台机器5次
    }

}
