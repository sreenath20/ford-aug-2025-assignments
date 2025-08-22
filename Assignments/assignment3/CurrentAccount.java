package com.assignments.assignment3;

public class CurrentAccount extends BankingAccount {

    private double overDraftLimit;
    public CurrentAccount(String accountNumber, String accountHolder, double balance, double overDraftLimit) {
        super(accountNumber, accountHolder, balance);
        System.out.println("Current Account");
        this.overDraftLimit = overDraftLimit;
    }
    @Override
    public void withdraw(double amount) {
        if((getBalance()-amount)<overDraftLimit){
            System.out.println("Don't forget to maintain limit since this transaction makes your balance less than draft limit : Rs. "+overDraftLimit);
        }
        if (amount > 0 && amount <= getBalance()) {
             double bal = getBalance()-amount;
             setBalance(bal);
            System.out.println("Withdraw Successful...\nAvailable balance: " + getBalance());
        } else if (amount > getBalance()) {
            System.out.println("Insufficient balance...");
        } else{
            System.out.println("Withdraw Failed...");
        }
    }
}
