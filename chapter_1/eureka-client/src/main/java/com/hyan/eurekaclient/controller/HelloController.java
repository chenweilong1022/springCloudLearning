package com.hyan.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @Value("${server.port}")
    private String port;

    @GetMapping("hi")
    public String hi(
            @RequestParam(defaultValue = "chenweilong",value = "name") String name
    ) {
        return "你好" + name + "我是:" + port;
    }
}
