package com.leonardozw.kafka.consumers;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    @KafkaListener(topics = "order-inventory", groupId = "group-inventory")
    public void receivedOrderItem(String item) {
        System.out.println("O item pedido: " + item + " está em estoque!");
    }
}
