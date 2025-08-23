

abstract class PaymentGateway {
    protected String gatewayName;
    protected String apiKey;
    protected String connectionUrl;

    protected PaymentGateway(String gatewayName, String apiKey, String connectionUrl) {
        this.gatewayName = gatewayName;
        this.apiKey = apiKey;
        this.connectionUrl = connectionUrl;
    }

    public void connect() {
        System.out.println("Connected to " + gatewayName + " API");
    }

    public void disconnect() {
        System.out.println("Disconnected from " + gatewayName + " API");
    }
}

interface PaymentProcessor {
    void processPayment(double amount);
}

interface RefundProcessor {
    void processRefund(double amount);
}

class StripeGateway extends PaymentGateway implements PaymentProcessor, RefundProcessor {
    public StripeGateway(String apiKey, String connectionUrl) {
        super("Stripe", apiKey, connectionUrl);
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + (int)amount + " via Stripe...");
    }

    @Override
    public void processRefund(double amount) {
        System.out.println("Processing refund of $" + (int)amount + " via Stripe...");
    }
}

class PayPalGateway extends PaymentGateway implements PaymentProcessor, RefundProcessor {
    public PayPalGateway(String apiKey, String connectionUrl) {
        super("PayPal", apiKey, connectionUrl);
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + (int)amount + " via PayPal...");
    }

    @Override
    public void processRefund(double amount) {
        System.out.println("Processing refund of $" + (int)amount + " via PayPal...");
    }
}

public class PaymentGatewayIntegration {
    public static void main(String[] args) {
        StripeGateway stripe = new StripeGateway("sk_test_stripe", "https://api.stripe.com");
        stripe.connect();
        stripe.processPayment(500);
        stripe.processRefund(100);
        stripe.disconnect();

        PayPalGateway paypal = new PayPalGateway("api_key_paypal", "https://api.paypal.com");
        paypal.connect();
        paypal.processPayment(250);
        paypal.processRefund(50);
        paypal.disconnect();
    }
}
