package day4.Assignment1;

public class PayPalGateway extends PaymentGateway implements RefundProcessor,PayementProcessor{
    public PayPalGateway(String apiKey, String connectedUrl) {
        super(apiKey, connectedUrl);
    }

    @Override
    public void processRefund(double amount) {
        System.out.println("Processing Refund of " + amount +  " via PayPal...");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Payment of "+ amount +  " via PayPal....");
    }

    @Override
    public void connect() {
        System.out.println("Connected to PayPal API");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from PayPal API");
    }
}
