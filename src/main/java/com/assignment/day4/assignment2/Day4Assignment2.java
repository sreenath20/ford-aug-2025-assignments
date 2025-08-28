package com.assignment.day4.assignment2;

class BankAccount {
    private int accountNumber;
    private double balance;
    private String accountHolderName;

    public BankAccount() {
    }

    public BankAccount(int accountNumber, double balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ". New balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount() {
    }

    public CurrentAccount(int accountNumber, double balance, String accountHolderName, double overdraftLimit) {
        super(accountNumber, balance, accountHolderName);
        this.overdraftLimit = overdraftLimit;
    }

    public void calculateOverdraft() {
        double overdraft = getBalance() < 0 ? Math.abs(getBalance()) : 0;
        if (overdraft > overdraftLimit) {
            System.out.println("Overdraft limit exceeded. Current overdraft: " + overdraft);
        } else {
            System.out.println("Current overdraft: " + overdraft);
        }
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount() {
    }

    public SavingsAccount(int accountNumber, double balance, String accountHolderName, double interestRate) {
        super(accountNumber, balance, accountHolderName);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
        System.out.println("Applied interest: " + interest + ". New balance: " + getBalance());
    }

}

public class Day4Assignment2 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(101, 1000.0, "Alice", 5.0);
        System.out.println("Initial Savings Account Balance: " + savingsAccount.getBalance());
        savingsAccount.applyInterest();
        savingsAccount.deposit(200.0);
        savingsAccount.withdraw(150.0);
        System.out.println("Final Savings Account Balance: " + savingsAccount.getBalance());
        System.out.println();
        CurrentAccount currentAccount = new CurrentAccount(102, -500.0, "Bob", 1000.0);
        System.out.println("Initial Current Account Balance: " + currentAccount.getBalance());
        currentAccount.calculateOverdraft();
        currentAccount.deposit(300.0);
        currentAccount.withdraw(200.0);
        currentAccount.calculateOverdraft();
        System.out.println("Final Current Account Balance: " + currentAccount.getBalance());

    }
}
