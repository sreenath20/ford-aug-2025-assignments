package javatopic.day8_custom_exception.assignment.assignment4_online_order;
// unchecked exception
public class InvalidOrderQuantityException extends RuntimeException{
    public InvalidOrderQuantityException() {
    }
    public InvalidOrderQuantityException(String message) {
        super(message);
    }
}
