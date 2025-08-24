package com.harini.assignment5.Question6;

public class TransactionProcessor {
    public void process(int accountNumber,double amount){
        System.out.println("Transaction of amount "+amount+" for account number "+accountNumber+" is being processed");
    }
    public void process(int fromAccount, int toAccount, double amount){
        System.out.println("Transaction of amount "+amount+" from the account "+fromAccount+" to account "+toAccount+" is being processed");
    }
}
