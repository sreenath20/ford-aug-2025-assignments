package Day1;

import java.util.Scanner;

public class SalaryTaxEstimator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter monthly salary (e.g., 40000): ");
        double monthly = Double.valueOf(sc.nextLine());

        double annual = monthly * 12;
        double tax = 0.0;


        double remaining = annual;

        if (annual <= 250000) {
            tax += 0;
        } else {
            if (annual > 250000) {
                double slab = Math.min(annual, 500000) - 250000;
                if (slab > 0) tax += slab * 0.05;
            }
            if (annual > 500000) {
                double slab = Math.min(annual, 1000000) - 500000;
                if (slab > 0) tax += slab * 0.20;
            }
            if (annual > 1000000) {
                double slab = annual - 1000000;
                if (slab > 0) tax += slab * 0.30;
            }
        }

        double netAnnual = annual - tax;

        System.out.printf("Annual Salary: %.2f%n", annual);
        System.out.printf("Tax: %.2f%n", tax);
        System.out.printf("Net Annual Salary: %.2f%n", netAnnual);
        System.out.printf("Net Monthly Salary: %.2f%n", netAnnual / 12.0);

        sc.close();
    }
}
