package com.muchi.cloud.controller;

import com.muchi.cloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: yuzq
 * create: 2020-04-10 15:24
 **/
@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @RequestMapping("/paymentInfo")
    public String paymentInfo_ok(Integer id){
        return paymentService.paymentInfo_ok(id);
    }

    @RequestMapping("/paymentTimeout")
    public String paymentInfo_timeout(Integer id){
        return paymentService.paymentInfo_timeout(id);
    }
}
