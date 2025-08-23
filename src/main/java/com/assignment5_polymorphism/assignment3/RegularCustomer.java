package com.assignment5_polymorphism.assignment3;

public class RegularCustomer extends Customer {
    public double calculateDiscount(double purchaseAmount) {
        System.out.println("Calculating discount for Regular Customer  ");
        return super.calculateDiscount(purchaseAmount);
    }
}

