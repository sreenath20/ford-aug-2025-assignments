package com.harini.day6;

import com.harini.assignment3.Question4.Student;

public class DiscountCalculation {
    public double calculateDiscount(double price, double discountPercent) {
        return price-=price * discountPercent;
    }
    public double calculateDiscount(double price, double discountPercent , boolean isFlat) {
        if(isFlat){
            price-=price * discountPercent;
        }
        return price;
    }
    public double calculateDiscount(double price) {
        return price-=price*0.05;
    }
}
