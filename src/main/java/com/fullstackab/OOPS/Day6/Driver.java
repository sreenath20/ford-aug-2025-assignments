package com.fullstackab.OOPS.Day6;

public class Driver {
    public static void main(String[] args) {
        // Static Binding
        DiscountCalculator discountCalculator = new DiscountCalculator();
        System.out.println(discountCalculator.calculateDiscount(100.00));
        System.out.println(discountCalculator.calculateDiscount(100.00,10));
        System.out.println(discountCalculator.calculateDiscount(100.00,10.00,true));

        //Dynamic Binding
        Payment payment = new Payment();
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        UPIPayment upiPayment = new UPIPayment();

        payment.processPayment(200.00);
        //creating object reference for parent and then assigning child object to parent object.
        Payment paymentRef;
        paymentRef = creditCardPayment;
        paymentRef.processPayment(100.00);

        paymentRef = upiPayment;
        paymentRef.processPayment(200.00);

        // interface exercises - static, utility method and default function
        // calling directly through the interface name without creating object for validate amount method(utility method)
        PaymentGateway.validateAmount(100.00);
        PayPalGateway payPalGateway = new PayPalGateway();
        StripeGateway stripeGateway = new StripeGateway();

        payPalGateway.processPayments(200.00);
        stripeGateway.processPayments(200.00);

        payPalGateway.applyTax(200.00); //customise the default method in a class
        stripeGateway.applyTax(200.00);

        System.out.println("Default currency is " +PaymentGateway.DEFAULT_CURRENCY);
        System.out.println("Tax Rate is " + PaymentGateway.TAX_RATE);

    }
}
