package SpringBoot_ProductManagementAPI;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String message) {

      super(message);
    }
}
