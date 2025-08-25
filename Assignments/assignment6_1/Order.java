package com.assignments.assignment6_1;

public class Order {
    static Integer orderCounter = 0;
    static void displayTotalOrder(){
        System.out.println("Total Orders : "+orderCounter);
    }

    Integer orderId;
    String customerName;
    String productName;

    public Order(Integer orderId, String customerName, String productName){
        this.orderId = orderId;
        this.customerName = customerName;
        this.productName = productName;
        orderCounter++;
    }
}
