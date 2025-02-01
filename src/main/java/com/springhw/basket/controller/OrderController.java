package com.springhw.basket.controller;

import com.springhw.basket.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/add")
    public String addOrder(@RequestParam Set<Integer> order) {
        return orderService.addOrder(order);
    }
    @GetMapping("/get")
    public Set<Integer> getOrder() {
        return orderService.getOrder();
    }
}
