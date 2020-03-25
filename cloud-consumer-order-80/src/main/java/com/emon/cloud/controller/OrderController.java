package com.emon.cloud.controller;

import com.emon.cloud.entities.CommonResult;
import com.emon.cloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Author:   cafe babe
 * Date:     3/7/20 10:14 PM
 * Description:
 * History:
 */
@RestController
@Slf4j
@SuppressWarnings("rawtypes")
public class OrderController {

    public static final String PAYMENT_SERVICE = "http://CLOUD-PROVIDER-PAYMENT/payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult create(Payment payment) {
        return  restTemplate.postForObject(PAYMENT_SERVICE + "/create", payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult getPayment(@PathVariable("id") Long id) {
        log.info("order consumer query payment record, with id: " + id);
        return restTemplate.getForObject(PAYMENT_SERVICE + "/get/" + id, CommonResult.class);
    }
}
