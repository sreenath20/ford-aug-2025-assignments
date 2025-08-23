package com.assignment1_wrapperclass;

import java.util.*;
public class Assignment4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the monthy salary");
        Double monthlySalary = input.nextDouble();
        Integer tax = 0;
        if (monthlySalary < 50000.00) {
            tax = 0;
        } else if (monthlySalary >= 50000.00 && monthlySalary <= 100000.00) {
            tax = 10;
        } else if (monthlySalary > 100000.00) {
            tax = 15;
        }
        Double taxAmount = (monthlySalary * tax) / 100;
        Double TotalTaxAmount = 0.0;
        Double annualNetSalary = 0.0;
        Double annualsalary = 0.0;
        for (short i = 0; i < 12; i++) {
            TotalTaxAmount += taxAmount;
            annualsalary += monthlySalary;
            annualNetSalary += (monthlySalary - taxAmount);
        }
        System.out.println("Annual Net Salary: " + annualNetSalary);
        System.out.println("Total Tax Amount: " + TotalTaxAmount);
        System.out.println("Annual Salary: " + annualsalary);
        System.out.println("Tax Percentage: " + tax + "%");
        System.out.printf("Monthly Salary: %.2f%n", monthlySalary);
    }
}
