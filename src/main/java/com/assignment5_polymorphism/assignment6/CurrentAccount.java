package com.assignment5_polymorphism.assignment6;

public class CurrentAccount extends TransactionProcessor implements SecurityCheck{
    public void calculateInterest() {
        System.out.println("Calculating interest for a current account.");

    }
    public void showSecurityStatus() {
        System.out.println("Secure connection established for current  Account.");
    }
    public void verifyUser(String user, String password) {
        System.out.println("Verifying user " + user + " for current  Account.");
    }
}
