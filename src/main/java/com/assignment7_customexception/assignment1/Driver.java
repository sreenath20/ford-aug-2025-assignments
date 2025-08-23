package com.assignment7_customexception.assignment1;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM();
        
        System.out.print("Enter PIN: ");
        String enteredPin = scanner.nextLine();
        
        try {
            atm.validatePin(enteredPin);
            System.out.println("Access Granted. Welcome!");
        } catch (InvalidPinException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        scanner.close();
    }
}