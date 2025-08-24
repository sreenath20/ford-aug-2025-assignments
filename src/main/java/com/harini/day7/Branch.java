package com.harini.day7;

public class Branch {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.bankName = "SBI Bank";
        bank.branchCode = "SBIN0000345";
        bank.headOfficeLocation = "New Delhi";
        bank.displayBankName();
        bank.displayBranchCode();
        bank.displayHeadOfficeLocation();
        bank.testPrivateAccessInsideBank();
    }
}
