package day2.Part_1;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        final int PIN = 1234;
        int attempts = 0;
        Scanner sc = new Scanner(System.in);

        while (attempts < 3) {
            System.out.print("Enter your PIN: ");
            int enteredPin = sc.nextInt();

            if (enteredPin == PIN) {
                System.out.println("Access Granted");
                return;
            } else {
                System.out.println("Incorrect PIN. Try again.");
            }
            attempts++;
        }

        System.out.println("Account Locked");
    }


}
