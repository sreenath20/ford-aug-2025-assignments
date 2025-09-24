package com.demo.fooddelivery.order;

import org.springframework.stereotype.Component;

@Component("primeOrder")
public class PrimeOrderService implements OrderService{
    @Override
    public void placeOrder(String item, Double amount) {

    }
}
