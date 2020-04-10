package com.muchi.cloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * author: yuzq
 * create: 2020-04-10 15:21
 **/
@Service
public class PaymentService {

   // @RequestMapping("/paymentInfo")
    public String paymentInfo_ok(Integer id){
        return "线程池"+Thread.currentThread().getName()+"Payment"+id;
    }

   // @RequestMapping("/paymentTimeout")
   /* @HystrixCommand(fallbackMethod = "paymentInfo_timeoutFallback"
    ,@HystrixCommand(commandProperties = ))
    public String paymentInfo_timeout(Integer id){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池"+Thread.currentThread().getName()+"Payment"+id;
    }
    public String paymentInfo_timeoutFallback(Integer id){
        return id+"有误";
    }*/
}
