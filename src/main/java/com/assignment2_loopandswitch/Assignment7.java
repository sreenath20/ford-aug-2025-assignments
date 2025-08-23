package com.assignment2_loopandswitch;

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        System.out.println("please enter the username (ADMIN, MANAGER, VIEWER) or type 'exits' to exit the program:");
        Scanner input = new Scanner(System.in);
        String username = " ";
        while (!(username.equals("EXISTS"))) {
            System.out.println("Username: ");
            username = input.nextLine().toUpperCase();
            switch (username) {
                case "ADMIN":
                    System.out.println("You Can manage users and settings");
                    break;
                case "MANAGER":
                    System.out.println("You Can generate reports and approve requests");
                    break;
                case " VIEWER":
                    System.out.println("Read-only access");
                    break;
                case "EXITS":
                    System.out.println("Exiting the program");
                    break;
                default:
                    System.out.println("Invalid username. Please try again.");
                    break;
            }
        }
    }
}
