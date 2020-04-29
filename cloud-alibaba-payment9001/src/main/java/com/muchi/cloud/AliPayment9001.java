package com.muchi.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * author: yuzq
 * create: 2020-04-15 10:40
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class AliPayment9001 {

    public static void main(String[] args) {
            SpringApplication.run(AliPayment9001.class,args);
        }
}
