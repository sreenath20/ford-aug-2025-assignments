package day2.Part_2;
import java.util.Scanner;
public class Assignment7 {
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
                    System.out.println("Admin → Can manage users and settings");
                    break;
                case 2:
                    System.out.println("Manager → Can generate reports and approve requests");
                    break;
                case 3:
                    System.out.println("Viewer → Read-only access");
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }

    }
}
