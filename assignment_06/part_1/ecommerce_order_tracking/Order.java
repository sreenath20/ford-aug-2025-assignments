package assignment_06.part_1.ecommerce_order_tracking;

class Order
{
    private static long totalOrders=0;

    String orderId,customerName,product;
    public Order(String orderId,String customerName,String product)
    {
        this.orderId=orderId;
        this.customerName=customerName;
        this.product=product;

        Order.totalOrders+=1;
    }
    public static long getTotalOrders()
    {
        return totalOrders;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getProduct() {
        return product;
    }

    static void displayOrder(Order order, int orderNumber) {
        System.out.println("ORDER #" + orderNumber);
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Customer Name: " + order.getCustomerName());
        System.out.println("Product: " + order.getProduct());
        System.out.println();
    }
}

