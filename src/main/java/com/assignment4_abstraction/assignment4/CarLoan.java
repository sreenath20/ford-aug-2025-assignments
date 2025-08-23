package com.assignment4_abstraction.assignment4;

public class CarLoan extends Loan  implements ApprovalProcess {
    public void calculateEMI(double principle, double rate, int tenureMonths) {
        double interset= (principle * rate * tenureMonths) / 100;
        double emi = (principle + interset) / tenureMonths;
        System.out.println(" car Loan EMI for INR "+principle +" is " + emi+"/month");
    }
    @Override
    public void approvalLoan() {
        System.out.println("Car loan Approval");
    }
}
