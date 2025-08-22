package com.assignments.assignment3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Groceries extends Product {

    private String expiryDate;


    public Groceries(long productId, String productName, double price, String description,String expiryDate) {
        super(productId, productName, price, description);
        this.expiryDate = expiryDate;
    }


    @Override
    public void displayDetails() {
        System.out.println("Groceries ");
        super.displayDetails();
        System.out.println("Expiry Date: " + expiryDate);
    }
}
