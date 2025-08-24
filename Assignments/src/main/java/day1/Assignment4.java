package day1;

public class Assignment4 {
    public static void main(String[] args) {
        Double monthlySalary = Double.parseDouble("55000");

        double annualSalary = monthlySalary * 12;
        double tax = 0;

        if (annualSalary <= 250000) {
            tax = 0;
        } else if (annualSalary <= 500000) {
            tax = (annualSalary - 250000) * 0.05;
        } else if (annualSalary <= 1000000) {
            tax = (250000 * 0.05) + (annualSalary - 500000) * 0.2;
        } else {
            tax = (250000 * 0.05) + (500000 * 0.2) + (annualSalary - 1000000) * 0.3;
        }

        double netSalary = annualSalary - tax;

        System.out.printf("Annual Salary: ₹%.2f\n", annualSalary);
        System.out.printf("Estimated Tax: ₹%.2f\n", tax);
        System.out.printf("Net Salary: ₹%.2f\n", netSalary);

    }
}
