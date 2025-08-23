package com.assignment6_part2.assignment1;

public class ATM {
    private double balance;

    public ATM(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid amount entered.");
        }

        if (amount > balance) {
            throw new ArithmeticException("Insufficient balance. Available: " + balance);
        }

        balance -= amount;
        System.out.println("Withdrawal successful! Amount withdrawn: " + amount);
        System.out.println("Remaining balance: " + balance);
    }
}
