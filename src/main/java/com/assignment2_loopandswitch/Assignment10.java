package com.assignment2_loopandswitch;

import java.util.*;
public class Assignment10 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter number of user: ");
        int user=input.nextInt();
        Double[] income=new Double[user];
        Double[] tax=new Double[user];
        Double[] netincome=new Double[user];
        Double[] taxamount=new Double[user];
        for(int i=0;i<user;i++) {
            System.out.print("Enter income: ");
            income[i]=input.nextDouble();

            if(income[i]<=250000) {
                tax[i]=0.0;
                taxamount[i]=(income[i]*(tax[i]/100));
                netincome[i]=income[i]-taxamount[i];
            }
            else if(income[i]>250000 && income[i]<=500000) {
                tax[i]=5.0;
                taxamount[i]=(income[i]*(tax[i]/100));
                netincome[i]=income[i]-taxamount[i];
            }
            else if(income[i]>500000 && income[i]<=1000000) {
                tax[i]=20.0;
                taxamount[i]=(income[i]*(tax[i]/100));
                netincome[i]=income[i]-taxamount[i];
            }
            else {
                tax[i]=30.0;
                taxamount[i]=(income[i]*(tax[i]/100));
                netincome[i]=income[i]-taxamount[i];
            }
        }
        for(int i=0;i<user;i++) {
            System.out.println("User : "+(i+1));
            System.out.println("income : "+ income[i]);
            System.out.println("tax : "+tax[i]);
            System.out.println("Tax Amount : "+taxamount[i]);
            System.out.println("netincome : "+netincome[i]);
            System.out.println("------------------------------ ");
        }

    }
}
