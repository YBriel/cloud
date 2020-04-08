package com.muchi.payment.service.impl;

import com.muchi.common.entity.Payment;
import com.muchi.payment.dao.PaymentDao;
import com.muchi.payment.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * author: yuzq
 * create: 2020-04-08 11:16
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
