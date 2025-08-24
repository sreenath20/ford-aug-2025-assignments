package assignment2.assignment2Part2;

public class OrderDeliveryTracker {
    public static void main(String[] args) {
        char[] deliveryStatusCodes = {'P', 'D', 'C', 'F', 'C', 'D', 'D', 'P', 'C', 'D'};
        Integer pendingOrders = 0;
        Integer deliveredOrders = 0;
        Integer cancelledOrders = 0;
        Integer failedOrders = 0;
        Integer orderCount = 1;

        for (char deliveryStatusCode : deliveryStatusCodes) {
            switch (deliveryStatusCode) {
                case 'P':
                    pendingOrders++;
                    System.out.println("Order " + orderCount + ": Pending");
                    break;
                case 'D':
                    deliveredOrders++;
                    System.out.println("Order " + orderCount + ": Delivered");
                    break;
                case 'C':
                    cancelledOrders++;
                    System.out.println("Order " + orderCount + ": Cancelled");
                    break;
                case 'F':
                    failedOrders++;
                    System.out.println("Order " + orderCount + ": Failed");
                    break;
            }
            orderCount++;
        }
        System.out.println("Total Orders Count     : " + (orderCount-1));
        System.out.println("Total Delivered Orders : " + deliveredOrders);
        System.out.println("Total Cancelled Orders : " +cancelledOrders);
        System.out.println("Total Failed Orders    : " +failedOrders);
    }
}


