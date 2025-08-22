package com.assignments.assignment4;

public class HomeLoan extends Loan implements ApprovalProcess{

    public HomeLoan() {
        System.out.print("Home Loan ");
    }
    @Override
    public void approveLoan() {
        System.out.println("Home loan approved");
    }
}
