package com.fullstackabi.assignment.Assign6.Exceptionhandlingaccessmodifier.Part1accessmodifier.staticmemscenario2;

public class BankAccount {
   private static double interestRate = 0.03;
    private int accountNumber;
   private Double balance;


    static void updateInterestRate(double newInterestRate) {
        interestRate = newInterestRate;
        System.out.println("Interest rate is now " + interestRate);

    }

    public BankAccount(int accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayDetails(){
        System.out.println("Account Number is " + accountNumber);
        System.out.println("Balance is " + balance);
        System.out.println("Interest rate is now " + interestRate * 100 + "%");
    }
}
