package day2;

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        //1.Admin
        //2.Manager
        //3.viewer
        //4.Exit
        Scanner input = new Scanner(System.in);
        int selectRole = input.nextInt();
        while (selectRole != 4) {//Until exit
            switch (selectRole) {
                case 1:
                    System.out.println("Can manage users and settings");
                    break;
                case 2:
                    System.out.println("Can generate reports and requests");
                    break;
                case 3:
                    System.out.println("Read-only access");
            }
            selectRole = input.nextInt();
        }
        System.out.println("User is exited");
    }
}
