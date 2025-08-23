package com.assignment3_encapsulation.assignment2;

public class Driver {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(12345, 1000.0, "aaaaa");
        System.out.println(account.toString());
        account.deposit(500.0);
        account.withdraw(200.0);
        System.out.println(account.toString());

        SavingsAccount savingsAccount = new SavingsAccount(67890, 3000.0, "bbbbb", 5.0);
        savingsAccount.toString();
        savingsAccount.calculateInterest();
        savingsAccount.deposit(300.0);
        savingsAccount.withdraw(100.0);
        System.out.println(savingsAccount.toString());

        CurrentAccount currentAccount = new CurrentAccount(54321, 20000.0, "ccccc", 10000.0);
        currentAccount.toString();
        currentAccount.withdraw(6000.0);
        currentAccount.withdraw(5000.0);
        currentAccount.withdraw(2000.0);
        currentAccount.displaydetails();



    }

}
