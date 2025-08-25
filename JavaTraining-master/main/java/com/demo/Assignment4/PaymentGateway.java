package com.demo.Assignment4;

public abstract class PaymentGateway {
    void connect(){
        System.out.println("Connected to gateway API");
    }
    void disconnect(){
        System.out.println("Disconnected from gateway API");
    }
    String API;
    String URL;
}
interface PaymentProcessor{
    double processPayment(double amount);

}
interface RefunProcessor{
    double processRefund(double amount);
}
class StripePaymentProcessor extends PaymentGateway implements PaymentProcessor,RefunProcessor {

    @Override
    public double processPayment(double amount) {
        return amount*0.1;
    }

    @Override
    public double processRefund(double amount) {
        return amount;
    }
}

class PayPalPaymentProcessor extends PaymentGateway implements PaymentProcessor,RefunProcessor {
    @Override
    public double processPayment(double amount) {
        return amount*0.1;
    }
    @Override
    public double processRefund(double amount) {
        return amount;
    }
}
class main{
    public static void main(String[] args){
        StripePaymentProcessor stripePaymentProcessor = new StripePaymentProcessor();
        stripePaymentProcessor.connect();
        System.out.println(stripePaymentProcessor.processPayment(10000));
        System.out.println(stripePaymentProcessor.processRefund(100));
        stripePaymentProcessor.disconnect();

        PayPalPaymentProcessor payPalPaymentProcessor = new PayPalPaymentProcessor();
        payPalPaymentProcessor.connect();
        System.out.println(payPalPaymentProcessor.processPayment(10000));
        System.out.println(payPalPaymentProcessor.processRefund(100));
        payPalPaymentProcessor.disconnect();



    }

}


