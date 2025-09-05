package com.food_delivery.payment;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("upiPayment")
@Scope("prototype")
public class UPIPaymentProcessor implements PaymentProcessor {

    @Override
    public void processPayment(Double amount) {
        System.out.println("Processing UPI Payment Rs." + amount);
    }
}
