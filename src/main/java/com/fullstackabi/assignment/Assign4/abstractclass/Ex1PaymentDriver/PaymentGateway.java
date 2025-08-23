package com.fullstackabi.assignment.Assign4.abstractclass.Ex1PaymentDriver;

public abstract class PaymentGateway {

    String apiKey;
    String connectionUrl;

    public PaymentGateway() {
    }

    public PaymentGateway(String apiKey, String connectionUrl) {
        this.apiKey = apiKey;
        this.connectionUrl = connectionUrl;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getConnectionUrl() {
        return connectionUrl;
    }

    public void setConnectionUrl(String connectionUrl) {
        this.connectionUrl = connectionUrl;
    }

    abstract void connect();
    abstract void disconnect();


}
