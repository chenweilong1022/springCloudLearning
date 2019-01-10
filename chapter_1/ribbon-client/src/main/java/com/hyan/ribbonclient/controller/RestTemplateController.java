package com.hyan.ribbonclient.controller;

import com.hyan.ribbonclient.service.RestTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTemplateController {

    @Autowired
    private RestTemplateService restTemplateService;

    @GetMapping("hi")
    public String hi(
            @RequestParam(defaultValue = "chenweilong",value = "name") String name
    ) {
        return restTemplateService.hi(name);
    }
}
