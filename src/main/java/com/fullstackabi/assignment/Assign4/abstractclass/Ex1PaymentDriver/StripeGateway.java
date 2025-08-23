package com.fullstackabi.assignment.Assign4.abstractclass.Ex1PaymentDriver;

public class StripeGateway extends PaymentGateway implements PaymentProcessor, RefundProcessor {



    @Override
    void connect() {
        System.out.println("Connected to Stripe API");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Payment of $" + amount + " from Stripe API");
    }

    @Override
    public void processRefund(double amount) {
        System.out.println("Processing Refund of $" + amount + " from Stripe API");
    }

    @Override
    void disconnect() {
        System.out.println("Disconnected from Stripe API");
    }
}
