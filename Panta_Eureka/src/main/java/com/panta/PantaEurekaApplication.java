package com.panta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class PantaEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PantaEurekaApplication.class, args);
    }

}
