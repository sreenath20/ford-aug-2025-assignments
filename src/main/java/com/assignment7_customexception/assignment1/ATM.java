package com.assignment7_customexception.assignment1;

public class ATM {
    private static final String VALID_PIN = "1234";

    public void validatePin(String enteredPin) throws InvalidPinException {
        if (enteredPin.length() != 4) {
            throw new InvalidPinException("PIN must be exactly 4 digits.");
        }

        if (!enteredPin.equals(VALID_PIN)) {
            throw new InvalidPinException("Incorrect PIN.");
        }
    }
}
