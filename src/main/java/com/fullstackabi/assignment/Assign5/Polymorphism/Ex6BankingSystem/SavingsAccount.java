package com.fullstackabi.assignment.Assign5.Polymorphism.Ex6BankingSystem;

public class SavingsAccount extends BankAccount implements SecurityCheck {

    private static final double interestRate = 0.01;

    public void calculateInterest(double amount) {

        System.out.println("Interest calculated for savings account is " + amount * interestRate);
    }

    public void showSecurityStatus (){
        System.out.println("Security connection established for savings account");
    }

    public boolean verifyUser(String userName, String password) {
        return userName.equals("Priya") && password.equals("1234ST");
    }
}

