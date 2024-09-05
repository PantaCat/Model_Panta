package com.panta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PantaGateWayApplication {

    public static void main(String[] args) {
        SpringApplication.run(PantaGateWayApplication.class, args);
    }

}
