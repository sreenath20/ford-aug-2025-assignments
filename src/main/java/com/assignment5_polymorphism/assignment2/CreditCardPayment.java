package com.assignment5_polymorphism.assignment2;

public class CreditCardPayment extends Payment {
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of amount: " + amount);
    }
}
