package com.harini.assignment7.question4;

import com.harini.assignment7.question2.TimeLimitExceededException;

public class OrderService {
    public void placeOrder(String name,int quantity) throws InvalidOrderQuantityException {
        if(quantity<=0){
            throw new InvalidOrderQuantityException("Order Quantity must be greater than 0");
        }
        else{
            System.out.println("Order placed Successful");
        }
    }
}
