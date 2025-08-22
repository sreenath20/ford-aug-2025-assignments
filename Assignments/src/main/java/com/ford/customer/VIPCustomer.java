package com.ford.customer;



import com.ford.bank.Bank; // Import Bank class from 'bank' package

public class VIPCustomer extends Bank { // VIPCustomer inherits from Bank
    public static void main(String[] args) {
        System.out.println("--- Access from VIPCustomer.java (different package, subclass of Bank) ---");
        VIPCustomer vip = new VIPCustomer(); // Create an instance of the subclass

        // Public members: Accessible
        System.out.println("Public bankName: " + vip.bankName);
        vip.displayBankName();

        // Private members: NOT Accessible (will cause compile error if uncommented)
        // System.out.println(vip.vaultMoney);
        // vip.displayVaultMoney();

        // Default (package-private) members: NOT Accessible (different package)
        // System.out.println(vip.branchCode);
        // vip.displayBranchCode();

        // Protected members: Accessible (different package, but via inheritance)
        System.out.println("Protected headOfficeLocation: " + vip.headOfficeLocation);
        vip.displayHeadOfficeLocation();
        System.out.println("---------------------------------------------------------------------\n");
    }
}
