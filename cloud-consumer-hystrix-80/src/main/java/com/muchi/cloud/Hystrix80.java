package com.muchi.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * author: yuzq
 * create: 2020-04-10 15:45
 **/
@SpringBootApplication
@EnableFeignClients
public class Hystrix80 {

    public static void main(String[] args) {
            SpringApplication.run(Hystrix80.class,args);
        }
}
