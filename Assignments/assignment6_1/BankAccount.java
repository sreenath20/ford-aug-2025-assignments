package com.assignments.assignment6_1;

public class BankAccount {
    static Integer interestRate = 5;
    static void updateInterestRate(Integer interestRate){
        BankAccount.interestRate = interestRate;
        System.out.println("\n\nInterest rate updated : "+interestRate);
    }

    Integer accountNumber;
    Double balance;

    public BankAccount(Integer accountNumber, Double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayDetails(){
        System.out.println("Account Number : "+accountNumber);
        System.out.println(" Balance : "+balance);
        System.out.println(" Interest("+interestRate+"%) amount : "+(double)(balance*interestRate/100));
    }
}
