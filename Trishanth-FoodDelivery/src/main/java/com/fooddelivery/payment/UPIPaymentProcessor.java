package com.fooddelivery.payment;

import org.springframework.stereotype.Component;

@Component("UPIPayment")
public class UPIPaymentProcessor implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI Payment Rs." + amount);
    }
}
