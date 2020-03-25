package com.emon.cloud.controller;

import com.emon.cloud.entities.CommonResult;
import com.emon.cloud.entities.Payment;
import com.emon.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Author:   cafe babe
 * Date:     3/7/20 6:59 PM
 * Description:
 * History:
 */
@RestController
@Slf4j
@SuppressWarnings({"rawtypes", "unchecked"})
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("create a payment record: " + payment);
        if (result > 0) return new CommonResult(200, "insert success, server port: " + serverPort, payment);
        else return new CommonResult(500,"insert failed");
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult get(@PathVariable("id") Long id) {
        log.info("query payment record, with id: " + id);
        Payment payment = paymentService.getPaymentById(id);
        if (payment == null) return new CommonResult(404, "not found");
        return new CommonResult(200, "query success, server port: " + serverPort, payment);
    }

    @GetMapping("/payment/zk")
    public String zkService() {
        return serverPort + "connected zookeeper successful!";
    }
}
