package com.harini.assignment5.Question3;

public class Customer {
    public void calculateDiscount(double purchaseAmount){
        System.out.println("The discount for the product is "+(purchaseAmount*0.05));
    }
    public void calculateDiscount(double purchaseAmount,byte loyaltyPoints){
        System.out.println("The discount for the product is "+(purchaseAmount*0.05+loyaltyPoints));
    }
}
