package com.fullstackabi.assignment.Assign7.CustomException.Ex1;

import java.util.Objects;

public class ATM {
    final String PIN = "1234";

    public void validatePIN(String pin)  throws InvalidPINException {
        if (Objects.equals(pin, PIN)) {
            System.out.println("Your login is successful");
        } else {
            throw new InvalidPINException();
        }
    }
}

