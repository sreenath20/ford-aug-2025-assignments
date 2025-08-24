package day3.Assignment9;

public class HealthInsurance extends Policy{
    private String hospitalCoverage;
    private double premiumRate;
    public HealthInsurance(String policyNumber, String holderName, double amount, String hospitalCoverage) {
        super(policyNumber, holderName, amount);
        this.hospitalCoverage = hospitalCoverage;
        this.premiumRate = 0.08;
    }

    @Override
    public double calculatePremium() {
        return getAmount() * premiumRate;
    }
}
