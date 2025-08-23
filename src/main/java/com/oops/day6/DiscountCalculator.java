package com.oops.day6;

public class DiscountCalculator {

    public double calculateDiscount(double price, double discountpercent) {

        double discountAmount = (price * discountpercent) / 100;
        double finalprice=price -discountAmount;
        return finalprice;
    }

    public double calculateDiscount(double price, double discountamount, boolean isflat) {
        if (isflat) {
            double finalprice = (price - discountamount);
            return finalprice;
        } else {
            return price;
        }

    }

    public double calculateDiscount(double price) {
        double discountAmount = (price * 0.05);
        return price - discountAmount;

    }

}
