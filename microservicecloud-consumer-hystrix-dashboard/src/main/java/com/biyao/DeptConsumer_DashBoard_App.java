package com.biyao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author:hxs
 * @Description:Hystrix监控启动类
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumer_DashBoard_App
{
	public static void main(String[] args)
	{
		SpringApplication.run(DeptConsumer_DashBoard_App.class, args);
	}
}
