package com.wangx.nacos.config.client.controller;


import com.wangx.nacos.config.client.config.HelloConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @Autowired
    private HelloConfig helloConfig;

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return helloConfig.getTitle() + " name";
    }

}
