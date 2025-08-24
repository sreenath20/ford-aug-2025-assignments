package com.fullstackabi.assignment.Assign5.Polymorphism.Ex6BankingSystem;

public class TransactionProcessor {

    String accountName ;
    String password;
    int accountNumber;
    double amount;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    void process(int accountNumber, double amount) {
        System.out.println("Process call with 2 parameters - MEthod overloading");
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Name: " + this.accountName);
        System.out.println("Account Password: " + this.password);
        System.out.println("Amount:" + amount);
    }

    void process(int fromAccount, int toAccount, double amount) {
        System.out.println("Process call with 3 parameters - MEthod overloading");
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Name: " + this.accountName);
        System.out.println("Account Password: " + password);
        System.out.println("Amount:" + amount);
        System.out.println("From Account: " + fromAccount);
        System.out.println("To Account: " + toAccount);
    }

    public TransactionProcessor(String accountName, String password, int accountNumber, double amount) {
        this.accountName = accountName;
        this.password = password;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }
}

