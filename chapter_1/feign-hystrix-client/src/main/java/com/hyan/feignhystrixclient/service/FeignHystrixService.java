package com.hyan.feignhystrixclient.service;

import com.hyan.feignhystrixclient.config.FeignConfig;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client",configuration = FeignConfig.class,fallback = FeignHystrixServiceHystrix.class)
public interface FeignHystrixService {

    @GetMapping(value = "/hi")
    String hi(
            @RequestParam(value = "name") String name
    );
}
