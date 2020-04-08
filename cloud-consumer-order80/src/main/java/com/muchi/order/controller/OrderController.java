package com.muchi.order.controller;

import com.muchi.common.entity.CommonResult;
import com.muchi.common.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * author: yuzq
 * create: 2020-04-08 15:39
 **/
@Slf4j
@Controller
public class OrderController {

    public static final String PAYMENT_URL="http://localhost:8001";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult create(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment,CommonResult.class);
    }

    @GetMapping("/consumer/payment/getPaymentById")
    @ResponseBody
    public CommonResult getPaymentById(Long id){
      return restTemplate.getForObject(PAYMENT_URL+"/payment/getPaymentById?id="+id,CommonResult.class);
    }


}
