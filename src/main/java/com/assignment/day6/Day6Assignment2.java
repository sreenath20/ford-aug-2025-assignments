package com.assignment.day6;

class Payment{
    public void processPayment(Double amount) {
        System.out.println("Processing payment of: " + amount);
    }
}

class CreditCardPayment extends Payment {
    @Override
    public void processPayment(Double amount) {
        System.out.println("Processing credit card payment of: " + amount);
    }
}

public class Day6Assignment2 {
    public static void main(String[] args) {

        CreditCardPayment creditCardPayment=new CreditCardPayment();
        creditCardPayment.processPayment(100.0);
        Payment payment = new Payment();
        payment.processPayment(200.0);
        Payment payment1 = new CreditCardPayment();
        payment1.processPayment(300.0);

    }
}
