abstract public class PaymentGateway {
    protected String apiKey;
    protected String connectionUrl;
    protected String gatewayName;
    public PaymentGateway(String apiKey, String connectionUrl, String gatewayName) {
        this.apiKey = apiKey;
        this.connectionUrl = connectionUrl;
        this.gatewayName = gatewayName;
    }
    public void connect()
    {
        System.out.println("Connected to "+gatewayName+" api");
    }
    public void disconnect()
    {
        System.out.println("Disconnected from "+gatewayName+" api");
    }

}
