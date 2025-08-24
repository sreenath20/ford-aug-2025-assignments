package com.harini.assignment3.Question2;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(123456789,"Harini");
        System.out.println("--------------Savings Account Details--------------");
        savings.withdraw(5000);
        savings.deposit(2000);
        savings.calculateDailyInterest();
        CurrentSavings current = new CurrentSavings(132456758,"Meena");
        System.out.println("--------------Current Account Details--------------");
        current.withdraw(5030.65);
        current.deposit(2000);
        System.out.println(current.getBalance());
        current.calculateDailyOverDraftInterest();

    }
}
