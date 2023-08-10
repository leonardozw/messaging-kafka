package com.leonardozw.kafka.consumers;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.leonardozw.kafka.domain.dto.OrderDTO;

@Service
public class ShippingService {

    @KafkaListener(topics = "order-created-shipping", groupId = "group-consumer")
    public void receivedOrderShipping(OrderDTO order) {
        System.out.println("O endereço de envio é: " + order.orderAddress());
    }
}
