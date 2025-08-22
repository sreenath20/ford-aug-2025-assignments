package com.assignments.assignment5;

public class SavingsAccount extends BankAccount{

    @Override
    public void calculateInterest(double amount,int interest,int  duration) {
        System.out.println("---->Savings Account ");
        System.out.println("Calculating interest for "+ amount +" : "+(amount*duration*interest/100));
    }
}
