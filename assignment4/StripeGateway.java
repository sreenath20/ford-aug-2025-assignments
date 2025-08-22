package com.assignments.assignment4;

public class StripeGateway extends PaymentGateway implements PaymentProcessor, RefundProcessor{
    public StripeGateway(String APIKeys, String connectionURL) {
        super(APIKeys, connectionURL);
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of \u20b9"+amount+" via Stripe.");
    }

    @Override
    public void processRefund(double amount) {
        System.out.println("Processing refund of \u20b9"+amount+" via Stripe.");
    }

    @Override
    public void connect() {
        System.out.println("Connecting to Stripe API...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from Stripe API...");
    }
}
