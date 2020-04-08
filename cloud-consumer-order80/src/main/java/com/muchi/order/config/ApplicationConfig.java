package com.muchi.order.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * author: yuzq
 * create: 2020-04-08 15:43
 **/
@Configuration
public class ApplicationConfig {

    @Bean
    public RestTemplate template(){
        return new RestTemplate();
    }
}
