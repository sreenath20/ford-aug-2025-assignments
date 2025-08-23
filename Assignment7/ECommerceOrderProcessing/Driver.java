package Assignment7.ECommerceOrderProcessing;

public class Driver {
    public static void main(String[] args) {
        OrderService service = new OrderService();

        try {
            service.placeOrder("Laptop", 1);
            service.placeOrder("Phone", 0);
        } catch (InvalidOrderQuantityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
