package com.fullstackabi.assignment.Assign6.Exceptionhandlingaccessmodifier.part2.excephandle.Ex1Banking;

public class ATM {
    double balance = 10000;

    void withDraw(double amount) {
        if (amount > balance) {
            throw new ArithmeticException("Insufficient Balance Available");
        } else if (amount <= 0) {
            throw new IllegalArgumentException("Entered amount is Zero");
        } else if (Double.isNaN(amount)) {
            throw new NumberFormatException("Please enter a numeric value");
        }else {
        System.out.println("Balance after withdrawal : " + (balance - amount));
    }
}
}

