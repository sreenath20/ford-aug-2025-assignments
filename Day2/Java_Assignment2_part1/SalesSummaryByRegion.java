

import java.util.Scanner;

public class SalesSummaryByRegion {
    public static void main(String[] args) {
        String[] regions = {"North", "South", "East", "West"};
        double[] sales = new double[regions.length];

        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < regions.length; i++) {
                System.out.print("Enter sales for " + regions[i] + ": ");
                sales[i] = Double.parseDouble(sc.nextLine().trim());
            }
        }

        System.out.println("\nRegion-wise categorization:");
        for (int i = 0; i < regions.length; i++) {
            String category;
            if (sales[i] > 10000) {
                category = "High";
            } else if (sales[i] > 5000) {
                category = "Medium";
            } else {
                category = "Low";
            }

            switch (category) {
                case "High":
                    System.out.println(regions[i] + ": High (sales = " + sales[i] + ")");
                    break;
                case "Medium":
                    System.out.println(regions[i] + ": Medium (sales = " + sales[i] + ")");
                    break;
                case "Low":
                    System.out.println(regions[i] + ": Low (sales = " + sales[i] + ")");
                    break;
                default:
                    System.out.println(regions[i] + ": Unknown");
            }
        }
    }
}
