package com.harini.assignment5.Question3;

public class PremiumCustomer extends Customer{
    public void calculateDiscount(double purchaseAmount) {
        System.out.println("You are a premium customer so the discount is "+(purchaseAmount*0.20));
    }
}
