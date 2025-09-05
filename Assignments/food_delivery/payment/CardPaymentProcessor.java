package com.food_delivery.payment;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("cardPayment")
@Scope("prototype")
public class CardPaymentProcessor implements PaymentProcessor {

    @Override
    public void processPayment(Double amount) {
        System.out.println("Processing Card Payment  Rs." + amount);
    }
}
