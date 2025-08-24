package day4.paymentGateway;

public class StripGateway {

    public void processPayment(double amount){
        System.out.println("Processing payment of $"+amount+" via Strip...");

    }

    public void processRefund(double amount){
        System.out.println("Processing refund of $"+amount+" via PayPal...");
    }
}
