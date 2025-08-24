package day4.paymentGateway;

public class PaypalGateway extends PaymentGateway implements PaymentProcessor, RefundProcessor {
    @Override
    public void processPayment(double amount){
        System.out.println("Processing payment of $"+amount+" via PayPal...");

    }
    @Override
    public void processRefund(double amount){
        System.out.println("Processing refund of $"+amount+" via PayPal...");
    }
}
