package com.harini.day7.sub_package;

import com.harini.day7.Bank;

public class CustomerService {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.bankName = "Canara";
        bank.displayBankName();
        bank.testPrivateAccessInsideBank();
    }

}
