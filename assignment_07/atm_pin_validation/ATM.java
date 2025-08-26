package assignment_07.atm_pin_validation;

public class ATM {
    private static final String validPIN = "1234";

    public void validatePin(String enteredPin) throws InvalidPinException {
        if (enteredPin == null || enteredPin.trim().isEmpty()) {
            throw new InvalidPinException("PIN cannot be empty.");
        }
        enteredPin = enteredPin.trim();

        if (enteredPin.length() != 4) {
            throw new InvalidPinException("PIN must be exactly 4 digits.");
        }

        for (int i = 0; i < enteredPin.length(); i++) {
            char ch = enteredPin.charAt(i);
            if (ch < '0' || ch > '9') {
                throw new InvalidPinException("PIN must contain only numbers.");
            }
        }

        if (!enteredPin.equals(validPIN)) {
            throw new InvalidPinException("Incorrect PIN.");
        }
        System.out.println("Access Granted.");
    }

    public void displayWelcome() {
        System.out.println("Welcome to ATM Machine");
        System.out.println("Please enter your 4-digit PIN to continue.");
    }

    public void showMainMenu() {
        System.out.println("\n--- ATM Main Menu ---");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Cash");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");
        System.out.println();
    }
}
