public class OrderDeliveryTracker {
    public static void main(String[] args) {

        char[] codes = {'P', 'D', 'C', 'F', 'P', 'D', 'F', 'D', 'C', 'F'};
        int countOFPending = 0;
        int countOFDelivery = 0;
        int countOFCancelled = 0;
        int countOFFailed = 0;
        int orderNumber = 1;
        for (char code : codes) {
            switch (code) {
                case 'P':
                    System.out.println("Order"+" "+orderNumber+""+": Pending");
                    orderNumber++;
                    countOFPending++;
                    break;
                case 'D':
                    System.out.println("Order"+" "+orderNumber+""+": Delivered");
                    orderNumber++;
                    countOFDelivery++;
                    break;
                case 'C':
                    System.out.println("Order"+" "+orderNumber+""+": Cancelled");
                    orderNumber++;
                    countOFCancelled++;
                    break;
                case 'F':
                    System.out.println("Order"+" "+orderNumber+""+": Failed");
                    orderNumber++;
                    countOFFailed++;
                    break;
                default:
                    break;


            }
        }
        System.out.println("Count of orders under Pending: "+""+countOFPending);
        System.out.println("Count of orders under Delivered: "+""+countOFDelivery);
        System.out.println("Count of orders under Cancelled: "+""+countOFCancelled);
        System.out.println("Count of orders under Failed: "+""+countOFFailed);


    }
}
