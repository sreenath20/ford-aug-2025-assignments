package com.assignment4_abstraction.assignment1;

public abstract class PaymentGateway {
    private String API;

    public abstract String  connect( String API);

    public abstract String disconnect();

}
