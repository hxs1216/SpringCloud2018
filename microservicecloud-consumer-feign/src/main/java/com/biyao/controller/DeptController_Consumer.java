package com.biyao.controller;

import com.biyao.entities.Dept;
import com.biyao.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author:hxs
 * @Description:消费者Controller前后端分离(feign)
 */
@RestController
public class DeptController_Consumer {

    @Autowired
    private DeptClientService service; //feign提供的声明式接口

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return this.service.get(id);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list(){
        return this.service.list();
    }

    @RequestMapping(value = "/consumer/dept/add")
    public Object add(Dept dept){
        return this.service.add(dept);
    }

}
