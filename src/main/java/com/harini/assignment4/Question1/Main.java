package com.harini.assignment4.Question1;

public class Main {
    public static void main(String[] args) {
        PayPalGateway paypal = new PayPalGateway("api21","https://paypal.com");
        StripeGateway stripe = new StripeGateway("api22","https://stripe.com");
        paypal.connect();
        paypal.processPayment(2000.0);
        paypal.processRefund(100);
        paypal.disconnect();
        stripe.connect();
        stripe.processPayment(30078.98);
        stripe.processRefund(2089.76);
        stripe.disconnect();
    }
}
