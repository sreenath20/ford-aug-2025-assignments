package com.assignment.day3;

import java.util.Scanner;

public class Day3Assignment {

    public static void main(String[] args) {

        //Assignment 6: Order Delivery Tracker
        System.out.println("ASSIGNMENT 6: Order Delivery Tracker");
        System.out.println("--------------------------------------");
        String orders[]={"P", "D", "C", "F", "P", "D", "C", "F","P", "D", "C"};
        int orderno=0,porderscount=0,dorderscount=0,corderscount=0,forderscount=0;
        for(String order : orders) {
            switch(order) {
                case "P":
                    System.out.println("Order"+orderno+" : "+"Order is Pending");
                    orderno++;
                    porderscount++;
                    break;
                case "D":
                    System.out.println("Order"+orderno+" : "+"Order is Delivered");
                    orderno++;
                    dorderscount++;
                    break;
                case "C":
                    System.out.println("Order"+orderno+" : "+"Order is Cancelled");
                    orderno++;
                    corderscount++;
                    break;
                case "F":
                    System.out.println("Order"+orderno+" : "+"Order is Failed");
                    orderno++;
                    forderscount++;
                    break;
                default:
                    System.out.println("Unknown Order Status");
            }
        }

        System.out.println("Total Pending Orders: " + porderscount);
        System.out.println("Total Delivered Orders: " + dorderscount);
        System.out.println("Total Cancelled Orders: " + corderscount);
        System.out.println("Total Failed Orders: " + forderscount);
        System.out.println("Total Orders Processed: " + orderno);
        System.out.println("--------------------------------------");

        //Assignment 7: User Access Level Management
        System.out.println("ASSIGNMENT 7: User Access Level Management");
        System.out.println("--------------------------------------");

        while(true){
            System.out.println("Enter User Role (Admin, Manager, Viewer) or Exit to quit:");
            Scanner sc = new Scanner(System.in);
            String userRole = sc.nextLine();

            if(userRole.equalsIgnoreCase("Exit")) {
                System.out.println("Exiting the program.");
                break;
            }

            switch(userRole) {
                case "Admin":
                    System.out.println("Access Level: Can manage users and settings");
                    break;
                case "Manager":
                    System.out.println("Access Level: Can generate reports and approve requests");
                    break;
                case "Viewer":
                    System.out.println("Access Level: Read-only access");
                    break;
                default:
                    System.out.println("Invalid User Role. Please try again.");
            }
        }

        System.out.println("--------------------------------------");

        //Assignment 8: Toll Booth Billing System
        System.out.println("ASSIGNMENT 8: Toll Booth Billing System");
        System.out.println("--------------------------------------");
        String vehicles[]={"Car", "Truck", "Bike", "Car", "Bus"};
        int carcount=0, truckcount=0, bikecount=0, buscount=0;
        Double totalTollFee = 0.0;

        for(String vehicle : vehicles) {
            switch(vehicle) {
                case "Car":
                    System.out.println("Vehicle Type: " + vehicle + " - Toll Fee: 100.00");
                    carcount++;
                    totalTollFee += 100.00;
                    break;
                case "Truck":
                    System.out.println("Vehicle Type: " + vehicle + " - Toll Fee: 250.00");
                    truckcount++;
                    totalTollFee += 250.00;
                    break;
                case "Bike":
                    System.out.println("Vehicle Type: " + vehicle + " - Toll Fee: 50.00");
                    bikecount++;
                    totalTollFee += 50.00;
                    break;
                case "Bus":
                    System.out.println("Vehicle Type: " + vehicle + " - Toll Fee: 200.00");
                    buscount++;
                    totalTollFee += 200.00;
                    break;
                default:
                    System.out.println("Unknown Vehicle Type");
            }
        }

        System.out.println("Total Cars: " + carcount);
        System.out.println("Total Trucks: " + truckcount);
        System.out.println("Total Bikes: " + bikecount);
        System.out.println("Total Buses: " + buscount);
        System.out.println("Total Toll Fee Collected: " + totalTollFee);
        System.out.println("--------------------------------------");

        //Assignment 9: Employee Attendance Summary

        System.out.println("ASSIGNMENT 9: Employee Attendance Summary");
        System.out.println("--------------------------------------");
        char[][] attendance = {
                {'P','P','A','P','L','P','P'},
                {'P','A','A','P','P','P','L'},
                {'P','P','P','P','P','P','P'}
        };
        int employeeCount = 1;

        for(char[] empAttendance : attendance) {
            int presentCount = 0;
            int absentCount = 0;
            int leaveCount = 0;

            for(char status : empAttendance) {
                switch(status) {
                    case 'P':
                        presentCount++;
                        break;
                    case 'A':
                        absentCount++;
                        break;
                    case 'L':
                        leaveCount++;
                        break;
                    default:
                        System.out.println("Unknown Attendance Status");
                }
            }

            System.out.println("Employee "+employeeCount+" Attendance Summary:");
            System.out.println("Present: " + presentCount);
            System.out.println("Absent: " + absentCount);
            System.out.println("Leave: " + leaveCount);
            employeeCount++;
        }
        System.out.println("--------------------------------------");

        //Assignment 10: Dynamic Tax Bracket Calculator
        System.out.println("ASSIGNMENT 10: Dynamic Tax Bracket Calculator");
        System.out.println("--------------------------------------");
        Double incomes[]={150000.0, 200000.0, 500000.0, 750000.0, 1200000.0};

        for(int i=0;i<incomes.length;i++){

            Double income=incomes[i];
            int taxBracket=0;
            Double taxAmount=0.0;
            if(income<=250000.0){
                taxBracket=0;
                taxAmount=0.0;
            } else if(income>250000.0 && income<=500000.0){
                taxBracket=5;
                taxAmount=(income-250000.0)*0.05;
            }
            else if(income>500000.0 && income<=1000000.0){
                taxBracket=20;
                taxAmount=(income-500000.0)*0.2 + (250000.0*0.05);
            } else if(income>1000000.0){
                taxBracket=30;
                taxAmount=(income-1000000.0)*0.3 + (500000.0*0.2) + (250000.0*0.05);
            }

            System.out.println("Employee " + (i + 1) + " Tax Details:");
            System.out.println("Income: " + income);
            System.out.println("Tax Bracket: " + taxBracket + "%");
            System.out.println("Tax Amount: " + taxAmount);
        }
        System.out.println("--------------------------------------");
    }
}

