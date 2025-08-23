

public class LoanProcessingDemo {
    public static void main(String[] args) {
        try {
            // Example 1: Home Loan
            double homePrincipal = 50000;
            double homeAnnualRate = 15.6;
            int homeTenureMonths = 60;

            HomeLoan homeLoan = new HomeLoan(homePrincipal);
            double homeEmi = homeLoan.calculateEMIChecked(homePrincipal, homeAnnualRate, homeTenureMonths);

            System.out.printf("Home Loan EMI for $%.0f is $%.0f/month%n", homePrincipal, homeEmi);
            System.out.println(homeLoan.approveLoan() ? "Home Loan Approved" : "Home Loan Denied");

            // Example 2: Car Loan
            double carPrincipal = 20000;
            double carAnnualRate = 13.2;
            int carTenureMonths = 60;

            CarLoan carLoan = new CarLoan(carPrincipal);
            double carEmi = carLoan.calculateEMIChecked(carPrincipal, carAnnualRate, carTenureMonths);
            System.out.printf("Car Loan EMI for $%.0f is $%.0f/month%n", carPrincipal, carEmi);
            System.out.println(carLoan.approveLoan() ? "Car Loan Approved" : "Car Loan Denied");
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}

abstract class Loan {
    protected double calculateEMI(double principal, double annualRate, int tenureMonths) {
        double monthlyRate = annualRate / 12.0 / 100.0;
        if (monthlyRate == 0) {
            return principal / tenureMonths;
        }
        double factor = Math.pow(1 + monthlyRate, tenureMonths);
        return (principal * monthlyRate * factor) / (factor - 1);
    }

    public double calculateEMIChecked(double principal, double annualRate, int tenureMonths) {
        if (Double.isNaN(principal) || Double.isInfinite(principal) || principal <= 0) {
            throw new IllegalArgumentException("principal must be > 0");
        }
        if (Double.isNaN(annualRate) || Double.isInfinite(annualRate) || annualRate < 0) {
            throw new IllegalArgumentException("annualRate must be >= 0");
        }
        if (tenureMonths <= 0) {
            throw new IllegalArgumentException("tenureMonths must be > 0");
        }
        return calculateEMI(principal, annualRate, tenureMonths);
    }
}

interface ApprovalProcess {
    boolean approveLoan();
}

class HomeLoan extends Loan implements ApprovalProcess {
    private double principal;
    public HomeLoan(double principal) { this.principal = principal; }
    @Override public boolean approveLoan() { return principal <= 100000; }
}

class CarLoan extends Loan implements ApprovalProcess {
    private double principal;
    public CarLoan(double principal) { this.principal = principal; }
    @Override public boolean approveLoan() { return principal <= 50000; }
}
