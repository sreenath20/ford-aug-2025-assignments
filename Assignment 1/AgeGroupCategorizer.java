package Day1;

import java.util.Scanner;

public class AgeGroupCategorizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ages as comma-separated values (e.g., 12,25,67,15): ");
        String line = sc.nextLine();

        String[] tokens = line.split(",");
        int total = 0;
        int child = 0, teen = 0, adult = 0, senior = 0;

        for (String t : tokens) {
            String s = t.trim();
            if (s.isEmpty()) continue;
            int age;
            try {
                age = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Skipping invalid age: " + s);
                continue;
            }
            total++;
            if (age >= 0 && age <= 12) {
                child++;
            } else if (age >= 13 && age <= 19) {
                teen++;
            } else if (age >= 20 && age <= 59) {
                adult++;
            } else {
                senior++;
            }
        }

        if (total == 0) {
            System.out.println("No valid ages entered.");
            sc.close();
            return;
        }

        System.out.println("Total patients: " + total);
        System.out.println("Child (0-12): " + child + " (" + String.format("%.2f", (child * 100.0 / total)) + "%)");
        System.out.println("Teen (13-19): " + teen + " (" + String.format("%.2f", (teen * 100.0 / total)) + "%)");
        System.out.println("Adult (20-59): " + adult + " (" + String.format("%.2f", (adult * 100.0 / total)) + "%)");
        System.out.println("Senior (60+): " + senior + " (" + String.format("%.2f", (senior * 100.0 / total)) + "%)");

        sc.close();
    }
}
