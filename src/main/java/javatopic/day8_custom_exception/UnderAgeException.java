package javatopic.day8_custom_exception;

public class UnderAgeException extends Exception{
    public UnderAgeException() {
        super("You are not eligible  to vote");

    }
    public UnderAgeException(String message) {
        super(message);
    }
}
