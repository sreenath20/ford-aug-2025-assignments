package Assignment7.ECommerceOrderProcessing;

public class InvalidOrderQuantityException extends RuntimeException {
    public InvalidOrderQuantityException(String message) {
        super(message);
    }
}
