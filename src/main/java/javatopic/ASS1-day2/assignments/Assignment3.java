package javatopic.day2.assignments;

import java.util.Scanner;
public class Assignment3 {
    public static void main(String[] args) {


                Scanner scanner = new Scanner(System.in);


                System.out.print("Enter price from Website 1: ");
                Integer price1 = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter price from Website 2: ");
                Integer price2 = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter price from Website 3: ");
                Integer price3 = Integer.parseInt(scanner.nextLine());



                // Find highest and lowest using ternary
                int highest = (price1 > price2) ? (price1 > price3 ? price1 : price3) : (price2 > price3 ? price2 : price3);
                int lowest = (price1 < price2) ? (price1 < price3 ? price1 : price3) : (price2 < price3 ? price2 : price3);

                // Calculate percentage difference between highest and lowest
                double percentageDifference = ((highest - lowest) * 100.0) / lowest;

                // Output results
                System.out.println("\nBest Deal: $" + lowest);
                System.out.println("Most Expensive: $" + highest);
                System.out.printf("Price Difference Percentage: %.2f%%\n", percentageDifference);

                scanner.close();
            }




}
