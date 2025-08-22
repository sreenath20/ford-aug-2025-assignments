package com.ford.assignment1;

import java.util.Scanner;

public class SalaryTaxEstimator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter monthly salary: ");
        double monthlySalary= sc.nextDouble();



        double annualSalary = monthlySalary * 12;
        double tax = 0.0;


        double salaryInLakhs = annualSalary / 100000;

        if (salaryInLakhs <= 2.5) {
            tax += 0;
        } else if (salaryInLakhs <= 5) {
            tax += (annualSalary - 250000) * 0.05;
        } else if (salaryInLakhs <= 10) {
            tax += 250000 * 0.05;
            tax += (annualSalary - 500000) * 0.20;
        } else {
            tax += 250000 * 0.05;
            tax += 500000 * 0.20;
            tax += (annualSalary - 1000000) * 0.30;
        }

        double netSalary = annualSalary - tax;

        System.out.println("Annual Salary:"+ annualSalary);
        System.out.println("Tax Deducted: "+ tax);
        System.out.println("Net Salary: "+ netSalary);


    }
}

