package javatopic.day3conditionalloop.assignments;

import java.util.Scanner;
//Invoice calculator
public class Assignment1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int TotalInvoice = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter invoice of item " + (i + 1) + ":");
            TotalInvoice = TotalInvoice + sc.nextInt();
        }
        System.out.println("Total invoice is " + TotalInvoice);
    }
}
