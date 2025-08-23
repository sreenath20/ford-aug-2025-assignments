package Assignment4.paymentgateway;


public class StripeGateway extends PaymentGateway implements PaymentProcessor, RefundProcessor {

    public StripeGateway(String apiKey, String connectionUrl) {
        super(apiKey, connectionUrl);
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " via Stripe...");
    }

    @Override
    public void processRefund(double amount) {
        System.out.println("Processing refund of $" + amount + " via Stripe...");
    }
}

