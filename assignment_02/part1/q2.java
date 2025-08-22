package assignment_02.part1;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n##########    ATM Pin Validation    ##########");
        /* Write a Java program using a while loop that gives the user maximum 3 attempts to enter the
        correct PIN. If the PIN is correct, display "Access Granted", else "Account Locked".*/
        int predefinedPIN= 1308;
        Byte count=3;
        while(count!=0){
            System.out.print("Please enter the PIN (4 digits): ");
            int pin=sc.nextInt();
            if(pin==predefinedPIN){
                System.out.println("Access Granted.");
                count=0;
            }
            else {
                count--;
                System.out.println("Invalid PIN! You have "+count+" chance left.\n");
                if(count==0){
                    System.out.println("ACCOUNT LOCKED.");
                }
            }
        }
    }
}