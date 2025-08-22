package com.ford.bank;



public class Branch {
    public static void main(String[] args) {
        System.out.println("--- Access from Branch.java (same package as Bank) ---");
        Bank bank = new Bank();

        // Public members: Accessible
        System.out.println("Public bankName: " + bank.bankName);
        bank.displayBankName();

        // Private members: NOT Accessible (will cause compile error if uncommented)
        // System.out.println(bank.vaultMoney);
        // bank.displayVaultMoney();

        // Default (package-private) members: Accessible (same package)
        System.out.println("Default branchCode: " + bank.branchCode);
        bank.displayBranchCode();

        // Protected members: Accessible (same package)
        System.out.println("Protected headOfficeLocation: " + bank.headOfficeLocation);
        bank.displayHeadOfficeLocation();
        System.out.println("---------------------------------------------------\n");

        bank.testPrivateAccessInsideBank(); // Calling a public method that accesses a private method
    }
}
