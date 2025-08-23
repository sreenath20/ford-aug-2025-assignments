import java.util.*;

public class Day3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      /*
      Double Bankbalance=10000.0;
      System.out.println("Enter the monthly salary");
      Double amount=input.nextDouble();

        System.out.printf("Current Bank Balance: %.2f%n", Bankbalance);
        if(amount>Bankbalance) {
            System.out.println("Insufficient balance");
        }
        else if(amount<0) {
            System.out.println("Invalid amount");
        }
        else {
            if (amount % 100 != 0) {
                System.out.println("Please enter the amount in multiples of 100");
            }
            else{

                Bankbalance = Bankbalance - amount;
                System.out.printf("Transaction successful. Remaining balance: %.2f%n", Bankbalance);
            }
        }*/

        /*//Question2
        System.out.println("Enter the total km travelled");
         Double totalKm=input.nextDouble();
         Double basefare=50.0;
         Double totalcost=0.0;
         if(totalKm<=5) {
             totalcost=(totalKm*10)+basefare;
         }
         else if (totalKm>5) {
             Double balancekm=totalKm-5.0;
             totalcost=(balancekm*8)+basefare+50.0;
         }

        System.out.printf("total fare is %.2f%n", totalcost);
       */

        /*//question3
        System.out.println("Enter the tables");
        int tables=input.nextInt();
        for(int j=1;j<=tables;j++) {
            System.out.println("-------------------------");
            for(int i=1;i<=10;i++) {
                   System.out.printf("%d  x   %d  =  %d \n", i, j, (i * j));
            }
        }*/
        /* question 4
         int[] array= {1,2,3,4,5};
         System.out.println(Arrays.toString(array));
         System.out.println("enter the number of subject");
         Integer noofsubject=input.nextInt();
         int[] marks=new int[noofsubject];

         for(int i=0;i<noofsubject;i++) {
             System.out.println("enter the marks for the subject  "+ (i+1));
             marks[i]=input.nextInt();
        }
        Integer totalmark=0;
         for(int i=0;i<noofsubject;i++) {
             totalmark+=marks[i];
         }
         Double average=(double)totalmark/noofsubject;
         System.out.println("Average : "+average);
         */
        //question 5
        System.out.println("enter the no of days ");
        Integer noofdays = input.nextInt();
        Integer[] temperature = new Integer[noofdays];
        int count = 0;
        for (int i = 0; i < noofdays; i++) {
            System.out.println("enter the temperature " + (i + 1) + " day");
            temperature[i] = input.nextInt();
            if (temperature[i] >= 40) {
                count++;
            }
        }
        System.out.println("The number of days temperature  is above 40 C is  " + count + " days");
    }
}
