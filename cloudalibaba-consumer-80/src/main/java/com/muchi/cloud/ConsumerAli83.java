package com.muchi.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * author: yuzq
 * create: 2020-04-15 11:12
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerAli83 {

    public static void main(String[] args) {
            SpringApplication.run(ConsumerAli83.class,args);
        }
}
