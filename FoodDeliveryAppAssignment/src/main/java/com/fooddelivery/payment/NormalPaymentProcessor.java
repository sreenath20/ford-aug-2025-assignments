package com.fooddelivery.payment;

import org.springframework.stereotype.Component;

@Component("NormalPayment")
public class NormalPaymentProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Card Payment For Amount "+amount);

    }
}
