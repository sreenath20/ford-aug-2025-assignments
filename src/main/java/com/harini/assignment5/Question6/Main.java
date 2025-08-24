package com.harini.assignment5.Question6;

import com.harini.assignment3.Question2.BankAccount;
import com.harini.assignment3.Question2.CurrentSavings;
import com.harini.assignment3.Question2.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        TransactionProcessor transactionProcessor = new TransactionProcessor();
        transactionProcessor.process(23156789,24000);
        transactionProcessor.process(23456781,23417865,40000);
        SecurityCheck.logAttempt("Harini");
        SecurityCheck securityCheck = new SecurityCheck() {
            @Override
            public void showSecurityStatus() {
                SecurityCheck.super.showSecurityStatus();
            }
        };
        securityCheck.showSecurityStatus();
        BankAccount bank = new SavingsAccount(20987565,"Meena");
        bank.deposit(25000);
        bank.withdraw(2500);
        BankAccount bank2 = new CurrentSavings(20437511,"Bindu");
        bank2.withdraw(50000);
        bank2.withdraw(5000);
    }
}
