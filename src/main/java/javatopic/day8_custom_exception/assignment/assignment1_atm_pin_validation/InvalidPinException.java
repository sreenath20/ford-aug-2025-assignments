package javatopic.day8_custom_exception.assignment.assignment1_atm_pin_validation;

public class InvalidPinException extends Exception {
    public InvalidPinException() {
    }
    public InvalidPinException(String message) {
        super(message);
    }

    // why super(message)

}
