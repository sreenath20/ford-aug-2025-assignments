package com.fullstackabi.assignment.Assign7.CustomException.Ex1;

import java.util.Scanner;

public class ATMDriver extends Exception {

    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your PIN");
        String enteredATMPIN = scan.next();
        try {
            atm.validatePIN(enteredATMPIN);
        } catch (InvalidPINException e) {
           // throw new RuntimeException(e);
           System.out.println(e.getMessage());
        }

    }

}
