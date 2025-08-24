package day4.paymentGateway;

public class Driver {
    public static void main(String[] args) {
        PaypalGateway pp=new PaypalGateway();
        pp.connect("PayPal");
        pp.processPayment(200.0);
        pp.processRefund(12.00);
        pp.disconnect("PayPal");
    }
}
