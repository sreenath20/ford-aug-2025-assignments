package com.fullstackabi.assignment.Assign4.abstractclass.Ex4BankLoan;

public class BankLoanProcessDriver {

    public static void main(String[] args) {

        HomeLoan homeLoan = new HomeLoan();
        CarLoan carLoan = new CarLoan();
        homeLoan.calculateEMI(10000,10.00,60);
        homeLoan.approveLoan();

        carLoan.calculateEMI(10000,15.00,60);
        carLoan.approveLoan();


    }
}
