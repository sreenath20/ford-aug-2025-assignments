package com.fullstackabi.assignment.Assign5.Polymorphism.Ex6BankingSystem;

import com.fullstackab.OOPS.Day7.bank.Bank;
import com.fullstackabi.assignment.Assign10.LambdaStream.Ex1.Lambda.BankSystem;

import static com.fullstackabi.assignment.Assign5.Polymorphism.Ex6BankingSystem.SecurityCheck.logAttempt;

public class BankSystemDriver  {

    public static void main(String[] args) {

        TransactionProcessor transactionProcessor = new TransactionProcessor("Kavitha", "1234ST", 1000, 1000.00);
        TransactionProcessor transactionProcessor1 = new TransactionProcessor("Priya", "1234ST", 1001, 7000.00);
        TransactionProcessor transactionProcessor2 = new TransactionProcessor("John", "1234ST", 1002, 5000.00);

        //static binding
        transactionProcessor.process(1000, 1000.00);
        transactionProcessor1.process(1001, 1002, 7000.00);

        BankSystemDriver bankSystemDriver = new BankSystemDriver();
        //dynamic binding ; calling the child classes method calcinterest using the object reference of child
        BankAccount bankAccount = new BankAccount();

        // default method called from the child class with the object ref
                // i.e default method can be modified in the child class (showSEcurityStatus() - default)
        SavingsAccount savingsAccount = new SavingsAccount();
        if (savingsAccount.verifyUser("Priya", "1234ST")) {
            savingsAccount.showSecurityStatus();
            savingsAccount.calculateInterest(1000.00);
        } else {
            SecurityCheck.logAttempt("Priya"); // static method called using the class directly without object reference
        }
        CurrentAccount currentAccount = new CurrentAccount();
    //    bankAccount = currentAccount; // assigning the object ref of child class to base class not working?
        if (currentAccount.verifyUser("Priya", "1234ST")) {
            currentAccount.showSecurityStatus();
            currentAccount.calculateInterest(1000.00);
        } else {
            SecurityCheck.logAttempt("Priya");
        }
    }


}
