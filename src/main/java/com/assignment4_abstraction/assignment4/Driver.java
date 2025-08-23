package com.assignment4_abstraction.assignment4;

public class Driver {
    public static void main(String[] args) {

        HomeLoan homeLoan = new HomeLoan();
        CarLoan carLoan = new CarLoan();


        homeLoan.calculateEMI(50000, 7.5, 12);
        homeLoan.approvalLoan();


        carLoan.calculateEMI(20000, 8.5, 12);
        carLoan.approvalLoan();
    }

}
