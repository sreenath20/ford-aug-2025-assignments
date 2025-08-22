package com.fullstackab.OOPS.Day7.customer;

import com.fullstackab.OOPS.Day7.bank.Bank;

public class VIPCustomer extends Bank {
    public static void main(String[] args) {
        VIPCustomer vip = new VIPCustomer();
        System.out.println(vip.bankName);
        // System.out.println(vip.branchCode);
        // System.out.println(vip.vaultMoney);
        System.out.println(vip.headOfficeLocation);
        vip.displayBankName();
        vip.displayHeadOfficeLocation();
        // vip.displayBranchCode();
    }
}

