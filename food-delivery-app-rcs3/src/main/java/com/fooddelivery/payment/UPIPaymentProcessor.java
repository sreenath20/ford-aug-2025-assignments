package com.fooddelivery.payment;

import org.springframework.stereotype.Component;

@Component("upiPaymentProcessor")
public class UPIPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("\nProcessing UPI payment of Rs." + amount);
        System.out.println("UPI payment successful!");
    }
}
