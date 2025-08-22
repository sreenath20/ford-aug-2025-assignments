package com.ford.assignment1;
import java.util.Scanner;

public class EMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal amount : ");
        Double principal=sc.nextDouble();
        System.out.print("Enter Annual Interest Rate: ");
        Float annualInterest = sc.nextFloat();
        System.out.print("Enter Tenure: ");
        Integer tenureYears = sc.nextInt();


        double monthlyInterest = annualInterest / (12 * 100);
        int totalMonths = tenureYears * 12;

        double emi = (principal * monthlyInterest * Math.pow(1 + monthlyInterest, totalMonths)) /
                (Math.pow(1 + monthlyInterest, totalMonths) - 1);

        double totalPayment = emi * totalMonths;

        System.out.println("EMI: "+emi);
        System.out.println("Total Payment:"+ totalPayment);


    }
}
