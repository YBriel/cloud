package com.muchi.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * author: yuzq
 * create: 2020-04-10 15:20
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class Hystrix8001 {
    
    public static void main(String[] args) {
            SpringApplication.run(Hystrix8001.class,args);
        }
}
