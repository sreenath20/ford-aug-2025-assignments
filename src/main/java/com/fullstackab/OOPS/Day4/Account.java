package com.fullstackab.OOPS.Day4;

public class Account {
    private int accId;
    private String name;
    private double balance;

    public Account() {
    }
    public Account(int accId, String name, double balance) {
        this.accId = accId;
        this.name = name;
        this.balance = balance;
    }

    public int getAccId() {
        return accId;
    }

    public void setAccId(int accId) {
        this.accId = accId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double addFunds(double amount){
        if(amount > 0) {
            this.balance += amount;
        } else{
            System.out.println("Enter the amount higher than zero");
        }
        return this.balance;
    }

    public double withDrawFunds(double amount){
        if(amount > this.balance) {
            System.out.println("Balance is insufficient to withdraw");
            }
        else{
            this.balance -= amount;
        }
        return this.balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account ID: " + accId);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);

    }
}



