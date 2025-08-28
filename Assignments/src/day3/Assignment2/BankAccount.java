package day3.Assignment2;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String ownerName;

    public BankAccount() {
    }

    public BankAccount(String accountNumber, double balance, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    //Deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Amount: " + amount + " \n Current Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn Amount: " + amount + " \nCurrent Balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}
