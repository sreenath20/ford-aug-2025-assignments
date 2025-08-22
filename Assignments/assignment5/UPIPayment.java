package com.assignments.assignment5;

public class UPIPayment extends Payment{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing  UPI Payment Rs."+amount);
    }
}
