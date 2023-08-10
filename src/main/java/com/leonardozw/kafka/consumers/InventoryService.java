package com.leonardozw.kafka.consumers;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.leonardozw.kafka.domain.dto.OrderDTO;

@Service
public class InventoryService {

    @KafkaListener(topics = "order-created-inventory", groupId = "group-consumer")
    public void receivedOrderItem(OrderDTO order) {
        System.out.println("O item pedido: " + order.orderItem() + " está em estoque!");
    }
}
