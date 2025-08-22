package com.fullstackabi.assignment.Assign4;

public class PaymentDriver {
    public static void main(String[] args) {
            StripeGateway stripeGateway;
            stripeGateway = new StripeGateway();
            stripeGateway.connect();
            stripeGateway.processPayment(1000.00);
            stripeGateway.processRefund(500.00);
            stripeGateway.disconnect();




    }
}
