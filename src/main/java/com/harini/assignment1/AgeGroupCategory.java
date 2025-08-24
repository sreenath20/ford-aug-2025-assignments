package com.harini.assignment1;

import java.util.Scanner;

public class AgeGroupCategory {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter patient ages separated by spaces: ");
                String input = scanner.nextLine();
                String[] ageStrings = input.split(" ");
                int total = 0;
                int childCount = 0;
                int teenCount = 0;
                int adultCount = 0;
                int seniorCount = 0;
                for (String ageStr : ageStrings) {
                    int age = Integer.parseInt(ageStr.trim());
                    total++;
                    if (age >= 0 && age <= 12) {
                        childCount++;
                    } else if (age >= 13 && age <= 19) {
                        teenCount++;
                    } else if (age >= 20 && age <= 59) {
                        adultCount++;
                    } else if (age >= 60) {
                        seniorCount++;
                    }
                }
                double childPercent = (childCount * 100.0) / total;
                double teenPercent = (teenCount * 100.0) / total;
                double adultPercent = (adultCount * 100.0) / total;
                double seniorPercent = (seniorCount * 100.0) / total;
                System.out.println("Total Patients: "+ total);
                System.out.println("Children: "+ childCount + "Percentage: " +childPercent+"%");
                System.out.println("Teens: "+ teenCount+ "Percentage: " + teenPercent+"%");
                System.out.println("Adults: "+ adultCount + "Percentage: " + adultPercent+"%");
                System.out.println("Seniors: "+ seniorCount+ "Percentage: " + seniorPercent+"%");
    }

}
