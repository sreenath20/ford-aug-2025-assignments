package Assignment2;

import java.util.Scanner;

public class OrderDeliveryTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] deliveryStatus=new String[10];
        System.out.println("Enter Delivery Status");
        for(int i=0;i<10;i++)
        {
            deliveryStatus[i]=sc.nextLine();
        }
        int c=1,pendingCount=0,deliveryCount=0,failedCount=0,cancelCount=0;
        System.out.println("---------------------");
        System.out.println("Status of the Orders");
        System.out.println("---------------------");
        for(String dstatus:deliveryStatus)
        {

            switch(dstatus)
            {
                case "P":
                    System.out.println("Order "+c+": "+"Pending");
                    c+=1;
                    pendingCount+=1;
                    break;
                case "D":
                    System.out.println("Order "+c+": "+"Delivered");
                    c+=1;
                    deliveryCount+=1;
                    break;
                case "C":
                    System.out.println("Order "+c+": "+"Cancelled");
                    c+=1;
                    cancelCount+=1;
                    break;
                case "F":
                    System.out.println("Order "+c+": "+"Failed");
                    c+=1;
                    failedCount+=1;
                    break;
            }
        }
        System.out.println("---------------------");
        System.out.println("Summary of the Orders");
        System.out.println("---------------------");
        System.out.println("Pending Orders :"+pendingCount);
        System.out.println("Delivered Orders :"+deliveryCount);
        System.out.println("Cancelled Orders :"+cancelCount);
        System.out.println("Failed Orders :"+failedCount);



    }
}
