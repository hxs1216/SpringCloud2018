package com.biyao;
import com.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author:hxs
 * @Description:消费者启动类
 */

@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@RibbonClient(name="microservicecloud",configuration = MySelfRule.class) //启动该微服务就能加载自定义Ribbon配置类，从而使配置生效
public class Consumer80_App {
    public static void main(String[] args) {
        SpringApplication.run(Consumer80_App.class,args);
    }
}
