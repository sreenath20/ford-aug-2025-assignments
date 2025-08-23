package com.assignment5_polymorphism.assignment3;

public class Driver {
    public static void main(String[] args) {
        Customer regularCustomer = new RegularCustomer();
        double regularDiscount = regularCustomer.calculateDiscount(100.0);
        System.out.println("Regular Customer Discount: " + regularDiscount); // Output: 5.0

        Customer premiumCustomer = new PremiumCustomer();
        double premiumDiscount = premiumCustomer.calculateDiscount(100.0);
        System.out.println("Premium Customer Discount: " + premiumDiscount); // Output: 15.0

        // Testing the overloaded method with points
        double premiumWithPoints = premiumCustomer.calculateDiscount(100.0, 5);
        System.out.println("Premium Customer Discount with " + 5+"  Points: " + premiumWithPoints); // Output: 65.0
    }
}
