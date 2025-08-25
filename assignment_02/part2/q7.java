package assignment_02.part2;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----  User Access Level Management  -----\n");
        System.out.println("1. Admin");
        System.out.println("2. Manager");
        System.out.println("3. Viewer");
        System.out.println("4. Exit");

        while (true) {
            System.out.print("Please enter your choice (Admin, Manager, Viewer, Exit): ");
            String choice = sc.nextLine().toLowerCase();
            if (choice.equals("exit")) {
                break;
            }
            else {
                switch (choice) {
                    case "admin":
                        System.out.println("You can manage user and settings.");
                        break;
                    case "manager":
                        System.out.println("You can generate report and approve request.");
                        break;
                    case "viewer":
                        System.out.println("You have read-only access.");
                        break;

                    default:
                        System.out.println("Invalid choice.");
                        break;
                }
            }
;;      }
    }
}
