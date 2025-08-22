package com.assignments.assignment5;

import com.training.day5.C;

public class PremiumCustomer extends Customer {

    @Override
    public void calculateDiscount(double purchaseAmount){
        System.out.println("Premium customer-- 15% discount.");
        System.out.println("Purchase Amount is "+purchaseAmount+" Discount 15% :"+(purchaseAmount*0.15));
        System.out.println("Final Amount is "+(purchaseAmount-purchaseAmount*0.15));
    }
    @Override
    public void calculatePayment(double purchaseAmount,int loyalityPoints){
        System.out.println("Premium customer-- 15% discount.");
        System.out.println("Purchase Amount is "+purchaseAmount+" Discount 15% + loyality points:"+(purchaseAmount*0.15+loyalityPoints));
        System.out.println("Final Amount(- loyality points) is "+(purchaseAmount-loyalityPoints-purchaseAmount*0.15));
    }
}
