package com.demo.day3;

import java.util.Scanner;

public class Day3 {

    public static void main(String[] args) {

        //Arrays
//        Integer numbers[] = new Integer[10];
//        for(Integer number:numbers){
//
//        }


        //amount user enters that amount should be multiple of 100s
        //sufficient balance
        //wrong withdrawal amount
        //remaining balance

        Scanner sc = new Scanner(System.in);

//        Integer withdrawalamount;
//        System.out.println("Enter the amount you want to withdraw:");
//        withdrawalamount = sc.nextInt();
//
//        Double balance = 60000.25;
//
//        if(withdrawalamount > 0) {
//            if(withdrawalamount%100==0) {
//                if(balance>=withdrawalamount) {
//                    balance -= withdrawalamount;
//                    System.out.println("WITHDRAWAL SUCCESSFUL !!! REMAINING BALANCE : "+balance);
//                }
//                else {
//                    System.out.println("WITHDRAWAL FAILED -> INSUFFICIENT BALANCE : "+balance);
//                }
//            }
//            else{
//                System.out.println("WITHDRAWAL FAILED -> WITHDRAWAL AMOUNT SHOULD BE IN MULTIPLES OF 100");
//            }
//        }
//        else{
//            System.out.println("WITHDRAWAL FAILED -> WITHDRAWAL AMOUNT CANNOT BE LESS THAN OR EQUAL TO 0");
//        }

        // fare for cab app like uber
        // base price is 50rs
        // 10rs/km for first 5 kms
        // 8rs/km for distance beyond 5 kms
        //calculate the total fare

//        Double distance = 5.3;
//        Double basePrice = 50.0;
//        Double totalprice = 0.0;
//        Double baseonerate = 10.0;
//        Double basetworate = 8.0;
//
//        totalprice += basePrice;
//
//        if(distance <=5 && distance >=1){
//            totalprice+= baseonerate*(distance);
//        }
//        else if(distance > 5){
//            totalprice+= baseonerate*5;
//            totalprice+= basetworate*(distance-5) ;
//        }
//        else{
//            System.out.println("Invalid Distance");
//        }
//
//        System.out.println("TOTAL PRICE : "+totalprice);

        //PRINTING TABLES
//        Integer startingtablenumber =0, endingtablenumber=0;
//
//        System.out.println("Enter the starting table number : ");
//        startingtablenumber = sc.nextInt();
//        System.out.println("Enter the ending table number : ");
//        endingtablenumber = sc.nextInt();
//
//        System.out.println("----------------------------");
//        for(int i=startingtablenumber; i<=endingtablenumber; i++){
//            System.out.println(i+" TABLE");
//            for(int j=1;j<=10;j++){
//                System.out.println(i+"*"+j+"="+i*j);
//            }
//            System.out.println("----------------------------");
//        }



        //CREATION AND PRINTING OF ARRAY
//        System.out.println("Enter the number of subjects :");
//        int n = sc.nextInt();
//        Double numbers[] = new Double[n];
//        Double totalmarks=0.0;
//
//        for(int i=0;i<n;i++){
//            System.out.println("Enter subject "+(i+1)+" marks :");
//            numbers[i] = sc.nextDouble();
//            totalmarks+=numbers[i];
//        }
//
//        System.out.println("MARKS OF SUBJECTS ");
//        for(Double mark:numbers){
//            System.out.print(mark+" ");
//        }
//        System.out.println();
//
//        Double markspercentage =Math.round((totalmarks/(n*100))*10000)/100.0;
//        System.out.println("PERCENTAGE OF THE STUDENT IS : "+markspercentage+"%");


        //TEMPERATURE MONITOR
        //STORE TEMP OF CITIES FOR N DAYS
        //FIND DAYS WHEN TEMP EXCEEDS > 40 DEGREE
        System.out.println("Enter the number of days");
        int noofdays = sc.nextInt();
        Double temperatures[] = new Double[noofdays];
        int dayscount=0,colderdayscount=0;
        Double totaltemperature=0.0;

        for(int i=0;i<noofdays;i++){
            System.out.println("Enter day "+(i+1)+" temperature :");
            temperatures[i] = sc.nextDouble();
            totaltemperature+=temperatures[i];
        }

        Double averagetemperature=totaltemperature/(double)noofdays;

        for(int i=0;i<noofdays;i++){
            if(temperatures[i]>40){
                dayscount++;
            }

            if(temperatures[i]<averagetemperature){
                colderdayscount++;
            }
        }

        System.out.println("Days exceeding 40 Degree : "+dayscount);
        System.out.println("The average temperature is : "+averagetemperature);
        System.out.println("Colder Days : "+colderdayscount);



    }
}
