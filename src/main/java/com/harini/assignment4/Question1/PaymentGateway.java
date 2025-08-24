package com.harini.assignment4.Question1;

public abstract class PaymentGateway {
    private String apiKey;
    private String connectedUrl;

    public PaymentGateway(String apiKey, String connectedUrl) {
        this.apiKey = apiKey;
        this.connectedUrl = connectedUrl;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getConnectedUrl() {
        return connectedUrl;
    }

    public void setConnectedUrl(String connectedUrl) {
        this.connectedUrl = connectedUrl;
    }
    public abstract void connect();
    public abstract void disconnect();
}
