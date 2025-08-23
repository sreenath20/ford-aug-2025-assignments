package com.assignment3_encapsulation.assignment2;

public class SavingsAccount extends BankAccount {
    private double interestRate;
    public SavingsAccount(int accountNumber, Double balance, String accountHolderName, double interestRate) {
        super(accountNumber, balance, accountHolderName);
        this.interestRate = interestRate;

    }
    public double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public void calculateInterest() {
        double interest = getBalance() * (interestRate / 100);
        System.out.println("Interest earned: " + interest);
        setBalance(getBalance() + interest);
        System.out.println("New Balance after interest: " + getBalance());
    }


    public String toString() {
        return "SavingsAccount{" +
                "Account Number=" + getAccountNumber() +
                ", Balance=" + getBalance() +
                ", Account Holder Name='" + getAccountHolderName() + '\'' +
                ", Interest Rate=" + getInterestRate() +
                '}';

    }
}
