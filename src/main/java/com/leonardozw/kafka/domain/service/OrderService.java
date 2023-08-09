package com.leonardozw.kafka.domain.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.leonardozw.kafka.domain.dto.OrderDTO;
import com.leonardozw.kafka.domain.entity.Order;
import com.leonardozw.kafka.domain.repository.OrderRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class OrderService {

    private OrderRepository orderRepository;

    public OrderDTO create(OrderDTO orderDTO) {
        Order order = new Order();
        order.setOrderItem(orderDTO.orderItem());
        order.setOrderPrice(orderDTO.orderPrice());
        order.setOrderAdress(orderDTO.orderAdress());
        order.setOrderPayment(orderDTO.orderPayment());
        orderRepository.save(order);
        return orderDTO;
    }

    public List<OrderDTO> list() {
        Sort sort = Sort.by("orderPrice").descending();
        List<Order> orders = orderRepository.findAll(sort);
        return orders.stream()
                .map(o -> new OrderDTO(o.getOrderItem(), o.getOrderPrice(), o.getOrderAdress(), o.getOrderPayment()))
                .collect(Collectors.toList());
    }
}
