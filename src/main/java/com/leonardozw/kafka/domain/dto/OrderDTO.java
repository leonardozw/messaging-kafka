package com.leonardozw.kafka.domain.dto;

public record OrderDTO(String orderItem, Double orderPrice, String orderAdress, String orderPayment) {

}
