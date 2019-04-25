package com.blank.nacos.producer.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @NacosValue(value = "${username:null}", autoRefreshed = true)
    private String username;

    @RequestMapping(value = "/getUser")
    public String getUser() {
        return username;
    }
}
