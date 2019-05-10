package com.wangx.nacos.discovery.client.feign.controller;

import com.wangx.nacos.discovery.client.feign.feign.HelloFeignClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @Autowired
    private HelloFeignClient helloFeignClient;

    @GetMapping("/hello")
    public String hello(String name) {
        String result = helloFeignClient.hello(name);
        return "Return : " + result;
    }
}
