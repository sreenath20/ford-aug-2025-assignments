package com.fullstackabi.assignment.Assign6.Exceptionhandlingaccessmodifier.Part1accessmodifier.staticmemscenario2;

public class BankAccountDriver {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(10001,1000.00);
        BankAccount bankAccount2 = new BankAccount(10002,2000.00);
        //BankAccount bankAccount3 = new BankAccount(10003,3000.00);

        bankAccount.displayDetails();
        //static methods can be accessed without an object
        BankAccount.updateInterestRate(0.05);
        bankAccount2.displayDetails();
    }
}
