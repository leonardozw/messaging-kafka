package com.leonardozw.kafka.consumers;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.leonardozw.kafka.domain.dto.OrderDTO;

@Service
public class PaymentService {

    @KafkaListener(topics = "order-created-payment", groupId = "group-consumer")
    public void receivedOrderPayment(OrderDTO order) {
        System.out.println("A forma de pagamento é: " + order.orderPayment());
    }
}
