package Assignment4.BankingSystemLoanProcessing;

public abstract class Loan {
    public double calculateEMI(double principal, double rate, int tenureMonths) {
        double monthlyRate = rate / (12 * 100);
        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, tenureMonths)) /
                (Math.pow(1 + monthlyRate, tenureMonths) - 1);
        return Math.round(emi * 100.0) / 100.0;
    }
}

