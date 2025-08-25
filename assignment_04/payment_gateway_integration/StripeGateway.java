package assignment_04.payment_gateway_integration;


class StripeGateway extends PaymentGateway implements PaymentProcessor, RefundProcessor {

    public StripeGateway(String apiKey, String connectionURL) {
        super("Stripe", apiKey, connectionURL);
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of Rs." + (int)amount + " via Stripe...");
    }

    @Override
    public void processRefund(double amount) {
        System.out.println("Processing refund of Rs." + (int)amount + " via Stripe...");
    }
}