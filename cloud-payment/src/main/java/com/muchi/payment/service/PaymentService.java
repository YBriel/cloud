package com.muchi.payment.service;

import com.muchi.common.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * author: yuzq
 * create: 2020-04-08 11:16
 **/
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
