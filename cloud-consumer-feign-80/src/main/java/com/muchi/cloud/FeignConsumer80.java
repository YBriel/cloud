package com.muchi.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * author: yuzq
 * create: 2020-04-10 14:14
 **/
@SpringBootApplication
@EnableFeignClients
public class FeignConsumer80 {

    public static void main(String[] args) {
            SpringApplication.run(FeignConsumer80.class,args);
        }

}
