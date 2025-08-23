package Assignment7_JavaCustomException.ATMPINValidation;

// Checked custom exception
public class InvalidPinException extends Exception {
    public InvalidPinException(String message) {
        super(message);
    }
}
