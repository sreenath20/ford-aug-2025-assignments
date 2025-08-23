package com.assignment1_wrapperclass;

import java.util.*;

public class Assignment1 {
    public static void main(String[] args ) {
        Double Principle;
        Float RateOfInterest;
        Integer Tenure;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principle amount");
        Principle=input.nextDouble();
        System.out.println("Enter the rate of interest");
        RateOfInterest=input.nextFloat();
        RateOfInterest=( RateOfInterest/100/12);
        System.out.println("Enter the Tenure");
        Tenure=input.nextInt();
        int totalMonth =Tenure*12;
        double powValue= Math.pow((1+RateOfInterest), totalMonth);
        Double EMI=(Principle*RateOfInterest*powValue);
        EMI=EMI/(powValue-1);
        System.out.println(EMI);
        System.out.printf(" EMI is %.2f%n", EMI);
        Double totalAmount=EMI*totalMonth;
        System.out.printf("Total amount to be paid is %.2f%n", totalAmount);



    }
}
