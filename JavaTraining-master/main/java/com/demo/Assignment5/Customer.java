package com.demo.Assignment5;

public class Customer {
    void calculateDiscount(double purchaseAmount){
        System.out.println("purchase amount: "+purchaseAmount);
    }
    void calculateDiscount(double purchaseAmount,int LoyaltyPoints){
        System.out.println("purchase amount: "+purchaseAmount+"Loyalty points: "+LoyaltyPoints);
    }

}
class RegularCustomer{
    void calculateDiscount(double purchaseAmount){
        System.out.println("purchase amount: "+purchaseAmount);
    }
    void calculateDiscount(double purchaseAmount,int LoyaltyPoints){
        System.out.println("purchase amount: "+purchaseAmount+"Loyalty points: "+LoyaltyPoints);

    }
}
class PremiumCustomer{
    void calculateDiscount(double purchaseAmount){
        System.out.println("purchase amount: "+purchaseAmount);
    }
    void calculateDiscount(double purchaseAmount,int LoyaltyPoints){
        System.out.println("purchase amount: "+purchaseAmount+"Loyalty points: "+LoyaltyPoints);
    }
}
