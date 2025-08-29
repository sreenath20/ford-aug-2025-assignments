public class StripGateway extends PaymentGateway implements PaymentProcessor,RefundProcessor{
    public StripGateway(String apiKey, String connectionUrl) {
        super(apiKey, connectionUrl," strip");
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
