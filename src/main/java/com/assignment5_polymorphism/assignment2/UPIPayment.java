package com.assignment5_polymorphism.assignment2;

public class UPIPayment extends Payment{
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of amount: " + amount);
    }
}
