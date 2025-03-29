package com.naseer.kafkaProject.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    @KafkaListener(topics = "order_events", groupId = "inventory_group")
    public void updateInventory(String order) {
        // Business logic for updating inventory based on order
        System.out.println("Order received for inventory update: " + order);
    }
}
