package SpringBoot_ProductManagementAPI;

public class InvalidProductDataException extends RuntimeException {
    public InvalidProductDataException(String message) {

        super(message);
    }
}
