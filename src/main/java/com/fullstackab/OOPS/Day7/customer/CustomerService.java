package com.fullstackab.OOPS.Day7.customer;
import com.fullstackab.OOPS.Day7.bank.Bank;

public class CustomerService {
    public static void main(String[] args) {
        Bank bank = new Bank();
        System.out.println(bank.bankName);
        // System.out.println(bank.branchCode);
        // System.out.println(bank.vaultMoney);
        // System.out.println(bank.headOfficeLocation);
        bank.displayBankName();
        // bank.displayBranchCode();
        // bank.displayHeadOfficeLocation();
    }
}
