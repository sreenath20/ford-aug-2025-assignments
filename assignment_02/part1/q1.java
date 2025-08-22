package assignment_02.part1;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----    Invoice Calculator for 5 items    -----");
        /* Write a Java program using a for loop to calculate the total invoice amount of 5 items
        purchased. The user should input the price of each item.*/
            Double sum=0.0;
            for (int i=0;i<5;i++){     // i<5 since total number of items is 5.
                System.out.print("Enter the price of item "+(i+1)+": ");
                Double price=sc.nextDouble();
                if(price<=0){
                    System.out.println("Item Price can't be less than or equal to zero. Please try again. ");
                    System.exit(0);
                }
                else
                    sum+=price;
            }
            System.out.printf("\nTotal invoice amount: %.2f ",sum);

        }
}