package com.assignment6_part1.assignment4;

public class BankAccount {
    public static double interestRate;
    private String AccountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance,double rate) {
        this.AccountNumber = accountNumber;
        this.balance = initialBalance;
        this.interestRate = rate;
    }
    public static void UpdateInterestRate(double newRate) {
        interestRate = newRate;
        System.out.println("Interest is updated ");
    }
    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public String display() {
        return "BankAccount{" +
                "AccountNumber='" + AccountNumber + '\'' +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                '}';
    }
}
