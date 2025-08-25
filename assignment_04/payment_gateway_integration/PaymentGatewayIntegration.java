package assignment_04.payment_gateway_integration;

public class PaymentGatewayIntegration {
    public static void main(String[] args) {
        System.out.println("Payment Gateway\n");
        StripeGateway stripe = new StripeGateway("stripe_api_key_123", "https://api.stripe.com");
        PayPalGateway paypal = new PayPalGateway("paypal_api_key_456", "https://api.paypal.com");

        stripe.connect();
        stripe.processPayment(500);
        stripe.processRefund(100);
        stripe.disconnect();
        System.out.println();
        paypal.connect();
        paypal.processPayment(250);
        paypal.processRefund(50);
        paypal.disconnect();
   }
}
