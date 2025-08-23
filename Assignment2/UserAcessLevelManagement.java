package Assignment2;

import java.util.Scanner;
public class UserAcessLevelManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Please Enter your Role :\n1.Admin\n2.Manager\n3.Viewer\n4.Exit");
            String role = sc.nextLine();
            switch(role)
            {
                case "Admin":
                    System.out.println("Can manage users and settings");
                    break;
                case "Manager":
                    System.out.println("Can generate reports and approve requests");
                    break;
                case "Viewer":
                    System.out.println("Read Only Access");
            }
            System.out.println("---------------------------------------------------");
            if(role.equals("Exit"))
            {
                break;
            }
        }

    }
}