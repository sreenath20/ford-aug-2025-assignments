package com.assignment4_abstraction.assignment4;

public class HomeLoan extends Loan implements ApprovalProcess {
    @Override
    public void calculateEMI(double principle, double rate, int tenureMonths) {
        double interset= (principle * rate * tenureMonths) / 100;
        double emi = (principle + interset) / tenureMonths;
        System.out.println(" Home Loan EMI for INR "+principle +" is " + emi +"/month");
    }
    @Override
    public void approvalLoan() {
        System.out.println("Home loan Approval");
    }
}
