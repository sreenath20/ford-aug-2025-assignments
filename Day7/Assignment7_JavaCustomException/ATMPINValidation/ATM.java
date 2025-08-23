package Assignment7_JavaCustomException.ATMPINValidation;

public class ATM {
    // Change this constant to whatever the "correct" PIN should be
    private static final String VALID_PIN = "1234";

    /**
     * Validates an entered PIN.
     * - Throws InvalidPinException if PIN is not exactly 4 digits or is incorrect.
     */
    public static void validatePin(String enteredPin) throws InvalidPinException {
        if (enteredPin == null || !enteredPin.matches("\\d{4}")) {
            throw new InvalidPinException("PIN must be exactly 4 digits.");
        }

        if (!enteredPin.equals(VALID_PIN)) {
            throw new InvalidPinException("Incorrect PIN.");
        }

        // If we reach here, PIN is valid
    }
}
