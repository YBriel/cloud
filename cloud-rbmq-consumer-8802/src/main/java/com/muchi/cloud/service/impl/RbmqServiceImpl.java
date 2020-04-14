package com.muchi.cloud.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * author: yuzq
 * create: 2020-04-14 16:06
 **/
@Component
@EnableBinding(Sink.class)
public class RbmqServiceImpl {

    @Value("${server.port")
    private String port;

    public void input(Message<String> message){
        System.out.println("收到消息" +message.getPayload()+"-----"+port);
    }
}
