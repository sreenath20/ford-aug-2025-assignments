package com.ford.customer;



import com.ford.bank.Bank; // Import Bank class from 'bank' package

public class CustomerService {
    public static void main(String[] args) {
        System.out.println("--- Access from CustomerService.java (different package, no inheritance) ---");
        Bank bank = new Bank();

        // Public members: Accessible
        System.out.println("Public bankName: " + bank.bankName);
        bank.displayBankName();

        // Private members: NOT Accessible (will cause compile error if uncommented)
        // System.out.println(bank.vaultMoney);
        // bank.displayVaultMoney();

        // Default (package-private) members: NOT Accessible (different package)
        // System.out.println(bank.branchCode);
        // bank.displayBranchCode();

        // Protected members: NOT Accessible directly (different package, no inheritance)
        // System.out.println(bank.headOfficeLocation);
        // bank.displayHeadOfficeLocation();
        System.out.println("----------------------------------------------------------------------\n");
    }
}
