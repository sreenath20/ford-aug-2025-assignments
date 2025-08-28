package com.assignment.day6;

class Customer{
    public void calculateDiscount(double purchaseAmount) {
        double discount;
        if (purchaseAmount > 1000) {
            discount = purchaseAmount * 0.1; // 10% discount
        } else if (purchaseAmount > 500) {
            discount = purchaseAmount * 0.05; // 5% discount
        } else {
            discount = 0; // No discount
        }
        System.out.println("Discount: " + discount);
    }

    public void calculateDiscount(double purchaseAmount, int loyaltyPoints) {
        double discount;
        if (loyaltyPoints > 100) {
            discount = purchaseAmount * 0.15; // 15% discount for high loyalty points
        } else if (loyaltyPoints > 50) {
            discount = purchaseAmount * 0.1; // 10% discount for medium loyalty points
        } else {
            discount = purchaseAmount * 0.05; // 5% discount for low loyalty points
        }
        System.out.println("Discount with Loyalty Points: " + discount);
    }

}

class RegularCustomer extends Customer {
    @Override
    public void calculateDiscount(double purchaseAmount) {
        double discount = purchaseAmount * 0.02; // 2% discount for regular customers
        System.out.println("Regular Customer Discount: " + discount);
    }
}

class PremiumCustomer extends Customer {
    @Override
    public void calculateDiscount(double purchaseAmount) {
        double discount = purchaseAmount * 0.05; // 5% discount for premium customers
        System.out.println("Premium Customer Discount: " + discount);
    }
}

public class Day6Assignment3 {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.calculateDiscount(1200); // Should apply 10% discount
        customer.calculateDiscount(800, 120); // Should apply 15% discount with loyalty
        customer.calculateDiscount(300, 30); // Should apply 5% discount with low loyalty points
        System.out.println();
        RegularCustomer regularCustomer = new RegularCustomer();
        regularCustomer.calculateDiscount(1500); // Should apply 2% discount for regular customer
        System.out.println();
        PremiumCustomer premiumCustomer = new PremiumCustomer();
        premiumCustomer.calculateDiscount(2000); // Should apply 5% discount for premium customer
        System.out.println();


    }
}
