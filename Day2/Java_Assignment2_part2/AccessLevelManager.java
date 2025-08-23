

import java.util.Scanner;

public class AccessLevelManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nSelect role:");
            System.out.println("1. Admin");
            System.out.println("2. Manager");
            System.out.println("3. Viewer");
            System.out.println("4. Exit");
            System.out.print("Enter choice (1-4): ");

            String input = sc.nextLine().trim();
            int choice;
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number 1-4.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("Admin -> Can manage users and settings");
                    break;
                case 2:
                    System.out.println("Manager -> Can generate reports and approve requests");
                    break;
                case 3:
                    System.out.println("Viewer -> Read-only access");
                    break;
                case 4:
                    System.out.println("Exiting...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        sc.close();
    }
}
