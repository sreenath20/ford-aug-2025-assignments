package com.ford.assignment4;

public class Driver {

        public static void main(String[] args) {
            System.out.println("--- Stripe Gateway Operations ---");

            StripeGateway stripe = new StripeGateway("12345", "https://v1");
            stripe.connect();
            stripe.processPayment(500.00);
            stripe.processRefund(100.00);
            stripe.disconnect();




            System.out.println("\n--- Polymorphic Operations ---");
            PaymentProcessor processor1 = stripe; // StripeGateway is also a PaymentProcessor
            RefundProcessor refundProcessor1 = stripe; // StripeGateway is also a RefundProcessor

            processor1.processPayment(75.50);
            refundProcessor1.processRefund(25.00);


        }


}
