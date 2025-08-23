package ecommerce;

public class MainOrders {
    public static void main(String[] args) {
        Order o1 = new Order("Alice", "Laptop");
        Order o2 = new Order("Bob", "Keyboard");
        Order o3 = new Order("Carol", "Mouse");

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);

        System.out.println("Total via static getter: " + Order.getTotalOrders());

        Order.printTotalOrders();
    }
}
