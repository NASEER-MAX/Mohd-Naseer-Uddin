package com.naseer.kafkaProject.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;


import java.util.concurrent.CompletableFuture;

@Service
public class OrderService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC = "naseerIsthebest";

    public void placeOrder(String order) {
        // Business logic for placing an order
       CompletableFuture<SendResult<String, String>> future= kafkaTemplate.send(TOPIC, order);
        future.whenComplete((result,ex)-> {
            if (ex == null) {
                System.out.println("sent message=[" + order +
                        "] with offset=[" + result.getRecordMetadata().offset() + "]");
            } else {
                System.out.println("Unable to send msg=[" +
                        order + "] due to :" + ex.getMessage());
            }
        });
        System.out.println("Order event published: " + order);
    }
}
