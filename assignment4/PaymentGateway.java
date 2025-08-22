package com.assignments.assignment4;

public abstract class PaymentGateway {

    String APIKeys;
    String connectionURL;

    PaymentGateway(String APIKeys, String connectionURL) {
        this.APIKeys = APIKeys;
        this.connectionURL = connectionURL;
    }

    void connect(){
        System.out.println("Connected to <gateway> API...");
    }
    void disconnect(){
        System.out.println("Disconnected from <gateway> API...");
    }
}
