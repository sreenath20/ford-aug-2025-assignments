package javatopic.day3conditionalloop.assignments;

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String role;
        System.out.print("Enter your role(admin/Manager/Viewer/Exit): ");
        role = input.nextLine();

        while (!role.equals("Exit")) {

            switch (role) {
                case "admin":
                    System.out.println("can manage users and settings ");
                    break;
                case "manager":
                    System.out.println("can generate report and approve request");
                    break;
                case "viewer":
                    System.out.println("Read only access");
                    break;
                default:
                    System.out.println("Invalid role");
            }
            System.out.print("Enter your role(admin/Manager/Viewer/Exit): ");
            role = input.nextLine();
        }
    }
}
