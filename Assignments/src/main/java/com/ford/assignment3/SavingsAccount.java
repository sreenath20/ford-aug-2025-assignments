package com.ford.assignment3;

public class SavingsAccount extends BankAccount {
    private double interestRate; // Annual interest rate in percentage

    public SavingsAccount(String accountNumber, String ownerName, double initialBalance, double interestRate) {
        super(accountNumber, ownerName, initialBalance);
        this.interestRate = interestRate;
        System.out.println("SavingsAccount created with interest rate: " + interestRate + "%");
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void calculateInterest() {
        double interest = balance * (interestRate / 100.0);
        balance += interest; // Directly modify balance as it's protected in BankAccount
        System.out.println("Interest of $" + String.format("%.2f", interest) + " applied. New balance: $" + String.format("%.2f", balance));
    }

    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
