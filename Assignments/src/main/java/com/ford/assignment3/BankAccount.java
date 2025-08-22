package com.ford.assignment3;

public class BankAccount {
    protected String accountNumber;
    protected double balance;
    protected String ownerName;

    public BankAccount(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = initialBalance;
        System.out.println("New BankAccount created: " + ownerName + " (" + accountNumber + ") with initial balance $" + String.format("%.2f", initialBalance));
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + String.format("%.2f", amount) + " into " + ownerName + "'s account. New balance: $" + String.format("%.2f", balance));
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrew $" + String.format("%.2f", amount) + " from " + ownerName + "'s account. New balance: $" + String.format("%.2f", balance));
            } else {
                System.out.println("Insufficient funds for withdrawal of $" + String.format("%.2f", amount) + ". Current balance: $" + String.format("%.2f", balance));
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Current Balance: $" + String.format("%.2f", balance));
    }
}
