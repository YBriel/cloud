package com.muchi.payment.dao;

import com.muchi.common.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * author: yuzq
 * create: 2020-04-08 10:50
 **/
@Mapper
@Component
public interface PaymentDao {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
