package com.leonardozw.kafka.domain.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String orderItem;
    private LocalDateTime orderDate = LocalDateTime.now();
    private Double orderPrice;
    private String orderAdress;
    private String orderPayment;

    public Order(Long id, String orderItem, LocalDateTime orderDate, Double orderPrice, String orderAdress,
            String orderPayment) {
        this.id = id;
        this.orderItem = orderItem;
        this.orderDate = LocalDateTime.now();
        this.orderPrice = orderPrice;
        this.orderAdress = orderAdress;
        this.orderPayment = orderPayment;
    }

    public Order(String orderItem, Double orderPrice, String orderAdress, String orderPayment) {
        this.orderItem = orderItem;
        this.orderPrice = orderPrice;
        this.orderAdress = orderAdress;
        this.orderPayment = orderPayment;
    }

}
