package com.assignment5_polymorphism.assignment6;

public class TransactionProcessor {
    public void process(int accountNumber, double amount) {
        System.out.println("Processing transaction for account number: " + accountNumber + " with amount: " + amount);
    }

    public void process(int fromAccount, int toAccount, double amount) {
        System.out.println("Processing transfer from account number: " + fromAccount + " to account number: " + toAccount + " with amount: " + amount);
    }
}