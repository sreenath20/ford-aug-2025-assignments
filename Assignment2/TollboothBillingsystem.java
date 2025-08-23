package Assignment2;

import java.util.Scanner;

public class TollboothBillingsystem {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String[] vehicles=new String[5];
        System.out.println("Enter the Vehicle Name");
        for(int i=0;i<5;i++)
        {
           vehicles[i]=sc.nextLine();
        }
        int totalCollection=0,carCollection=0,truckCollection=0,bikeCollection=0,busCollection=0;
        int cars=0,bikes=0,trucks=0,buses=0;
        for(String vehicle:vehicles)
        {
            switch (vehicle)
            {
                case "car":
                    carCollection+=100;
                    totalCollection+=100;
                    cars+=1;
                    break;
                case "bike":
                    bikeCollection+=50;
                    totalCollection+=50;
                    bikes+=1;
                    break;
                case "bus":
                    busCollection+=200;
                    totalCollection+=200;
                    buses+=1;
                    break;
                case "truck":
                    truckCollection+=250;
                    totalCollection+=250;
                    trucks+=1;
                    break;
            }
        }
        System.out.println("Total Car Collections: "+totalCollection);
        System.out.println("----------------------------------------");
        System.out.println("Number of Each Vehicle type");
        System.out.println("Total Number of Cars "+cars);
        System.out.println("Total Number of Bikes "+bikes);
        System.out.println("Total Number of Trucks "+trucks);
        System.out.println("Total Number of Buses "+buses);

    }
}
