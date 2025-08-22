package com.fullstackab.OOPS.Day6;

public class StripeGateway implements PaymentGateway {

    public void processPayments(double amount){
        System.out.println("Processing payment via Stripe Gateway of Rs " + amount +   DEFAULT_CURRENCY);
    }
}
