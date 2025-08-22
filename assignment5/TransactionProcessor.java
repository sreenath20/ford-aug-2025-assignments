package com.assignments.assignment5;

public class TransactionProcessor {
    public void process(int accountNumber,double amount){
        System.out.println("Processing account "+accountNumber+" with amount "+amount);
    }
    public void process(int fromAccount,int toAccount,double amount){
        System.out.println("Transferring amount from "+fromAccount+" to "+toAccount+" with amount "+amount);
    }
}
