package com.leonardozw.kafka.consumers;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    @KafkaListener(topics = "order-shipping", groupId = "group-shipping")
    public void receivedOrderShipping(String address) {
        System.out.println("O endereço de envio é: " + address);
    }
}
