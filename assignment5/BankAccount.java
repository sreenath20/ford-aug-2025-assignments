package com.assignments.assignment5;

public class BankAccount {
    public  void calculateInterest(double amount,int interest,int  duration){
        System.out.println("Calculating interest for "+ amount +" : "+(amount*duration*interest/100));
    }
}
