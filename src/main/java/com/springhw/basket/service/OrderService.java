package com.springhw.basket.service;

import java.util.Set;

public interface OrderService {
    String addOrder(Set<Integer> order);

    Set<Integer> getOrder();
}
