package com.assignment5_polymorphism.assignment3;

public class PremiumCustomer extends Customer {
    public double calculateDiscount(double purchaseAmount) {
        System.out.println("Calculating discount for Premimum Customer because 10 percent extra discount ");
        return super.calculateDiscount(purchaseAmount) + (purchaseAmount * 0.10);
    }
}
