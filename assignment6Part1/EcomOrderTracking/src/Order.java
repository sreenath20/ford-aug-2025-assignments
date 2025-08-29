public class Order {
    private static int totalOrders=0;

    private int orderId;
    private String customerName;
    private String product;

    public Order(String customerName, String product) {
        this.orderId = totalOrders;
        this.customerName = customerName;
        this.product = product;
        totalOrders++;
    }
    //static method
    public static void displayTotalOrders(){
        System.out.println("Total Orders placed: "+totalOrders);

    }
    // instance method
    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customerName);
        System.out.println("Product: " + product);
        System.out.println();
    }
}
