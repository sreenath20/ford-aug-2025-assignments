package com.oops.day6.interfaces;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
       /*System.out.println(A.name);
         System.out.println(A.data);
         A.info();
         C c=new C();
         c.function();

        */
        Scanner input = new Scanner(System.in);
        PayPalGateway paypal = new PayPalGateway();
        StripeGateway stripe = new StripeGateway();
        System.out.println("enter the amount:");
        double amount = input.nextDouble();
        boolean isvalid =(PaymentGateway.validateAmount(amount));
        System.out.println("Amount is valid: " + isvalid);
        double taxamount= paypal.applyTax(amount);
        System.out.println(paypal.processPayment(taxamount));
        System.out.println(stripe.processPayment(taxamount));
        System.out.println("Default curreency : "+ PaymentGateway.DEFAULT_CURRENCY);
        System.out.println("Amount after tax: " + PaymentGateway.TAX_RATE);




    }
}
