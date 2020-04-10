package com.muchi.payment.controller;

import com.muchi.common.entity.CommonResult;
import com.muchi.common.entity.Payment;
import com.muchi.payment.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * author: yuzq
 * create: 2020-04-08 11:19
 **/
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping("/payment/create")
    @ResponseBody
    public CommonResult create(Payment payment) {
        int i = paymentService.create(payment);
        log.info("插入结果" + i);
        if (i > 0) {
            return new CommonResult(200, "ok", i);
        } else {
            return new CommonResult(500, "false", null);
        }
    }

    @GetMapping("/payment/getPaymentById")
    public CommonResult getPaymentById(Long id) {
        Payment paymentById = paymentService.getPaymentById(id);
        ;
        log.info("请求进来了");
        if (paymentById != null) {
            log.info(paymentById.toString());
            return new CommonResult(200, "按时大大", paymentById);
        } else {
            return new CommonResult(500, "查询失败", null);
        }
    }

    @RequestMapping("/testTimeout")
    public Integer testTimeout() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 9001;
    }
}
