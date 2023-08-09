package com.leonardozw.kafka.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leonardozw.kafka.domain.dto.OrderDTO;
import com.leonardozw.kafka.domain.service.OrderService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("order")
public class OrderController {

    private OrderService orderService;

    @PostMapping("create")
    public ResponseEntity<OrderDTO> create(@RequestBody OrderDTO oderDTO) {
        OrderDTO order = orderService.create(oderDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(order);
    }

    @GetMapping("list")
    public ResponseEntity<List<OrderDTO>> list() {
        List<OrderDTO> orders = orderService.list();
        return ResponseEntity.status(HttpStatus.OK).body(orders);
    }
}
