package com.assignment6_part1.assignment4;

import static com.assignment6_part1.assignment4.BankAccount.*;

public class Driver {
    public static void main(String[] args) {
        BankAccount account1=new BankAccount("1234567890",100.0,10.0);
         System.out.println(account1.display());
         UpdateInterestRate(12.0);
        System.out.println(account1.display());
    }
}
