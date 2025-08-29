//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Before any orders:");
        Order.displayTotalOrders();  // Should print 0

        //  Create multiple Order objects
        Order o1 = new Order("Alice", "Smartphone");
        Order o2 = new Order("Bob", "Laptop");
        Order o3 = new Order("Charlie", "Tablet");

        //  Show details of each order
        System.out.println("\nOrder Details:");
        o1.displayOrder();
        o2.displayOrder();
        o3.displayOrder();

        //Call static method again (shared data)
        System.out.println("After placing orders:");
        System.out.println("we can use Class name to access static method without creating an instance of Order");
        System.out.println("for example: Order.displayTotalOrders()");
        Order.displayTotalOrders();  // Should print 3

        //  Access static method via object reference (not recommended, but legal)
//        o1.displayTotalOrders(); // Still works, but stylistically better to use ClassName


    }
}