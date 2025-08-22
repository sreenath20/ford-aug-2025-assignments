package com.ford.assignment5;

class Payment {
    public void processPayment(double amount) {
        System.out.println("Processing generic payment of $" + amount);
    }
}

class CreditCardPayment extends Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

class UPIPayment extends Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of $" + amount);
    }
}

class PaymentGateway {
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment();
        Payment payment2 = new UPIPayment();

        payment1.processPayment(1000);
        payment2.processPayment(500);
    }
}
