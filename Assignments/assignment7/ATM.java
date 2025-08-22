package com.assignments.assignment7;

import java.util.Scanner;

public class ATM {


    void validatePIN(String pin) throws InvalidPINException{
        System.out.print("Entered PIN : "+pin+ "-> ");
        if(pin.length() != 4) throw new InvalidPINException("PIN must be exactly 4 digits.");
        if(!pin.equals("1234")) throw new InvalidPINException("Incorrect PIN.");
        System.out.println("Access Granted. Welcome..!");
    }
}
