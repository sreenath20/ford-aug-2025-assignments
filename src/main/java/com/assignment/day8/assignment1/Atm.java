package com.assignment.day8.assignment1;

class InvalidPinException extends Exception {
    public InvalidPinException(String message) {
        super(message);
    }
}

public class Atm {

    Integer validPin = 1234;

    public void validatePin(Integer pin) throws InvalidPinException {
        if(pin.toString().length() != 4) {
            throw new InvalidPinException("PIN must be 4 digits.");
        }
        else if(!pin.equals(validPin)) {
            throw new InvalidPinException("Invalid PIN entered.");
        }
        else {
            System.out.println("Access granted Welcome.");
        }
    }

    public static void main(String[] args) {
        Atm atm = new Atm();
        try {
            atm.validatePin(1234); // Test with an invalid PIN
        } catch (InvalidPinException e) {
            System.out.println(e.getMessage());
        }
    }

}
