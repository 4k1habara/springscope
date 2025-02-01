package com.springhw.basket;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
@Scope("prototype")
public class Basket {
    Set<Integer> basket = new HashSet<>();

    public Set<Integer> getBasket() {
        return basket;
    }

    public void setBasket(Set<Integer> basket) {
        this.basket = basket;
    }

    public void addOrder(Set<Integer> order) {
        basket.addAll(order);
    }
}
