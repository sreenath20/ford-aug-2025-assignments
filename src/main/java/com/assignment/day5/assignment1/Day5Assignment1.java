package com.assignment.day5.assignment1;

interface PaymentProcessor {
    void processPayment(double amount);
}

interface RefundProcessor {
    void processRefund(double amount);
}

abstract class PaymentGateway {
    int apikey;
    String connectionUrl;

    public PaymentGateway() {
    }

    public PaymentGateway(int apikey, String connectionUrl) {
        this.apikey = apikey;
        this.connectionUrl = connectionUrl;
    }

    public abstract void connect();
    public abstract void disconnect();
}

class StripeGateway extends PaymentGateway implements PaymentProcessor, RefundProcessor {

    public StripeGateway(int apikey, String connectionUrl) {
        super(apikey, connectionUrl);
    }

    public StripeGateway() {
    }

    @Override
    public void connect() {
        System.out.println("Connecting to Stripe API");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from Stripe API");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of " + amount + " through Stripe.");
    }

    @Override
    public void processRefund(double amount) {
        System.out.println("Processing refund of " + amount + " through Stripe.");
    }
}

class PayPalGateway extends PaymentGateway implements PaymentProcessor, RefundProcessor {

    public PayPalGateway() {
    }

    public PayPalGateway(int apikey, String connectionUrl) {
        super(apikey, connectionUrl);
    }

    @Override
    public void connect() {
        System.out.println("Connecting to PayPal API");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from PayPal API");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of " + amount + " through PayPal.");
    }

    @Override
    public void processRefund(double amount) {
        System.out.println("Processing refund of " + amount + " through PayPal.");
    }
}

public class Day5Assignment1 {

    public static void main(String[] args) {

        StripeGateway stripe = new StripeGateway(12345, "https://api.stripe.com");
        System.out.println("API Key: " + stripe.apikey);
        System.out.println("Connection URL: " + stripe.connectionUrl);
        stripe.connect();
        stripe.processPayment(100.0);
        stripe.processRefund(50.0);
        stripe.disconnect();
        System.out.println();
        PayPalGateway paypal = new PayPalGateway(67890, "https://api.paypal.com");
        System.out.println("API Key: " + paypal.apikey);
        System.out.println("Connection URL: " + paypal.connectionUrl);
        paypal.connect();
        paypal.processPayment(200.0);
        paypal.processRefund(75.0);
        paypal.disconnect();


    }

}
