package com.assignment5_polymorphism.assignment3;

public class Customer {
    public double calculateDiscount(double purchaseAmount) {

        return purchaseAmount * 0.05;
    }
    public double calculateDiscount(double purchaseAmount, int points ) {

        return (purchaseAmount * 0.05) + (points * 10);
    }


}
