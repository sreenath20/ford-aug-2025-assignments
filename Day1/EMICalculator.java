

import java.util.Scanner;
public class EMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal (e.g., 50000.0): ");
        String principalStr = sc.nextLine();
        System.out.print("Enter Annual Interest Rate in % (e.g., 8.5): ");
        String rateStr = sc.nextLine();
        System.out.print("Enter Tenure (years) (e.g., 5): ");
        String yearsStr = sc.nextLine();

        double principal = Double.valueOf(principalStr);
        float annualRate = Float.valueOf(rateStr);
        int years = Integer.valueOf(yearsStr);

        int n = years * 12;
        double r = annualRate / 12.0 / 100.0;

        double emi;
        if (r == 0) {
            emi = principal / n;
        } else {
            double pow = Math.pow(1 + r, n);
            emi = principal * r * pow / (pow - 1);
        }

        double totalPayment = emi * n;

        System.out.printf("EMI = %.2f%n", emi);
        System.out.printf("Total Payment = %.2f%n", totalPayment);

        sc.close();
    }
}
