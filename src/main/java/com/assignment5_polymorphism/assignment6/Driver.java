package com.assignment5_polymorphism.assignment6;

public class Driver {
    public static void main(String[] ags) {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.calculateInterest();
        savingsAccount.showSecurityStatus();
        savingsAccount.verifyUser("user1", "password123");
        SecurityCheck.logAttempt("user1");

        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.calculateInterest();
        currentAccount.showSecurityStatus();
        currentAccount.verifyUser("user1", "password123");
        SecurityCheck.logAttempt("user1");

        TransactionProcessor transactionProcessor = new TransactionProcessor();
        transactionProcessor.process(12345, 1000.0);
        transactionProcessor.process(12345, 67890, 500.0);
    }
}
