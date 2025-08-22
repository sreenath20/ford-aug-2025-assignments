package com.assignments.assignment3;

public class Product {

    private long productId;
    private String productName;
    private double price;
    private String description;

    public Product(long productId, String productName, double price, String description) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.description = description;
    }

    public void displayDetails() {
        System.out.println("Product Id: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Description: " + description);
    }

}
