package Assignment7.ECommerceOrderProcessing;

public class OrderService {
    public void placeOrder(String productName, int quantity) {
        if (quantity <= 0) {
            throw new InvalidOrderQuantityException("Order quantity must be greater than zero.");
        }
        System.out.println("Placing order for " + productName + " (Quantity: " + quantity + ")... Order placed successfully.");
    }
}
