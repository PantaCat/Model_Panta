package com.panta.config;

import com.panta.handler.MyMetaObjectHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBatisPlusConfig {
    @Bean
    public MyMetaObjectHandler metaObjectHandler() {
        return new MyMetaObjectHandler();
    }
}
