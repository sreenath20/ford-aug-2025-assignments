public class PayPalGateway extends PaymentGateway implements PaymentProcessor,RefundProcessor{

    public PayPalGateway(String apiKey, String connectionUrl) {
        super(apiKey, connectionUrl,"PayPalGateway");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " via PayPal...");
    }

    @Override
    public void processRefund(double amount) {
        System.out.println("Processing refund of $" + amount + " via PayPal...");
    }
}
