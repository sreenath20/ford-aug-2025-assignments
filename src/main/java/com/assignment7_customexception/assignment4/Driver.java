package com.assignment7_customexception.assignment4;

public class Driver {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        try {
            orderService.placeOrder("Laptop", 1);
        } catch (InvalidOrderQuantityException e) {
            System.out.println(e.getMessage());
        }
    }



}
