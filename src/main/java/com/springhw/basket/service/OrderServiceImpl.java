package com.springhw.basket.service;

import com.springhw.basket.Basket;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class OrderServiceImpl implements OrderService {
    private final Basket basket;

    public OrderServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public String addOrder(Set<Integer> order) {
        basket.addOrder(order);
        return "Order added";
    }

    @Override
    public Set<Integer> getOrder() {
        return basket.getBasket();
    }
}
