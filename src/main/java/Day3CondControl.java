import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Day3CondControl {
    public static void main(String[] args) {
//    Integer numbers[] = new Integer[10];
//    for(Integer number : numbers){
//        System.out.println(number);
//
//    }
        // Withdrawing money from ATM multiples of 100 and sufficent balance , then can get money
        // if no balance, display insufficient balance and also for wrong multiples of 100.
        // print remaining balance , amount should not be negative number.
        System.out.println("Welcome to AB Bank");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw");
        int amount = scan.nextInt();
        double userEnteredAmount = (double) amount;
        //Double userEnteredAmount = 1000.00;
        double userBalance = 1500.00;

        if ((userEnteredAmount % 100) == 0 && (userBalance >= userEnteredAmount)) {
            System.out.println("Please collect the cash " + userEnteredAmount);
            userBalance -= userEnteredAmount;
            System.out.println("Your current balance is " + userBalance);
        } else if (userEnteredAmount <= 0) {
            System.out.println("Enter value is negative, Please enter minimum of 100 Rupees");
        } else if ((userEnteredAmount % 100) != 0) {
            System.out.println("Enter the amount in multiples of 100");
        } else if (userBalance <= userEnteredAmount) {
            System.out.println("Insufficient Balance");
        } else {
            System.out.println("ATM Issue. Please contact Maintenance Support");
        }
        // Create a fare logic for uber,, base min is 50 rupees; 10 rupees for first 5km ; 8 rupees /km beyond 5km
        // calculate the total fare
        System.out.println("Calculation of Total Fare - AB Travel");
        System.out.println("Enter the kms travelled by the passenger");
        Scanner scan2 = new Scanner(System.in);
        double kmTravelByUser = scan2.nextDouble();
        double tenRup = 10.00;
        double fiveRup = 5.00;
        double fiftyRup = 50.00;
        double fiveKm = 5.00;
        double totalFare;
        if (kmTravelByUser < fiveKm) {
            System.out.println("Your total fare for the Trip is " + fiftyRup + "Rupees");
        } else if (kmTravelByUser >= fiveKm) {
            totalFare = kmTravelByUser * fiveRup;
            System.out.println("Your total Fare for the Trip is " + totalFare + "Rupees");
        } else if (kmTravelByUser == fiveKm) {
            totalFare = kmTravelByUser * tenRup;
            System.out.println("Your total Fare for the Trip is " + totalFare + "Rupees");
        }

        // For loop ; Printing Multiplication Tables
        System.out.println("Multiplication Tables 1 to 10");
        System.out.println("*******************************");

        for(int i=1;i<11;i++){
         //   int iValue = i;
            System.out.println("*****//" +i+ " Tables//" +"**********************");
            for(int j=1;j<11;j++){
                int value = i * j;
                System.out.println( +i + " * " + j + " = " + value);
            }
        }
    }
}
