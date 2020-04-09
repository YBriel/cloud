package com.muchi.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

/**
 * author: yuzq
 * create: 2020-04-09 15:27
 **/
@Controller
public class ConsumerController {
    public static final String INVOKE_URL="http://cloud-provider-payment";
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/testConsul")
    public String testZk(){
        return restTemplate.getForObject(INVOKE_URL+"/payment/zk", String.class);
    }
}
