package com.ford.assignment3;

public class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String ownerName, double initialBalance, double overdraftLimit) {
        super(accountNumber, ownerName, initialBalance);
        this.overdraftLimit = overdraftLimit;
        System.out.println("CurrentAccount created with overdraft limit: $" + String.format("%.2f", overdraftLimit));
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance - amount >= -overdraftLimit) {
                balance -= amount;
                System.out.println("Withdrew $" + String.format("%.2f", amount) + " from " + ownerName + "'s current account. New balance: $" + String.format("%.2f", balance));
                if (balance < 0) {
                    System.out.println("WARNING: Account is now in overdraft!");
                }
            } else {
                System.out.println("Withdrawal of $" + String.format("%.2f", amount) + " exceeds overdraft limit of $" + String.format("%.2f", overdraftLimit) + ". Current balance: $" + String.format("%.2f", balance));
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Overdraft Limit: $" + String.format("%.2f", overdraftLimit));
    }
}
