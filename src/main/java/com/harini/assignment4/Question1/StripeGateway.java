package com.harini.assignment4.Question1;

public class StripeGateway extends PaymentGateway implements RefundProcessor, PayementProcessor{
    public StripeGateway(String apiKey, String connectedUrl) {
        super(apiKey, connectedUrl);
    }

    @Override
    public void processRefund(double amount) {
        System.out.println("Processing Refund of "+amount+"via Stripe");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Payment of "+amount+"via Stripe");
    }

    @Override
    public void connect() {
        System.out.println("Connected to Stripe API");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from Stripe API");
    }
}
