package Assignment1;

import java.util.Scanner;

public class EmployeeTaxEstimator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Monthly Salary: ");
        double monthlySalary = sc.nextDouble();
        double annualSalary = monthlySalary * 12;
        double tax = 0;
        if (annualSalary <= 250000) {
            tax = 0;
        } else if (annualSalary <= 500000) {
            tax = annualSalary * 0.05;
        } else if (annualSalary <= 1000000) {
            tax = annualSalary * 0.20;
        } else {
            tax = annualSalary * 0.30;
        }

        double netSalary = annualSalary - tax;

        System.out.println("--- Salary Report ---");
        System.out.println("Annual Salary: " + annualSalary);
        System.out.println("Tax Deducted: " + tax);
        System.out.println("Net Salary after Tax: " + netSalary);
    }
}

