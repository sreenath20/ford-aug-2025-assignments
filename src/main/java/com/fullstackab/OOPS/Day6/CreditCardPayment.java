package com.fullstackab.OOPS.Day6;

public class CreditCardPayment extends Payment {
    void processPayment(double amount){
        System.out.println("Processing your credit card payment of Rs" +amount);
    }
}
