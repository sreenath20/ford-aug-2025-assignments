package day4.Assignment1;

public class Driver {
    public static void main(String[] args) {
        StripeGateway stripe = new StripeGateway("api22","https://stripe.com");
        PayPalGateway paypal = new PayPalGateway("api21","https://paypal.com");

        stripe.connect();
        stripe.processPayment(500);
        stripe.processRefund(100);
        stripe.disconnect();
        System.out.println();
        paypal.connect();
        paypal.processPayment(250.0);
        paypal.processRefund(50);
        paypal.disconnect();
    }
}
