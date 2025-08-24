package com.harini.assignment3.Question2;

public class CurrentSavings extends BankAccount{
    double overdraftLimit;
    double balance = getBalance();
    double availableBalance = balance + overdraftLimit;

    public CurrentSavings(long accountNumber, String ownerName) {
        super(accountNumber, ownerName);
        this.overdraftLimit = 50000.0;
    }
    public void deposit(double amount){
        super.deposit(amount);
    }
    public void withdraw(double amount){
        if(amount<=availableBalance){
            balance -= amount;
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    public void calculateDailyOverDraftInterest(){
        double overUsed =0;
        if(balance<0){
            overUsed = Math.abs(balance);

        }
        System.out.println("The daily over draft interest is "+overUsed);
    }
}
