package com.assignment.day2;

public class Day2Assignment {

    public static void main(String[] args) {

        //Assignment 1: EMI Calculator for a Banking Application
        System.out.println("-------------");
        System.out.println("ASSIGNMENT 1");
        Double principal = 100000.00;
        Float interestrate = 0.67f; // 8% / 12 =
        Integer tenure = 60; // 5 years * 12
        Double emi = (principal*interestrate* Math.pow(1+interestrate,tenure))/Math.pow(1+interestrate,tenure-1);
        Double total = emi+principal;
        System.out.println("TOTAL AMOUNT : "+Math.round(total*100)/100.0);
        System.out.println("TOTAL EMI : "+Math.round(emi*100)/100.0);

        //Assignment 2: IoT Sensor Data Normalization
        //8 4 2 1
        //0 0 1 0
        //0 0 0 1
        //0 0 1 1
        //    m l
        System.out.println("-------------");
        System.out.println("ASSIGNMENT 2");
        byte sensor = 0b0010;
        byte lightbit = (byte) (sensor & 1);
        byte motionbit = (byte) ((sensor >> 1) & 1);

        boolean isLightOn = (lightbit == 0 && motionbit == 1) ? true : false;
        Integer sensor1 = (Integer) (sensor | 1);
        System.out.println("TURN ON LIGHT : "+isLightOn);
        System.out.println("SENSOR : "+Integer.toBinaryString(sensor1));

        //Assignment 3: E-Commerce Price Comparison Engine
        System.out.println("-------------");
        System.out.println("ASSIGNMENT 3");
        String product = "Samsung Galaxy M34 5G (8GB RAM + 128GB storage) ";
        Double Amazon_India = 19999.0;
        Double Flipkart = 22999.0;
        Double Croma = 21999.0;

        String lowestprice = (Amazon_India<Flipkart && Amazon_India<Croma) ? "Amazon_India" : (Flipkart<Amazon_India && Flipkart<Croma) ? "Flipkart" :  "Croma";
        String highestprice = (Amazon_India>Flipkart && Amazon_India>Croma) ? "Amazon_India" : (Flipkart>Amazon_India && Flipkart>Croma) ? "Flipkart" : "Croma";

        System.out.println("BEST DEAL : "+lowestprice);
        System.out.println("HIGHEST PRICE : "+highestprice);
        Double pricedifference = ((Flipkart-Amazon_India)/Flipkart)*100;
        Double pricedifferencepercentage = Math.round(pricedifference*100)/100.0;
        System.out.println("PRICE DIFFERENCE PERCENTAGE : "+pricedifferencepercentage+"%");

        //Assignment 4: Employee Salary Tax Estimator
        System.out.println("-------------");
        System.out.println("ASSIGNMENT 4");
        Double monthlysalary = 50000.25;
        Integer taxpercent;
        Double totaltax=0.0,netsalary=0.0;
        Double annualsalary = monthlysalary * 12;

        if(annualsalary<400000){
            taxpercent = 0;
            totaltax = taxpercent*annualsalary;
        }
        else if(annualsalary>400000 && annualsalary<600000){
            taxpercent = 4;
            totaltax = (taxpercent*(annualsalary-400000))/100;
            totaltax += 0;
        }
        else if(annualsalary>600000 && annualsalary<800000){
            taxpercent = 6;
            totaltax = (taxpercent*(annualsalary-600000))/100;
            totaltax += (4*200000)/100;
            totaltax += 0;
        }
        else if(annualsalary>800000 && annualsalary<1200000){
            taxpercent = 8;
            totaltax = (taxpercent*(annualsalary-800000))/100;
            totaltax += (6*200000)/100;
            totaltax += (4*200000)/100;
            totaltax += 0;
        }
        else if(annualsalary>1200000){
            taxpercent = 12;
            totaltax = (taxpercent*(annualsalary-1200000))/100;
            totaltax += (6*400000)/100;
            totaltax += (6*200000)/100;
            totaltax += (4*200000)/100;
            totaltax += 0;
        }

        netsalary = annualsalary - totaltax;

        System.out.println("TOTAL ANNUAL SALARY : "+annualsalary);
        System.out.println("TOTAL TAX : "+totaltax);
        System.out.println("TOTAL NET SALARY "+netsalary);

        //Assignment 5: Analytics Dashboard — Age Group Categorization
        System.out.println("-------------");
        System.out.println("ASSIGNMENT 5");
        String patients[] = {"10","20","25","30","40","50","60","70","80","90","100"};
        int childcount=0,teencount=0,adultcount=0,seniorcount=0;
        int totalcount= patients.length;
        System.out.println("TOTAL GROUP SIZE : "+totalcount);
        Double childcountpercentage,teencountpercentage,adultcountpercentage,seniorcountpercentage;

        for(String patientage:patients){
            if(Integer.parseInt(patientage)<=10){
                childcount++;
            }
            else if(Integer.parseInt(patientage)<=20){
                teencount++;
            }
            else if(Integer.parseInt(patientage)<=60){
                adultcount++;
            }
            else if(Integer.parseInt(patientage)>60 && Integer.parseInt(patientage)<=100) {
                seniorcount++;
            }
        }

        childcountpercentage =  Math.round(((double) childcount/ (double) totalcount)*10000)/100.0;
        teencountpercentage = Math.round(((double) teencount/ (double) totalcount)*10000)/100.0;
        adultcountpercentage = Math.round(((double) adultcount/ (double) totalcount)*10000)/100.0;
        seniorcountpercentage = Math.round(((double) seniorcount/ (double) totalcount)*10000)/100.0;

        System.out.println("GROUP SIZES");
        System.out.println("CHILD GROUP SIZE : "+childcount);
        System.out.println("CHILD GROUP PERCENTAGE : "+childcountpercentage+"%");
        System.out.println("TEEN GROUP SIZE : "+teencount);
        System.out.println("TEEN GROUP PERCENTAGE : "+teencountpercentage+"%");
        System.out.println("ADULT GROUP SIZE : "+adultcount);
        System.out.println("ADULT  GROUP PERCENTAGE : "+adultcountpercentage+"%");
        System.out.println("SENIOR GROUP SIZE : "+seniorcount);
        System.out.println("SENIOR GROUP PERCENTAGE : "+seniorcountpercentage+"%");

    }
}

