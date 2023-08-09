package com.leonardozw.kafka.consumers;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @KafkaListener(topics = "order-payment", groupId = "group-payment")
    public void receivedOrderPayment(String payment) {
        System.out.println("A forma de pagamento é: " + payment);
    }
}
