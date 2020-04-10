package com.muchi.cloud.service;

import com.muchi.common.entity.CommonResult;
import com.muchi.common.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * author: yuzq
 * create: 2020-04-10 14:15
 **/
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {


    @PostMapping("/feign/create")
     CommonResult create(Payment payment);

    @GetMapping("/payment/getPaymentById")
     CommonResult getPaymentById(@RequestParam("id")Long id);
}
