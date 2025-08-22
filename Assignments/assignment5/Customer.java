package com.assignments.assignment5;

public class Customer {

    public void calculateDiscount(double purchaseAmount){
        System.out.println("Purchase Amount is "+purchaseAmount+" Discount 10% :"+(purchaseAmount*0.10));
        System.out.println("Final Amount is "+(purchaseAmount-purchaseAmount*0.10));
    }
    public void calculatePayment(double purchaseAmount,int loyalityPoints){
        System.out.println("Purchase Amount is "+purchaseAmount+" Discount 10% :"+(purchaseAmount*0.10+loyalityPoints));
        System.out.println("Final Amount(- loyality points) is "+(purchaseAmount-loyalityPoints-purchaseAmount*0.10));
    }
}
