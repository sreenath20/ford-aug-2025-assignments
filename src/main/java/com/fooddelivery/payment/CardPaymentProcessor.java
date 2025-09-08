package com.fooddelivery.payment;

import org.springframework.stereotype.Component;

@Component("cardPayment")
public class CardPaymentProcessor implements PaymentProcessor {

    @Override
    public void processPayment(Double amount) {
        System.out.println("CARD Payment for amount :  "+amount);
    }
}
