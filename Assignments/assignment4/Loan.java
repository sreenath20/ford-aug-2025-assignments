package com.assignments.assignment4;

public abstract class Loan {
    public  void calculateEMI(double principal,double rate,int tenureMonths){
        double powerFactor = Math.pow(1+rate/100,tenureMonths);
        double emi = principal*rate/100*(powerFactor/(powerFactor-1));
        System.out.printf("EMI for ₹%.2f is ₹%.2f/month\n",principal,emi);
    }
}
