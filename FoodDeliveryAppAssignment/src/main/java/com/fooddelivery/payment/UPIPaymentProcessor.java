package com.fooddelivery.payment;

import org.springframework.stereotype.Component;

@Component("UPIPayment")
public class UPIPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Upi Payment of amount "+amount);
    }
}
