package com.harini.assignment3.Question2;

import java.util.Date;

public class SavingsAccount extends BankAccount {
    double interestRate ;
    double dailyinterest ;
    //double interestAccured;
    double balance = getBalance();
    //Date interestCreditDay = 12_10_2025;
    //String interestCreditDay = "12-10-2025";
    public SavingsAccount(long accountNumber,String ownerName) {
        super(accountNumber,ownerName);
        this.interestRate = 0.04;
    }
    public void deposit(double amount){
        super.deposit(amount);

    }
    public void withdraw(double amount){
        super.withdraw(amount);
    }
    public void calculateDailyInterest(){
        dailyinterest= (balance *interestRate)/365;
        System.out.println("The daily interest is "+dailyinterest);
    }

}
