package com.wangx.nacos.discovery.client.webclient.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
public class HelloController {

    @Autowired
    private WebClient.Builder webClientBuilder;

    @GetMapping("/hello")
    public Mono<String> hello(String name) {
        Mono<String> result = webClientBuilder.build()
                .get()
                .uri("http://alibaba-nacos-discovery-server/hello?name=" + name)
                .retrieve()
                .bodyToMono(String.class);
        return result;
    }
}

