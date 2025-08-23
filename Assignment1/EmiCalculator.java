package Assignment1;

import java.util.Scanner;

public class EmiCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double principal = Double.parseDouble(sc.nextLine());

        System.out.print("Enter Annual Interest Rate (%): ");
        float annualRate = Float.parseFloat(sc.nextLine());

        System.out.print("Enter Tenure (in years): ");
        int years = Integer.parseInt(sc.nextLine());

        double monthlyRate = annualRate / (12 * 100);
        int months = years * 12;

        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) /
                (Math.pow(1 + monthlyRate, months) - 1);

        double totalPayment = emi * months;

        System.out.printf("EMI: %.2f\n", emi);
        System.out.printf("Total Payment: %.2f\n", totalPayment);
    }
}

