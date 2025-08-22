package com.fullstackab.OOPS.Day7.bank;

public class Branch {
    public static void main(String[] args) {
        Bank bank = new Bank();
        System.out.println(bank.bankName);
        // System.out.println(bank.vaultMoney);
        System.out.println(bank.branchCode);
        System.out.println(bank.headOfficeLocation);
        bank.displayBankName();
        // bank.displayVaultMoney();
        bank.displayBranchCode();
        bank.displayHeadOfficeLocation();
    }

}
