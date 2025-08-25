package assignment_01;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Assignment 1: EMI Calculator for a Banking Application
        /*Design a Java program to calculate the Equated Monthly Installment (EMI) for a loan. Input:
Principal (double), Interest rate (float), Tenure (int in years) Formula: EMI = [P × R × (1+R)^N] /
[(1+R)^N - 1] Use wrapper classes for input parsing and apply correct arithmetic and type
conversion. Print EMI and total payment rounded to 2 decimals.*/

        System.out.println("##########    EMI Calculator for a Banking Application    ##########\n");
        System.out.print("Please enter the Principle Amount: ");
        Double principal = sc.nextDouble();
        System.out.print("Please enter the Rate of Interest(per month): ");
        Float rate = sc.nextFloat();
        System.out.print("Please enter the Tenure(in months): ");
        Integer tenure = sc.nextInt();
        double emi = (principal * rate * Math.pow((1 + rate), tenure)) / (Math.pow((1 + rate), tenure) - 1);
        System.out.println("\nYour Principle Amount: " + ((principal * 100) / 100.0));
        System.out.printf("Your Total EMI: %.2f",((emi * 100) / 100.0));
        Double totalPay = principal + emi;
        System.out.printf("\nYour Total Payment: %.2f", ((totalPay * 100) / 100.0));
    }
}
