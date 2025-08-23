package com.fullstackabi.assignment.Assign4.abstractclass.Ex4BankLoan;

import jdk.nio.mapmode.ExtendedMapMode;

public class HomeLoan extends Loan implements ApprovalProcess {


    @Override
    public void approveLoan() {
        System.out.println("Home Loan Approved");
    }

    @Override
    void calculateEMI(double principal, double rate, int tenureMonths) {
        double emi = (principal * tenureMonths) / 100;
        System.out.println("Home Loan EMI Calculated for Rs" + principal + " is Rs" + emi);
    }
}
