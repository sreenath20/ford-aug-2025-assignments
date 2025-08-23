package com.oops.day6.interfaces;

public class StripeGateway implements PaymentGateway {
    public String processPayment(double amount) {
        return "Processing payment via stripe for amount: " + amount + PaymentGateway.DEFAULT_CURRENCY ;
    }
    public double applyTax(double amount) {
        return amount + (amount * TAX_RATE);
    }
}
