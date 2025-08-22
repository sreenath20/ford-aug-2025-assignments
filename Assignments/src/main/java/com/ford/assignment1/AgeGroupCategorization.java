package com.ford.assignment1;

import java.util.Scanner;

public class AgeGroupCategorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int total=5;
        int[] AgeGroup = {35,10,20,30,40};


        int countChild = 0, countTeen = 0, countAdult = 0, countSenior = 0;

        for (int age : AgeGroup) {


            if (age >= 0 && age <= 12) {
                countChild++;
            } else if (age >= 13 && age <= 19) {
                countTeen++;
            } else if (age >= 20 && age <= 59) {
                countAdult++;
            } else if (age >= 60) {
                countSenior++;
            }
        }

        System.out.println("Age Group Distribution:");
        System.out.println("Child (0-12):"+ countChild+" "+ (countChild * 100.0 / total));
        System.out.println("Teen (13-19): "+ countTeen+" "+ (countTeen * 100.0 / total));
        System.out.println("Adult (20-59): "+ countAdult+" "+ (countAdult * 100.0 / total));
        System.out.println("Senior (60+): " +countSenior+" "+ (countSenior * 100.0 / total));

        sc.close();
    }
}

