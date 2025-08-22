package com.fullstackab.OOPS.Day6;

public class DiscountCalculator {

    public double calculateDiscount(double price,double discountPercent){
        return price * discountPercent;
    }

    public double calculateDiscount(double price){
        return price * 0.05;
    }

    public double calculateDiscount(double price,double discountAmount, boolean isFlat){
       double discountValue = 0;
        if(isFlat){
            discountValue = price * discountAmount;
        }
        return  discountValue;
    }
}
