package day1;

public class Assignment1 {
    public static void main(String[] args) {
        Double principal = Double.parseDouble("500000");
        Float annualInterestRate = Float.parseFloat("7.5f");
        Integer tenureYears = Integer.parseInt("5");

        double monthlyRate = annualInterestRate / 12 / 100;
        int months = tenureYears * 12;

        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) /
                (Math.pow(1 + monthlyRate, months) - 1);

        double totalPayment = emi * months;

        System.out.printf("EMI: ₹%.2f\n", emi);
        System.out.printf("Total Payment: ₹%.2f\n", totalPayment);
    }
}
