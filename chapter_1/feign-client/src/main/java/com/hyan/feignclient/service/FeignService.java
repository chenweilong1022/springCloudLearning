package com.hyan.feignclient.service;

import com.hyan.feignclient.config.FeignConfig;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client",configuration = FeignConfig.class)
public interface FeignService {

    @GetMapping(value = "/hi")
    String hi(
            @RequestParam("name") String name
    );
}
