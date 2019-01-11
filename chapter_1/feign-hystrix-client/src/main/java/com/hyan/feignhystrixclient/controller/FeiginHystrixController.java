package com.hyan.feignhystrixclient.controller;

import com.hyan.feignhystrixclient.service.FeignHystrixService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeiginHystrixController {

    @Autowired
    private FeignHystrixService feignHystrixService;

    @GetMapping("hi")
    public String hi(
            @RequestParam(defaultValue = "chenweilong",value = "name") String name
    ) {
        return feignHystrixService.hi(name);
    }
}
