package com.fooddelivery.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("upi")
@Component
public class UPIPaymentProcessor implements PaymentProcessor {

    public UPIPaymentProcessor(){
        System.out.println("UPIPaymentProcessor bean is created");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("UPI Payment of amount "+amount+" is processed");
    }
}
