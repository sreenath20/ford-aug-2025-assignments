package com.harini.assignment4.Question4;

public class Main {
    public static void main(String[] args) {
        HomeLoan homeLoan = new HomeLoan();
        homeLoan.calculateEMI(5000000.0,0.05,480);
        homeLoan.approveLoan();
        CarLoan carLoan = new CarLoan();
        carLoan.calculateEMI(2000000,0.02,120);
        carLoan.approveLoan();
    }
}
