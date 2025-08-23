package Assignment4.paymentgateway;

public class Driver {
    public static void main(String[] args) {
        // Stripe
        StripeGateway stripe = new StripeGateway("stripe-key-123", "https://api.stripe.com");
        stripe.connect("Stripe");
        stripe.processPayment(500.0);
        stripe.processRefund(100.0);
        stripe.disconnect("Stripe");

        System.out.println();

        // PayPal
        PayPalGateway paypal = new PayPalGateway("paypal-key-456", "https://api.paypal.com");
        paypal.connect("PayPal");
        paypal.processPayment(250.0);
        paypal.processRefund(50.0);
        paypal.disconnect("PayPal");
    }
}

