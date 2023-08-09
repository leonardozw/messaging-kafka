package com.leonardozw.kafka.domain.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import com.leonardozw.kafka.domain.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
    List<Order> findAll(Sort s);
}
