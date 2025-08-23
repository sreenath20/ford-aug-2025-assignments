package com.assignment2_loopandswitch;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int childCount = 0;
        int teenCount = 0;
        int adultCount = 0;
        int seniorCount = 0;
        int totalPatients = 0;

        System.out.println("Healthcare Analytics Dashboard - Age Group Categorization");
        System.out.println("========================================");

        System.out.print("Enter the number of patients: ");
        String totalPatientsInput = input.nextLine();
        totalPatients = Integer.parseInt(totalPatientsInput);

        for (int i = 1; i <= totalPatients; i++) {
            System.out.print("Enter age of patient " + i + ": ");
            String ageInput = input.nextLine();

            Integer patientAge = Integer.parseInt(ageInput);

            if (patientAge >= 0 && patientAge <= 12) {
                childCount++;
            } else if (patientAge >= 13 && patientAge <= 19) {
                teenCount++;
            } else if (patientAge >= 20 && patientAge <= 64) {
                adultCount++;
            } else if (patientAge >= 65) {
                seniorCount++;
            }
        }

        Double childPercentage = 0.0;
        Double teenPercentage = 0.0;
        Double adultPercentage = 0.0;
        Double seniorPercentage = 0.0;

        if (totalPatients > 0) {
            childPercentage = (double) childCount / totalPatients * 100.0;
            teenPercentage = (double) teenCount / totalPatients * 100.0;
            adultPercentage = (double) adultCount / totalPatients * 100.0;
            seniorPercentage = (double) seniorCount / totalPatients * 100.0;
        }

        System.out.println("\n========================================");
        System.out.println("RESULTS");
        System.out.println("========================================");

        System.out.println("Total Patients: " + totalPatients);

        System.out.println("\nAge Group Distribution:");
        System.out.println("Children (0-12): " + childCount + " (" + String.format("%.1f", childPercentage) + "%)");
        System.out.println("Teenagers (13-19): " + teenCount + " (" + String.format("%.1f", teenPercentage) + "%)");
        System.out.println("Adults (20-64): " + adultCount + " (" + String.format("%.1f", adultPercentage) + "%)");
        System.out.println("Seniors (65+): " + seniorCount + " (" + String.format("%.1f", seniorPercentage) + "%)");

        String dominantGroup = "Children";
        int maxCount = childCount;

        if (teenCount > maxCount) {
            dominantGroup = "Teenagers";
            maxCount = teenCount;
        }
        if (adultCount > maxCount) {
            dominantGroup = "Adults";
            maxCount = adultCount;
        }
        if (seniorCount > maxCount) {
            dominantGroup = "Seniors";
            maxCount = seniorCount;
        }

        System.out.println("\nDominant Age Group: " + dominantGroup + " (" + maxCount + " patients)");

        input.close();
    }
}
