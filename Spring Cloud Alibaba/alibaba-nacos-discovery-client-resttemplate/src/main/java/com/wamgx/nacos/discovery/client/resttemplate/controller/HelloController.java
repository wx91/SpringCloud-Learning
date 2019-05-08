package com.wamgx.nacos.discovery.client.resttemplate.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class HelloController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        String result = restTemplate.getForObject("http://alibaba-nacos-discovery-server/hello?name=" + name, String.class);
        return "Return : " + result;
    }
}
