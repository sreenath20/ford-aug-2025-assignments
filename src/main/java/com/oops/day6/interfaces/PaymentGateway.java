package com.oops.day6.interfaces;

public interface PaymentGateway {
    String DEFAULT_CURRENCY = "INR";
    Double TAX_RATE=0.18;

    public abstract String processPayment(double amount) ;

    default double applyTax(double amount) {
        return amount  +(amount*TAX_RATE);
    }
    static boolean validateAmount(double amount) {// Default currency rate
        if (amount > 0.0) {
            return true;
        } else {
            return false;
        }
    }


}
