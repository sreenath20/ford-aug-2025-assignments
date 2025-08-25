package assignment_01;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Assignment 4: Employee Salary Tax Estimator
        /*Calculate annual salary and apply tax slabs based on input monthly salary. Use compound
operators (+=, -=) and type casting as needed. Parse input using wrapper methods. Output tax,
annual and net salary.*/

        System.out.println("##########    Employee Salary Tax Estimator    ##########\n");
        System.out.println("Enter your Monthly Salary: ");
        Double monthlySalary=sc.nextDouble();
        if(monthlySalary<=0){
            System.out.println("Invalid Monthly Salary. Please enter a valid Monthly Salary");
        }
        System.out.println("\n Please note that this TAX ESTIMATOR is only for people under New Tax Regime \n");
        Double annualSalary= monthlySalary*12;
        Double annualTax=0.0;
        Double netSalary=0.0;
        if (annualSalary>1500000){
            annualTax=annualSalary*0.3;
        }
        else if (annualSalary<=1500000 && annualSalary>1250000){
            annualTax=annualSalary*0.2;

        }
        else if (annualSalary<=1250000 && annualSalary>1000000){
            annualTax=annualSalary*0.25;

        }
        else if (annualSalary<=1000000 && annualSalary>750000){
            annualTax=annualSalary*0.15;

        }
        else if (annualSalary<=750000 && annualSalary>500000){
            annualTax=annualSalary*0.1;

        }
        else if (annualSalary<=500000 && annualSalary>250000){
            annualTax=annualSalary*0.05;

        }
        else{
            System.out.println("You are under NO TAX Slab.");
            System.out.println("Annual Salary = Net Salary = "+ annualSalary);
        }
        netSalary=annualSalary-annualTax;
        System.out.println("Annual Salary: "+annualSalary);
        System.out.println("Annual Tax: "+annualTax);
        System.out.println("Net Salary: "+netSalary);

    }
}
