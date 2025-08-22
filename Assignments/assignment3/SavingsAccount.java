package com.assignments.assignment3;

public class SavingsAccount extends BankingAccount {

    private int intrestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, int intrestRate) {
        super(accountNumber, accountHolder, balance);
        System.out.println("Savings Account");
        this.intrestRate = intrestRate;
    }

    public float getIntrestRate() {
        return intrestRate;
    }
    public void calculateIntrest(){
        double interestAmount =  getBalance()*intrestRate / 100;
        System.out.println("Intrest ("+intrestRate+"%) Amount of available balance Rs. "+getBalance()+ " is Rs." + interestAmount);
    }
}
