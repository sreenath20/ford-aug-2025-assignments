package day2;

public class Assignment6 {
    //p->pending,d->delivery,c->cancelled,f->failed
    public static void main(String[] args) {
        char[] statusTracking = {'P','D','P','C','F','C','D','C','D','F'};
        int pendingOrders=0;
        int deliveredOrders=0;
        int cancelledOrders=0;
        int failedOrders=0;


        for(char ch : statusTracking){
            switch (ch){
                case 'P':
                    pendingOrders++;
                    break;
                case 'D':
                    deliveredOrders++;
                    break;
                case 'C':
                    cancelledOrders++;
                    break;
                case 'F':
                    failedOrders++;
                    break;
                default:
                    System.out.println("Not a valid status");
            }
        }
        System.out.println("Total pending orders: "+pendingOrders);
        System.out.println("Total delivered orders: "+deliveredOrders);
        System.out.println("Total cancelled orders: "+cancelledOrders);
        System.out.println("Total failed orders: "+failedOrders);

    }
}
