package com.emon.cloud.service;

import com.emon.cloud.entities.Payment;

/**
 * Author:   cafe babe
 * Date:     3/7/20 6:55 PM
 * Description:
 * History:
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(Long id);

}
