package com.cloud.gateway.config.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
@EnableZuulProxy
public class ConfigZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigZuulApplication.class, args);
    }

}
