package com.hyan.hystrixclient.controller;

import com.hyan.hystrixclient.service.HystrixService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixController {

    @Autowired
    private HystrixService hystrixService;

    @GetMapping("hi")
    public String hi(
            @RequestParam(defaultValue = "chenweilong",value = "name") String name
    ) {
        return hystrixService.hi(name);
    }
}
