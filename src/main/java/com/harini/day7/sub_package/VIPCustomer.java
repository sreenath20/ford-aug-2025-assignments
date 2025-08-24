package com.harini.day7.sub_package;

import com.harini.day7.Bank;
import org.w3c.dom.ls.LSOutput;

public class VIPCustomer extends Bank {
    public static void main(String[] args) {
        VIPCustomer v = new VIPCustomer();
        v.bankName = "CUB";
        v.displayBankName();
        v.headOfficeLocation = "Chennai";
        v.displayHeadOfficeLocation();
        v.testPrivateAccessInsideBank();

    }
}
