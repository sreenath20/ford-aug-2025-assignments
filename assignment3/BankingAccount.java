package com.assignments.assignment3;

public class BankingAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance ;

    public BankingAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
        System.out.println("Deposit Successful...\nAvailable balance : " + balance);
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw Successful...\nAvailable balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance...");
        } else{
            System.out.println("Withdraw Failed...");
        }
    }

}
