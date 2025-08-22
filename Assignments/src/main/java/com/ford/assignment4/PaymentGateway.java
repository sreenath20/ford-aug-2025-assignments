package com.ford.assignment4;

public abstract class PaymentGateway {
    protected String apiKey;
    protected String connectionUrl;

    public PaymentGateway(String apiKey, String connectionUrl) {
        this.apiKey = apiKey;
        this.connectionUrl = connectionUrl;
    }


    public abstract String getGatewayName();


    public void connect() {
        System.out.println("Connected to " + getGatewayName() + " API");
        // In a real application, this would involve API calls, authentication, etc.
    }


    public void disconnect() {
        System.out.println("Disconnected from " + getGatewayName() + " API");
        // In a real application, this would involve closing connections, cleaning up resources.
    }
}
