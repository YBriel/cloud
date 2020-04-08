package com.muchi.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Author： yuzq
 * Description:
 * Date: 2020/4/8   20:10
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableEurekaServer
public class Eureka7001Main {
    public static void main(String[] args) {
        SpringApplication.run(Eureka7001Main.class,args);
    }
}
