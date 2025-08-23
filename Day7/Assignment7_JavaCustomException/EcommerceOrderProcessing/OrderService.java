package EcommerceOrderProcessing;

public class OrderService {
    public void placeOrder(String productName, int quantity) {
        System.out.println("Placing order for " + productName + " (Quantity: " + quantity + ")...");
        if (quantity <= 0) {
            throw new InvalidOrderQuantityException("Order quantity must be greater than zero.");
        }
        System.out.println("Order placed successfully.");
    }
}
