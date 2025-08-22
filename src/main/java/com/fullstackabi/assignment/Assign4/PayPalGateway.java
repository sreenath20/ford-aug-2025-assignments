package com.fullstackabi.assignment.Assign4;

public class PayPalGateway extends PaymentGateway implements PaymentProcessor , RefundProcessor {


    @Override
    void connect() {
        System.out.println("Connected to PayPal API");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Payment of $" +amount + "from PayPal API");
    }

    @Override
    public void processRefund(double amount) {
        System.out.println("Processing Refund of $" +amount + "from PayPal API");
    }

    @Override
    void disconnect() {
        System.out.println("Disconnected from PayPal API");
    }
}
