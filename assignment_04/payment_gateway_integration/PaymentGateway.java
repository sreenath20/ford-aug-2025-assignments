package assignment_04.payment_gateway_integration;

abstract class PaymentGateway {
    protected String gatewayName;
    protected String apiKey;
    protected String connectionURL;

    public PaymentGateway(String gatewayName, String apiKey, String connectionURL) {
        this.gatewayName = gatewayName;
        this.apiKey = apiKey;
        this.connectionURL = connectionURL;
    }

    public String getGatewayName() {
        return gatewayName;
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getConnectionURL() {
        return connectionURL;
    }

    public void setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public void setConnectionURL(String connectionURL) {
        this.connectionURL = connectionURL;
    }

    public void connect() {
        System.out.println("Connected to " + gatewayName + " API");
    }

    public void disconnect() {
        System.out.println("Disconnected from " + gatewayName + " API");
    }
}