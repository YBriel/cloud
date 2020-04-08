package com.muchi.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * author: yuzq
 * create: 2020-04-08 15:34
 **/
@SpringBootApplication
@EnableEurekaClient
public class OrderMain80 {

    public static void main(String[] args) {
            SpringApplication.run(OrderMain80.class,args);
        }
}
