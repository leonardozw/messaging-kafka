package com.leonardozw.kafka.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.leonardozw.kafka.domain.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
