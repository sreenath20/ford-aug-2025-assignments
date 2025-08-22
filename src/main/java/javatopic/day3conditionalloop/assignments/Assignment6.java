package javatopic.day3conditionalloop.assignments;

import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int order = 10;
        Character deliveryCode[] = new Character[order];
        for (int code = 0; code < 10; code++) {
            System.out.println("Enter order number " + (code + 1) + " : ");
            deliveryCode[code] = input.next().charAt(0);
        }
        int pOrderCount=0;
        int dOrderCount=0;
        int cOrderCount=0;
        int fOrderCount=0;
        for (Character code : deliveryCode) {
            switch (code) {
                case 'P':
                    System.out.println("PENDING");
                    pOrderCount++;

                    break;
                case 'D':
                    System.out.println("DELIVERED");
                    dOrderCount++;

                    break;
                case 'C':
                    System.out.println("CANCELLED");
                    cOrderCount++;

                    break;
                case 'F':
                    System.out.println("FAILED");
                    fOrderCount++;

                    break;
                default:
                    System.out.println("Invalid code");

            }
        }
        System.out.println("ORDER SUMMARY");
        System.out.println("PENDING :" + pOrderCount);
        System.out.println("DELIVERED: " + dOrderCount);
        System.out.println("CANCELLED :" + cOrderCount);
        System.out.println("FAILED :" + fOrderCount);


    }
}
