package com.ford.assignment4;

public class StripeGateway extends PaymentGateway implements PaymentProcessor, RefundProcessor {

    public StripeGateway(String apiKey, String connectionUrl) {
        super(apiKey, connectionUrl);
    }

    @Override
    public String getGatewayName() {
        return "Stripe";
    }

    @Override
    public void processPayment(double amount) {
        // In a real scenario, this would interact with Stripe's actual payment API.
        System.out.println("Processing payment of $" + String.format("%.2f", amount) + " via " + getGatewayName() + "...");
    }

    @Override
    public void processRefund(double amount) {
        // In a real scenario, this would interact with Stripe's actual refund API.
        System.out.println("Processing refund of $" + String.format("%.2f", amount) + " via " + getGatewayName() + "...");
    }
}
