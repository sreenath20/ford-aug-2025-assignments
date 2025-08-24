package com.harini.assignment2;

import java.util.Scanner;

public class UserAccessControl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userAccess;
        while(true){
            System.out.print("Enter the access type ");
            userAccess = input.nextLine();
            userAccess = userAccess.substring(0,1).toUpperCase() + userAccess.substring(1);

            //System.out.println(userAccess);
            switch(userAccess){
                case "Access":
                    System.out.println("Can manage users and settings");
                    break;
                case "Manager":
                    System.out.println("Can generate reports and approve requests");
                    break;
                case "Viewer":
                    System.out.println("Read-only access");
                    break;
                case "Exit":
                    System.out.println("Exiting........");
                    break;
            }
            if(userAccess.equals("Exit")){
                break;
            }
        }
    }
}
