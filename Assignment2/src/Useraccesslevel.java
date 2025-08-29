import java.util.Scanner;

public class Useraccesslevel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean isExit=true;
        while (isExit) {
            System.out.println("Enter Your Role Admin/Manager/Viewer/Exit:");
            String role = scan.nextLine();
            switch (role) {
                case "Admin":
                    System.out.println("Can manage users and settings");
                    break;

                case "Manager":
                    System.out.println("Can generate reports and approve requests");
                    break;

                case "Viewer":
                    System.out.println("Read-only access");
                    break;
                case "Exit":
                    System.out.println("Exit");
                    isExit=false;
                    break;
                default:
                    System.out.println("Invalid Role");
                    break;

            }
        }
    }
}
