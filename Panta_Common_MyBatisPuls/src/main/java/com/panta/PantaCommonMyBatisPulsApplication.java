package com.panta;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.panta.mapper")
@SpringBootApplication
public class PantaCommonMyBatisPulsApplication {

    public static void main(String[] args) {
        SpringApplication.run(PantaCommonMyBatisPulsApplication.class, args);
    }

}
