package com.harini.assignment3.Question2;

public class BankAccount {
    private long accountNumber;
    private double balance;
    private String ownerName;

    public BankAccount(long accountNumber,String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = 50000;
        this.ownerName = ownerName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public void deposit(double amount){
        if(amount<0){
            System.out.println("Enter a valid amount");
        }
        else {
            balance += amount;
            System.out.println("Amount is deposited");
            System.out.println("The new balance is " + balance);
        }
    }
    public void withdraw(double amount){
        if(amount>balance|| amount<0){
            System.out.println("Insufficient balance");
        }
        else{
            balance-=amount;
            System.out.println("Amount is withdrawn");
            System.out.println("The new balance is " + balance);

        }
    }
}
