package com.fullstackabi.assignment.Assign1;
// Concepts: Primitive data types, arithmetic operators, type casting, wrapper classes
// Design a Java program to calculate the Equated Monthly Installment (EMI) for a loan. Input:
// Principal (double), Interest rate (float), Tenure (int in years) Formula: EMI = [P × R × (1+R)^N] /
//[(1+R)^N - 1] Use wrapper classes for input parsing and apply correct arithmetic and type
// conversion. Print EMI and total payment rounded to 2 decimals

import java.text.DecimalFormat;
import java.util.Scanner;

public class Assign1EMICalc {
    public static void main(String[] args) {
        System.out.println("EMI Calculator");
        Scanner scan = new Scanner(System.in);
        // Getting the Input from console. (Wrapper Classes)
        System.out.println("Enter the Principal Amount ");
        Double principal = scan.nextDouble();

        System.out.println("Enter the Interest Rate");
        Float interestRateIp = scan.nextFloat();

        System.out.println("Enter the Tenure in Years");
        Integer tenureIp = scan.nextInt();

        //Formula: EMI = [P × R × (1+R)^N] /[(1+R)^N - 1]
        System.out.println("EMI Calculation for the loan");
        // Typecasting (Widening)
        // Converting Interest Rate for monthly and Tenure from Years to Months
        double interestRate = (interestRateIp / 100) / 12;
        double tenureMonths = tenureIp * 12;
        double intRatePlusOne = interestRate + 1;

        // 1 + R power of N calculation logic (Second Formula Part)
        double powerIntTenure = Math.pow(intRatePlusOne, tenureMonths);
        double secondLogic = powerIntTenure / (powerIntTenure - 1 );

        // Final EMI formula.
        double emi  = principal * interestRate *  secondLogic;

        // Round off the Emi Value
        DecimalFormat df = new DecimalFormat("0.00");

        // Print the EMI
        System.out.println("Monthly EMI for the loan is " + df.format(emi));
    }

}
