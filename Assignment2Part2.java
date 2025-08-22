package com.assignments;

import java.util.Scanner;

public class Assignment2Part2{
    Scanner sc = new Scanner(System.in);

    void OrderDeliveryTracker(){
        char[] statusCodes = {'P','C','D','F','D','C','D','F','D','P'};
        int pending = 0, cancelled = 0, delivered = 0, failed = 0;

        for(char statusCode : statusCodes){
            switch(statusCode){
                case 'P':
                    pending++;
                    break;
                case 'C':
                    cancelled++;
                    break;
                case 'D':
                    delivered++;
                    break;
                case 'F':
                    failed++;
                    break;
            }
        }
        System.out.println("Pendind Order : "+pending);
        System.out.println("Cancelled Order : "+cancelled);
        System.out.println("Delivered Order : "+delivered);
        System.out.println("Failed Order : "+failed);
    }

    void UserAccessLevelManagement(){

        boolean exit = false;
        while (!exit){
            System.out.print("Choose : \n ->A - Admin\n ->M - Manager\n ->V - Viewer\n ->E - Exit \n----->");
            char choice = sc.next().charAt(0);
            switch (choice){
                case 'A':
                    System.out.println("Admin can manage users and settings.");
                    break;
                case 'M':
                    System.out.println("Manager can generate reports and approve requests.");
                    break;
                case 'V':
                    System.out.println("Viewer has read-only access.");
                    break;
                case 'E':
                    System.out.println("Exit Program.");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }

    void TollBoothBillingSystem(){

        String[] vehicles = {"Car","Bus","Truck","Bike","Car"};

        Integer carPrice = 100,busPrice = 200,truckPrice = 250,bikePrice = 50;
        Integer carCount = 0,busCount = 0,truckCount = 0,bikeCount = 0;
        int totalCollection = 0;
        for(String vehicle : vehicles){
            switch(vehicle){
                case "Car":
                    carCount++;
                    totalCollection += carPrice;
                    break;
                case "Bike":
                    bikeCount++;
                    totalCollection += bikePrice;
                    break;
                case "Bus":
                    busCount++;
                    totalCollection += busPrice;
                    break;
                case "Truck":
                    truckCount++;
                    totalCollection += truckPrice;
                    break;
            }
        }
        System.out.println("Total Collection : ₹"+totalCollection);
        System.out.println("Car : "+carCount);
        System.out.println("Truck : "+truckCount);
        System.out.println("Bike : "+bikeCount);
        System.out.println("Bus : "+busCount);
    }

    void EmployeeAttendanceSummary(){
        char[][] attendance = {
                {'P','P','A','P','L','P','P'},
                {'P','A','A','P','P','P','L'},
                {'P','P','P','P','P','P','P'}
        };
        for(int i = 0; i < attendance.length; i++){
            int presentCount = 0,absentCount = 0,leaveCount = 0;
            for(int j = 0; j < attendance[i].length; j++){
                switch(attendance[i][j]){
                    case 'P':
                        presentCount++;
                        break;
                    case 'A':
                        absentCount++;
                        break;
                    case 'L':
                        leaveCount++;
                        break;
                }
            }
            System.out.println("Employee "+(i+1)+"->P:"+presentCount+" A:"+absentCount+" L:"+leaveCount);
        }
    }
    void TaxBracketCalculator(){
        Double[] salaries = {200000.0,400000.0,700000.0,1200000.0,-10000.0};
        for(double salary : salaries){
            System.out.println("Income : \u20b9"+salary);
            double tax = 0.0;
            if(salary < 0) System.out.println("Invalid(-ve) Employee Salary...");
            else if (salary < 2_50_000){
                tax = 0.0;
                System.out.println("Tax % : 0%");

            }
            else if(salary < 5_00_000){
                System.out.println("Tax % : 5%");
                double taxableAmount = salary - 2_50_000;
                tax = taxableAmount * 0.05;
            }
            else if(salary < 10_000_000){
                System.out.println("Tax % : 20%");
                double taxableAmount = salary - 5_00_000;
                tax = taxableAmount * 0.20;
                tax += 2_50_000 * 0.05;
            }
            else{
                System.out.println("Tax % : 30%");
                tax = 2_50_000 * 0.05 +  5_000_000 * 0.20;
                double taxableAmount = salary - 10_00_000;
                tax = taxableAmount * 0.30;
            }
            System.out.println("Tax amount : \u20b9"+tax+"\n");
        }
    }
}