package com.assignments.assignment5;

public class CreditCardPayment extends Payment{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card Payment Rs."+amount);
    }
}
