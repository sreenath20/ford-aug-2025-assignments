package com.ford.assignment2;
import java.util.Scanner;

public class UserManagement {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int choice;

            while (true) {
                System.out.println("\nSelect Role:");
                System.out.println("1. Admin");
                System.out.println("2. Manager");
                System.out.println("3. Viewer");
                System.out.println("4. Exit");
                System.out.print("Enter choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Can manage users and settings");
                        break;
                    case 2:
                        System.out.println("Can generate reports and approve requests");
                        break;
                    case 3:
                        System.out.println("Read-only access");
                        break;
                    case 4:
                        System.out.println("Exiting...");

                        return;
                    default:
                        System.out.println("Invalid choice, try again.");
                }
            }
        }

}
