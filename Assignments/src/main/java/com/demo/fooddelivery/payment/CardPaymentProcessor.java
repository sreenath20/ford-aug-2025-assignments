package com.demo.fooddelivery.payment;

import org.springframework.stereotype.Component;

@Component("cardPayment")
public class CardPaymentProcessor implements PaymentService{
    @Override
    public void processPayment(double amount) {
        // logic card payment
        System.out.println("Processing Card payment for amount :"+ amount);
    }
}
