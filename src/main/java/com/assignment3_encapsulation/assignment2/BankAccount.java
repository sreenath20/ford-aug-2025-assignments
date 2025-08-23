package com.assignment3_encapsulation.assignment2;

public class BankAccount {
    private  int accountNumber;
    private Double balance ;
    private String accountHolderName;

    public BankAccount(int accountNumber, Double balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    public void deposit(double amount) {
        if(amount<=0) {
            System.out.println("Amount can't be negative or zero");
            return;
        }
        else {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("New Balance: " + balance);
        }
    }
    public void withdraw(double amount) {
        if(amount <= 0) {
            System.out.println("Amount can't be negative or zero");
            return;
        }
        if(amount > balance) {
            System.out.println("Insufficient balance");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
        System.out.println("New Balance: " + balance);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", accountHolderName='" + accountHolderName + '\'' +
                '}';
    }
}
