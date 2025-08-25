package assignment_02.part1;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n##########    Display Employee Names    ##########");
        /* Write a Java program using a for-each loop to display all employee names stored in an array.*/
        System.out.println("How many employees do you want to enter?");
        int size=sc.nextInt();
        sc.nextLine();
        String[] employeeNames=new String[size];
        System.out.println("\nEnter Employee Name:");
        for(int i=0;i<size;i++){
            System.out.println("Employee "+(i+1)+": ");
            employeeNames[i]=sc.nextLine();
        }
        System.out.println("\nEmployee Names:");
        for(String name:employeeNames){
            System.out.println(name);
        }
    }
}
