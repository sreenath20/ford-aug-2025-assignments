package com.fooddelivery.payment;

import org.springframework.stereotype.Component;

@Component("cardPaymentProcessor")
public class CardPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("\nProcessing card payment of Rs." + amount);
        System.out.println("Card payment successful!");
    }
}
