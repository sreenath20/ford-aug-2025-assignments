package com.assignment.day5.assignment4;

abstract class Loan{
    abstract void calculateEMI(double principal, double rate, int tenureMonths);
}

interface ApprovalProcess {
    void approveLoan();
}

class HomeLoan extends Loan implements ApprovalProcess {
    @Override
    void calculateEMI(double principal, double rate, int tenureMonths) {
        double monthlyRate = rate / 12 / 100;
        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, tenureMonths)) /
                     (Math.pow(1 + monthlyRate, tenureMonths) - 1);
        System.out.println("Home com.assignment.day5.assignment4.Loan EMI: " + emi);
    }

    @Override
    public void approveLoan() {
        System.out.println("Home com.assignment.day5.assignment4.Loan Approved");
    }
}

class CarLoan extends Loan implements ApprovalProcess {
    @Override
    void calculateEMI(double principal, double rate, int tenureMonths) {
        double monthlyRate = rate / 12 / 100;
        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, tenureMonths)) /
                     (Math.pow(1 + monthlyRate, tenureMonths) - 1);
        System.out.println("com.assignment.day5.assignment2.Car com.assignment.day5.assignment4.Loan EMI: " + emi);
    }

    @Override
    public void approveLoan() {
        System.out.println("com.assignment.day5.assignment2.Car com.assignment.day5.assignment4.Loan Approved");
    }
}

public class Day5Assignment4 {
    public static void main(String[] args) {
        HomeLoan homeLoan = new HomeLoan();
        homeLoan.calculateEMI(500000, 7.5, 240); // Example values
        homeLoan.approveLoan();
        CarLoan carLoan = new CarLoan();
        carLoan.calculateEMI(300000, 8.5, 60); //
        carLoan.approveLoan();
    }
}
