package com.emon.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Author:   cafe babe
 * Date:     3/7/20 11:31 AM
 * Description:
 * History:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentBoot8003 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentBoot8003.class, args);
    }
}
