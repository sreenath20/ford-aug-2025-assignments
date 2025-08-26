package assignment_07.ecommerce_order_processing;

class OrderService {
    public void placeOrder(int quantity){
        if (quantity <= 0) {
            throw new InvalidOrderQuantityException("Order quantity must be greater than zero. Quantity entered: " + quantity);
        }
        System.out.println("Order placed successfully!");
    }
}
