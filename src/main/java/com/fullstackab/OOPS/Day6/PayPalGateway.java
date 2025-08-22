package com.fullstackab.OOPS.Day6;

public class PayPalGateway implements PaymentGateway{

    public void processPayments(double amount){
        System.out.println("Processing payment via PayPal Gateway of Rs " + amount +  DEFAULT_CURRENCY);

    }

    @Override
    public double applyTax(double amount){
        double CUSTOM_TAX_RATE = 0.20;
        System.out.println("Custom Tax Rate is " + CUSTOM_TAX_RATE);
        return amount + (amount*CUSTOM_TAX_RATE);

    }
}
