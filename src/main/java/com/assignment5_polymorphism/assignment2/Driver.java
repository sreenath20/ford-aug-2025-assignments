package com.assignment5_polymorphism.assignment2;

public class Driver {
    public static void main(String[] args) {
        Payment p1=new CreditCardPayment();
        Payment p2=new UPIPayment();
        p1.processPayment(100.0);
        p2.processPayment(200.0);
    }
}
