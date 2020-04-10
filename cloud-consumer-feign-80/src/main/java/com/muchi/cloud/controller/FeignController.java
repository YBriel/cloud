package com.muchi.cloud.controller;

import com.muchi.cloud.service.PaymentFeignService;
import com.muchi.common.entity.CommonResult;
import com.muchi.common.entity.Payment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * author: yuzq
 * create: 2020-04-10 14:19
 **/
@RestController
public class FeignController {

    @Resource
    private PaymentFeignService feignService;

    @RequestMapping("/feignClient/getPaymentById")
    public CommonResult getPaymentById(Long id){
       return feignService.getPaymentById(id);
    }


}
