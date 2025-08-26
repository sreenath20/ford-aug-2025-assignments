package assignment_07.atm_pin_validation;

public class InvalidPinException extends RuntimeException {
    public InvalidPinException(String message) {
        super(message);
    }
    public InvalidPinException() {
        super("Invalid PIN entered");
    }
}
