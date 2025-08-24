package com.harini.assignment5.Question2;

public class CreditCardPayment extends Payment {
    @Override
    public void paymentProcess(double amount) {
        System.out.println("Processing credit card payment of "+amount);
    }
}
