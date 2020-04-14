package com.muchi.cloud.service.impl;

import com.muchi.cloud.service.IMessageService;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * author: yuzq
 * create: 2020-04-14 15:25
 **/
@EnableBinding(Source.class)
public class MessageServiceImpl implements IMessageService {

    @Resource
    private MessageChannel output;

    @Override
    public String send() {
        String serial= UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("serial+"+serial);
        return null;
    }
}
