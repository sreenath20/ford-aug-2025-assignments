package com.oops.day6.interfaces;

public class PayPalGateway implements PaymentGateway {
    
    @Override
    public String processPayment(double amount) {
        return "Processing payment via PayPal for amount: " + amount + PaymentGateway.DEFAULT_CURRENCY ;
    }
    public double applyTax(double amount) {
        return amount + (amount * TAX_RATE);
    }



    
}
