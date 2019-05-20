package com.biyao.cfgbeans;

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

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
//<bean id="userService" class="com.biyao.UserService"/>
