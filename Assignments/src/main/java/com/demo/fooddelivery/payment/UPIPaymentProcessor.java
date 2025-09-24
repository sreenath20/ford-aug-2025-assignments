package com.demo.fooddelivery.payment;

import org.springframework.stereotype.Component;

@Component("upiPayment")
public class UPIPaymentProcessor implements PaymentService{
    @Override
    public void processPayment(double amount) {

    }
}
