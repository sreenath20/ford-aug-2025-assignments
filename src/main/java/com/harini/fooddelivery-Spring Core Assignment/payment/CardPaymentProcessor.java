package com.fooddelivery.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("card")
@Component
public class CardPaymentProcessor implements PaymentProcessor {

    public CardPaymentProcessor(){
        System.out.println("CardPaymentProcessor bean is created");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Card Payment of amount "+amount+" is processed");
    }
}
