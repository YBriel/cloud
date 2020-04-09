package com.muchi.cloud.controller;

import com.muchi.common.entity.CommonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * author: yuzq
 * create: 2020-04-09 14:27
 **/
@RestController
public class ConsumerController {

    public static final String INVOKE_URL="http://consul-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/testZk")
    public String testZk(){
       return restTemplate.getForObject(INVOKE_URL+"/paymentInfo/consul", String.class);
    }
}
