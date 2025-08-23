package com.assignment4_abstraction.assignment1;

public class StripeGateway extends PaymentGateway implements PaymentProcessor, RefundProcessor {
    @Override
    public  String  connect( String url) {
        return "Connected to PayPal at " + url;
    }
    @Override
    public String disconnect() {
        return "Disconnected from PayPal.";
    }
    @Override
    public String processPayment(double amount) {
        return "Payment of " + amount + " processed through PayPal.";
    }

    @Override
    public String processRefund(double amount) {
        return "Refund of " + amount + " processed through PayPal.";
    }
}
