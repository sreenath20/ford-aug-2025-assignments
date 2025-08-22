package com.fullstackab.OOPS.Day6;

public interface PaymentGateway {
    // public static final by default
    public static final String DEFAULT_CURRENCY = "INR";
    double TAX_RATE = 0.18;

    abstract void processPayments(double amount);

    // default methods

    default double applyTax(double amount){
        return amount + (amount*TAX_RATE);
    }

    // static method - utility methods
    static boolean validateAmount(double amount){
        if(amount > 0){
            System.out.println("Amount is valid");
            return true;
        }
        return false;
    }
}
