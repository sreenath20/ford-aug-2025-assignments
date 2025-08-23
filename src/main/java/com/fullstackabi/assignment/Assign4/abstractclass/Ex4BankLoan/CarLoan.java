package com.fullstackabi.assignment.Assign4.abstractclass.Ex4BankLoan;

public class CarLoan extends Loan implements ApprovalProcess {
    public void approveLoan() {
        System.out.println("Car Loan Approved");
    }

    @Override
    void calculateEMI(double principal, double rate, int tenureMonths) {
        double emi = (principal * tenureMonths) / 100;
        System.out.println("Car Loan EMI Calculated for Rs" +principal+ " is Rs" + emi);
    }
}
