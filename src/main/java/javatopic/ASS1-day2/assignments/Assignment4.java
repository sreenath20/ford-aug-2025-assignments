package javatopic.day2.assignments;

import java.util.Scanner;
public class Assignment4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // 1. Take monthly salary input using wrapper method
            System.out.print("Enter your monthly salary: ");
            double monthlySalary = Double.parseDouble(scanner.nextLine());

            // 2. Calculate annual salary using compound operator
            double annualSalary = 0;
            annualSalary += monthlySalary * 12;

            // 3. Initialize tax
            double tax = 0;

            // 4. Apply tax slab using comparison
            if (annualSalary <= 250000) {
                tax = 0;
            } else if (annualSalary <= 500000) {
                tax = (annualSalary - 250000) * 0.05;
            } else if (annualSalary <= 1000000) {
                tax = (250000 * 0.05) + (annualSalary - 500000) * 0.10;
            } else {
                tax = (250000 * 0.05) + (500000 * 0.10) + (annualSalary - 1000000) * 0.20;
            }

            // 5. Calculate net salary
            double netSalary = annualSalary;
            netSalary -= tax;  // using compound operator

            // 6. Output results
            System.out.println("\n----- Salary Tax Estimator -----");
            System.out.printf("Monthly Salary: ₹%.2f\n", monthlySalary);
            System.out.printf("Annual Salary: ₹%.2f\n", annualSalary);
            System.out.printf("Tax Deducted: ₹%.2f\n", tax);
            System.out.printf("Net Salary after Tax: ₹%.2f\n", netSalary);

            scanner.close();
        }
    }

