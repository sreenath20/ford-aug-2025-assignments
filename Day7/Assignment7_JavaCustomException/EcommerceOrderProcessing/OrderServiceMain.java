package EcommerceOrderProcessing;

public class OrderServiceMain {
    public static void main(String[] args) {
        OrderService service = new OrderService();

        try {
            service.placeOrder("Laptop", 1);
        } catch (InvalidOrderQuantityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            service.placeOrder("Phone", 0);
        } catch (InvalidOrderQuantityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

