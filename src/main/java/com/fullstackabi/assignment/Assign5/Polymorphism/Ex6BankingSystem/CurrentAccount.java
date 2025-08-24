package com.fullstackabi.assignment.Assign5.Polymorphism.Ex6BankingSystem;

public class CurrentAccount extends BankAccount implements SecurityCheck {


    private static final double interestRate = 0.05;

    public void calculateInterest(double amount) {

        System.out.println("Interest calculated for current account is " + amount * interestRate);
    }

    public void showSecurityStatus (){
        System.out.println("Security connection established for current account");
    }
    @Override
    public boolean verifyUser(String userName, String password) {
        return userName.equals("Priya") && password.equals("1234ST");
    }
}

