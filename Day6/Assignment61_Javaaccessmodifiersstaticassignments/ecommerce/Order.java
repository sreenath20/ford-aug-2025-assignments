package ecommerce;

public class Order {
    private static int totalOrders = 0;

    private int orderId;
    private String customerName;
    private String product;

    public Order(String customerName, String product) {
        this.customerName = customerName;
        this.product = product;
        this.orderId = ++totalOrders;
    }

    public int getOrderId() {
        return orderId;
    }

    @Override
    public String toString() {
        return "Order[id=" + orderId + ", customer=" + customerName + ", product=" + product + "]";
    }

    public static int getTotalOrders() {
        return totalOrders;
    }

    public static void printTotalOrders() {
        System.out.println("Total orders placed: " + totalOrders);
    }
}
