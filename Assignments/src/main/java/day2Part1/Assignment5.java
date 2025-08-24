package day2Part1;
import java.util.Scanner;
public class Assignment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] regions = {"North", "South", "East", "West"};
        double[] sales = new double[4];

        // Input sales for each region
        for (int i = 0; i < regions.length; i++) {
            System.out.print("Enter sales for " + regions[i] + ": ");
            sales[i] = sc.nextDouble();
        }

        System.out.println("\nSales Summary:");
        for (int i = 0; i < regions.length; i++) {
            String category;
            if (sales[i] > 10000) {
                category = "High";
            } else if (sales[i] > 5000) {
                category = "Medium";
            } else {
                category = "Low";
            }

            System.out.println(regions[i] + " Region: " + category);
        }
    }
}
