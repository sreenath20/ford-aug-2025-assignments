package com.assignments.assignment4;

public class PayPalGateway extends PaymentGateway implements PaymentProcessor,RefundProcessor{

    public PayPalGateway(String APIKeys, String connectionURL) {
        super(APIKeys, connectionURL);
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of \u20b9"+amount+" via PayPal.");
    }

    @Override
    public void processRefund(double amount) {
        System.out.println("Processing refund of \u20b9"+amount+" via PayPal.");
    }

    @Override
    public void connect(){
        System.out.println("Connected to PayPay API...");
    }

    @Override
    public void disconnect(){
        System.out.println("Disconnected from PayPay API...");
    }
}
