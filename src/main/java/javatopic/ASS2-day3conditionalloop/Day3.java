package javatopic.day3conditionalloop;

import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
       /* Double balance = 100000.00;
        Integer withdrawalAmount;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        withdrawalAmount = scanner.nextInt();

        if (withdrawalAmount <= balance) {
            if (withdrawalAmount % 100 == 0 && withdrawalAmount >= 0) {
                System.out.println("You have withdrawn the amount of $" + withdrawalAmount);
                balance = balance - withdrawalAmount;
                System.out.println("Balance amount in your account $" + (balance));


            } else {
                System.out.println("Please enter the withdrawal amount in multiplies of 100");
            }


        } else {
            System.out.println("Insufficient balance ");
            System.out.println("your current balance : " + balance);
        }

        */
        // calculate fair for uber

        /*
        Double kilometerToTravel;
        Double totalFair=50.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter kilometers to travel: ");
        kilometerToTravel = input.nextDouble();
        Double Remainingkilometer;

        if(kilometerToTravel<=5){
            totalFair=totalFair+(kilometerToTravel*10);
        }
        else if(kilometerToTravel>5){
            Remainingkilometer=kilometerToTravel-5.0;
            totalFair=totalFair+50.0+(Remainingkilometer*8);
        }
        System.out.println("Total Fair: "+totalFair);

         */

        // table print
      /*  for(int index=2;index<10;index++){
            System.out.println("--------------------------------------------------------");
            System.out.println(index + " TABLE");

            for(int i=1;i<=10;i++){

                System.out.println(i +"  *  " + index + "  =  " + (i*index));
            }
        }

       */
        /*
      Scanner input = new Scanner(System.in);
      int arraySize;
      Integer averageMark=0;
      System.out.println("Enter the no  of the subject");
      arraySize = input.nextInt();
      Integer array1[]=new Integer[arraySize];
      for(int i=0;i<arraySize;i++){
          System.out.println("Enter the subject"+(i+1)+" mark");
          array1[i]=input.nextInt();
      }
      System.out.println("score of the subject");
      for(Integer score:array1){
          System.out.println(score);
      }
      for(int j=0;j<arraySize;j++){
          averageMark=averageMark+array1[j];

      }
      averageMark=averageMark/arraySize;
      System.out.println("average mark is "+averageMark);

         */
        int noOfDays;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of Days you want to enter");
        noOfDays=sc.nextInt();
        int countDays=0;
        int thresholdTemperature=40;
        Double[] temperatureRecordings=new Double[noOfDays];

        for(int i=0;i<noOfDays;i++){
            System.out.println("Enter temperature for day:" + (i+1) );
            temperatureRecordings[i]=sc.nextDouble();
        }
        for(int i=0;i<noOfDays;i++){
            if(temperatureRecordings[i]>thresholdTemperature){
                countDays=countDays+1;

            }
        }

        System.out.println("No of days the temperature exceeded 40 degree :" + countDays);



    }
}
