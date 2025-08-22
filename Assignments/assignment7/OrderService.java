package com.assignments.assignment7;

public class OrderService {

    void placeOrder(String productName,int quantity) throws InvalidOrderQuantityException {
        System.out.print("Placing Order : " +productName+ "(Quantity:"+quantity+") : ");
        if(quantity <= 0) throw new InvalidOrderQuantityException("Quantity must be greater than zero");
        System.out.println("Order Placed Successfully");

    }
}
