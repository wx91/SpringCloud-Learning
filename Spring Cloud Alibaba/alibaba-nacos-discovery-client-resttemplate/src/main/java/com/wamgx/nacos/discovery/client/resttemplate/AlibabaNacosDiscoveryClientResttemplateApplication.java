package com.wamgx.nacos.discovery.client.resttemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AlibabaNacosDiscoveryClientResttemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaNacosDiscoveryClientResttemplateApplication.class, args);
    }

}
