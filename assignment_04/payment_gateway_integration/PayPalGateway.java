package assignment_04.payment_gateway_integration;

class PayPalGateway extends PaymentGateway implements PaymentProcessor, RefundProcessor {

    public PayPalGateway(String apiKey, String connectionURL) {
        super("PayPal", apiKey, connectionURL);
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of Rs." + (int)amount + " via PayPal...");
    }

    @Override
    public void processRefund(double amount) {
        System.out.println("Processing refund of Rs." + (int)amount + " via PayPal...");
    }
}
