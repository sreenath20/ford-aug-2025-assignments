package com.assignment6_part1.assignment3;

public class Order {
    private int orderID;
    private String CustomerName;
    private String product;
    static int count = 0;

    public Order(int orderId,String customerName,String product) {
        this.orderID = orderId;
        this.CustomerName = customerName;
        this.product = product;
        count++;
    }

     public static void display() {
        System.out.println("total number of orders:"+count);
     }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Order.count = count;
    }
}
