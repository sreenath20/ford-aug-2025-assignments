package com.harini.assignment2;

public class TaxCalculator {
    public static void main(String[] args) {
        double[] income = {200000,300000,500000,800000,1200000};
        for(double in:income){
            double tax=0;
            int taxPercentage=0;
            if(in<=250000){
                tax=0;
                taxPercentage=0;
            }
            else if(in>250000 && in<=500000){
                taxPercentage=5;
                tax= in*0.05;
            }
            else if(in>500000 && in<=1000000){
                taxPercentage=20;
                tax = in*0.2;
            }
            else{
                taxPercentage=30;
                tax = in*0.3;
            }
            System.out.println("Tax for "+in+" is "+taxPercentage+"% and the tax amount is "+tax);
        }
    }


}
