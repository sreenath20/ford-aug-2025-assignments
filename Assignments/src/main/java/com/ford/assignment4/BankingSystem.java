package com.ford.assignment4;

// Abstract class Loan
abstract class Loan {
    // EMI calculation using simple formula
    public void calculateEMI(double principal, double rate, int tenureMonths) {
        double monthlyRate = rate / (12 * 100);
        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, tenureMonths)) /
                (Math.pow(1 + monthlyRate, tenureMonths) - 1);
        System.out.println( getClass().getSimpleName()+" "+ principal+" "+ emi);
    }
}

// Interface for loan approval
interface ApprovalProcess {
    void approveLoan();
}

// HomeLoan class
class HomeLoan extends Loan implements ApprovalProcess {
    @Override
    public void approveLoan() {
        System.out.println("Home Loan Approved");
    }
}

// CarLoan class
class CarLoan extends Loan implements ApprovalProcess {
    @Override
    public void approveLoan() {
        System.out.println("Car Loan Approved");
    }
}

// Main class
public class BankingSystem {
    public static void main(String[] args) {
        Loan homeLoan = new HomeLoan();
        Loan carLoan = new CarLoan();

        homeLoan.calculateEMI(50000, 7.5, 60); // principal, rate, tenure in months
        ((ApprovalProcess) homeLoan).approveLoan();

        carLoan.calculateEMI(20000, 9.0, 48);
        ((ApprovalProcess) carLoan).approveLoan();
    }
}
