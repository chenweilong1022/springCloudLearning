package com.hyan.feignclient.controller;

import com.hyan.feignclient.service.FeignService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired

    private FeignService feignService;

    @GetMapping("hi")
    public String hi(
           @RequestParam(defaultValue = "chenweilong",value = "name") String name
    ) {
        return feignService.hi(name);
    }

}
