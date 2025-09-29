package com.fooddelivery.payment;

import org.springframework.stereotype.Component;

@Component("CardPaymentProcessor")
public class CardPaymentProcessor implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Card Payment  Rs." + amount);
    }
}
