

import java.util.Locale;
import java.util.Scanner;

public class DynamicTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = 5;
        double[] incomes = new double[N];

        System.out.println("Enter " + N + " annual income values (in rupees, e.g., 250000):");
        for (int i = 0; i < N; i++) {
            System.out.print("Income " + (i + 1) + ": ");
            String s = sc.nextLine().trim().replaceAll(",", "");
            try {
                incomes[i] = Double.parseDouble(s);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number, defaulting to 0.");
                incomes[i] = 0.0;
            }
        }

        System.out.println("\nTax Report:");
        for (int i = 0; i < N; i++) {
            double income = incomes[i];
            double taxPercent;
            if (income <= 250000) {
                taxPercent = 0.0;
            } else if (income <= 500000) {
                taxPercent = 5.0;
            } else if (income <= 1000000) {
                taxPercent = 20.0;
            } else {
                taxPercent = 30.0;
            }
            double taxAmount = income * (taxPercent / 100.0);
            System.out.printf(Locale.US, "Income: %.2f -> Tax: %.0f%% -> Amount: %.2f%n", income, taxPercent, taxAmount);
        }

        sc.close();
    }
}

