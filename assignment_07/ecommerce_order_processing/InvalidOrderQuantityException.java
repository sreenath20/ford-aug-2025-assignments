package assignment_07.ecommerce_order_processing;

class InvalidOrderQuantityException extends RuntimeException {
    public InvalidOrderQuantityException(String message) {
        super(message);
    }
    public InvalidOrderQuantityException() {
        super("Invalid order quantity");
    }
}

