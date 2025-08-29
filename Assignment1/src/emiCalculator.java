import java.util.Scanner;

public class emiCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal: ");
        Double principal = sc.nextDouble();
        System.out.print("Enter annual interest rate: ");
        Float interestRate = sc.nextFloat();
        System.out.print("Enter number of years: ");
        int tenure = sc.nextInt();


        double monthlyRate = (double) interestRate / (12 * 100);


        int numberOfMonths = tenure * 12;

        // EMI formula
        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, numberOfMonths)) /
                (Math.pow(1 + monthlyRate, numberOfMonths) - 1);

        // Total payment
        double totalPayment = emi * numberOfMonths;

        // Print output rounded to 2 decimals
        System.out.printf("Monthly EMI: %.2f%n", emi);
        System.out.printf("Total Payment over %d years: %.2f%n", tenure, totalPayment);
    }
}
