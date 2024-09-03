package com.panta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class PantaZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(PantaZuulApplication.class, args);
    }

}
