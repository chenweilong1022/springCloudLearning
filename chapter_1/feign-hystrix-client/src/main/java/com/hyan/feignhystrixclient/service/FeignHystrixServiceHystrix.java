package com.hyan.feignhystrixclient.service;

import org.springframework.stereotype.Component;

@Component
public class FeignHystrixServiceHystrix implements FeignHystrixService{
    @Override
    public String hi(String name) {
        return "hi ," + name + "sorry Error";
    }
}
