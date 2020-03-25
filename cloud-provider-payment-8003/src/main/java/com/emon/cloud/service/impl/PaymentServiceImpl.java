package com.emon.cloud.service.impl;

import com.emon.cloud.dao.PaymentDao;
import com.emon.cloud.entities.Payment;
import com.emon.cloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Author:   cafe babe
 * Date:     3/7/20 6:56 PM
 * Description:
 * History:
 */
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
