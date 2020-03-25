package com.emon.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Author:   cafe babe
 * Date:     3/7/20 10:10 PM
 * Description:
 * History:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderBoot80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderBoot80.class, args);
    }
}
