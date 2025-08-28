package com.assignment.day6;

class TransactionProcessor{
    public void process(int accountNumber, double amount) {
        // Process the transaction
        System.out.println("Processing transaction for account: " + accountNumber + " with amount: " + amount);
    }

    public void process(int fromAccount, int toAccount, double amount) {
        // Process the transfer
        System.out.println("Transferring " + amount + " from account " + fromAccount + " to account " + toAccount);
    }
}

class BankAccount {
    public void calculateInterest(double principal, double rate, int time) {
        // Calculate interest
        double interest = (principal * rate * time) / 100;
        System.out.println("Calculated interest: " + interest);
    }
}

class SavingsAccount extends BankAccount {
    @Override
    public void calculateInterest(double principal, double rate, int time) {
        // Calculate interest for savings account
        double interest = (principal * rate * time) / 100;
        System.out.println("Savings Account Interest: " + interest);
    }
}

class CurrentAccount extends BankAccount {
    @Override
    public void calculateInterest(double principal, double rate, int time) {
        // Current accounts typically do not earn interest
        System.out.println("Current Account does not earn interest.");
    }
}

interface SecurityCheck {
    static void logAttempt(String user){
        System.out.println("Security check: User " + user + " attempted access.");
    }
    default void showSecurityStatus() {
        System.out.println("Security status: Secure connection established.");
    }
    abstract void verifyUser(String username, String password);
}

public class Day6Assignment6 implements SecurityCheck {
    @Override
    public void verifyUser(String username, String password) {
        // Implementation for user verification
        System.out.println("Verifying user: " + username);
    }
    public static void main(String[] args) {



        System.out.println("STATIC POLYMORPHISM");
        TransactionProcessor transactionProcessor = new TransactionProcessor();
        transactionProcessor.process(12345, 2500.75); // Single account transaction
        transactionProcessor.process(12345, 67890, 1500.50); //
        System.out.println();
        System.out.println("DYNAMIC POLYMORPHISM");
        BankAccount bankAccount = new BankAccount();
        bankAccount.calculateInterest(10000, 5, 2); // General bank account interest calculation
        System.out.println();
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.calculateInterest(10000, 5, 2); // Savings account interest
        System.out.println();
        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.calculateInterest(10000, 5, 2); // Current account interest
        System.out.println();
        System.out.println("INTERFACE");
        SecurityCheck.logAttempt("Deepak");
        Day6Assignment6 assignment = new Day6Assignment6();
        assignment.verifyUser("Deepak","12345");
        assignment.showSecurityStatus(); // Default method from interface
        System.out.println();




    }
}
