package com.harini.assignment1;

import java.util.Scanner;

public class SalaryEstimation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Salary per month: ");
        Integer month = Integer.parseInt(input.nextLine());
        Integer annualSalary = (month*12);
        Integer taxableSalary = annualSalary - 75000;
        Double tax= 0.0;
        System.out.println("Annual Salary: "+annualSalary);
        if(taxableSalary>400000){
            if(taxableSalary>=800000){
            tax+= (400000 * 0.05);
            }
            else{
                tax+= (taxableSalary - 400000)*0.05;
            }
        }
        System.out.println("Tax: "+tax);
        if(taxableSalary>800000){
            if(taxableSalary>=1200000){
                tax+= (400000 * 0.1);
            }
            else{
                tax+= (taxableSalary - 800000)*0.1;
            }
        }
        System.out.println("Tax: "+tax);
        if(taxableSalary>1200000){
            if(taxableSalary>=1600000){
                tax+= (400000 * 0.15);
            }
            else{
                tax+= (taxableSalary - 1200000)*0.15;
            }
        }
        System.out.println("Tax: "+tax);
        if(taxableSalary>1600000){
            if(taxableSalary>=2000000){
                tax+= (400000 * 0.2);
            }
            else{
                tax+= (taxableSalary - 1600000)*0.2;
            }
        }
        System.out.println("Tax: "+tax);
        if(taxableSalary>2000000){
            if(taxableSalary>=2400000){
                tax+= (400000 * 0.25);
            }
            else{
                tax+= (taxableSalary - 2000000)*0.25;
            }
        }
        System.out.println("Tax: "+tax);
        if(taxableSalary>2400000){
            tax+= (taxableSalary - 24000000)*0.3;
        }
        System.out.println("Tax: "+tax);
        Double actualSalary = (annualSalary-tax);
        System.out.println("Salary: "+actualSalary);
    }
}
