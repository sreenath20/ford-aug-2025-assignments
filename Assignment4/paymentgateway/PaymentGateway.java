package Assignment4.paymentgateway;


public abstract class PaymentGateway {
    protected String apiKey;
    protected String connectionUrl;

    public PaymentGateway(String apiKey, String connectionUrl) {
        this.apiKey = apiKey;
        this.connectionUrl = connectionUrl;
    }

    public void connect(String gatewayName) {
        System.out.println("Connected to " + gatewayName + " API");
    }

    public void disconnect(String gatewayName) {
        System.out.println("Disconnected from " + gatewayName + " API");
    }
}

