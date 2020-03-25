package com.emon.cloud.dao;

import com.emon.cloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Author:   cafe babe
 * Date:     3/7/20 6:31 PM
 * Description:
 * History:
 */
@Mapper
public interface PaymentDao {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
