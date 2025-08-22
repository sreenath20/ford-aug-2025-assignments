package com.assignments.assignment4;

public class CarLoan extends Loan implements ApprovalProcess{

    public CarLoan() {
        System.out.print("Car Loan ");
    }

    @Override
    public void approveLoan() {
        System.out.println("Car loan approved");
    }
}
