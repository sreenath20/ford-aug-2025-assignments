package assignment_06.part_1.ecommerce_order_tracking;

public class ECommerceOrderTracking {
    public static void main(String[] args) {
        System.out.println("--- Order Management System ---\n");

        Order order1 = new Order("431", "Nitish", "Toy Car");
        Order order2 = new Order("402", "Samyuktha", "Pillow");
        Order order3 = new Order("453", "Rajesh", "Laptop");

        Order.displayOrder(order1, 1);
        Order.displayOrder(order2, 2);
        Order.displayOrder(order3, 3);

        System.out.println("Total Number of Orders: " + Order.getTotalOrders());
        System.out.println("All orders processed successfully!");

    }
}
