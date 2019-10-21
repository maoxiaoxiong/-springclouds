package com.config.zipkin.config.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZipkinServer
public class ConfigZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigZipkinApplication.class, args);
    }

}
