package com.muchi.cloud.service.controller;

import com.muchi.cloud.service.IMessageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * author: yuzq
 * create: 2020-04-14 15:31
 **/
@RestController
public class SendMsgController {

    @Resource
    private IMessageService service;

    @RequestMapping("/sendMsg")
    public String sendMsg(){
        return service.send();
    }
}
