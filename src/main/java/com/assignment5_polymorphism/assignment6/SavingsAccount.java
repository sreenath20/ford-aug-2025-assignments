package com.assignment5_polymorphism.assignment6;

public class SavingsAccount extends TransactionProcessor implements SecurityCheck {
    public void calculateInterest() {
        System.out.println("Calculating interest for a savings account.");
    }
    public void showSecurityStatus() {
        System.out.println("Secure connection established for Savings Account.");
    }
    public void verifyUser(String user, String password) {
        System.out.println("Verifying user " + user + " for Savings Account.");
    }


}
