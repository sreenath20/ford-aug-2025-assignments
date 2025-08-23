package com.assignment4_abstraction.assignment1;

public class Driver {
    public static void main(String[] args) {
      PayPalgateway paypal = new PayPalgateway();
        System.out.println(paypal.connect("https://www.paypal.com"));
        System.out.println(paypal.processPayment(100.0));
        System.out.println(paypal.processRefund(50.0));
        System.out.println(paypal.disconnect());

        StripeGateway stripe = new StripeGateway();
        System.out.println(stripe.connect("https://www.stripe.com"));
        System.out.println(stripe.processPayment(200.0));
        System.out.println(stripe.processRefund(75.0));
        System.out.println(stripe.disconnect());
        System.out.println("Payment processing completed successfully.");
    }
}
