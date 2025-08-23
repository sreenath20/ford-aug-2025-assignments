package com.assignment6_part1.assignment3;

public class Driver {
    public static void main(String[] args) {
        Order order1 = new Order(1, "aaa", "Laptop");
        Order order2 = new Order(2, "bbb", "Smartphone");
        Order order3 = new Order(3, "ccc", "Tablet");


        Order.display();


        System.out.println("Order ID: " + order1.getOrderID() + ", Customer Name: " + order1.getCustomerName() + ", Product: " + order1.getProduct());
        System.out.println("Order ID: " + order2.getOrderID() + ", Customer Name: " + order2.getCustomerName() + ", Product: " + order2.getProduct());
        System.out.println("Order ID: " + order3.getOrderID() + ", Customer Name: " + order3.getCustomerName() + ", Product: " + order3.getProduct());
    }
}
