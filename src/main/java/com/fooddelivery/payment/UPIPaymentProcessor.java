package com.fooddelivery.payment;

import org.springframework.stereotype.Component;

@Component("upiPayment")
public class UPIPaymentProcessor implements PaymentProcessor {

    @Override
    public void processPayment(Double amount) {
        System.out.println("UPI Payment for amount :  "+amount);
    }
}
