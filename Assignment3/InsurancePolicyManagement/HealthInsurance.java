package Assignment3.InsurancePolicyManagement;

public class HealthInsurance extends Policy {
    private String hospitalCoverage;

    public HealthInsurance(String policyNumber, String holderName, double amount, String hospitalCoverage) {
        super(policyNumber, holderName, amount);
        this.hospitalCoverage = hospitalCoverage;
    }

    @Override
    public double calculatePremium() {
        return amount * 0.07;
    }

    @Override
    public void displayPolicy() {
        super.displayPolicy();
        System.out.println("Hospital Coverage: " + hospitalCoverage);
        System.out.println("Premium: Rs" + calculatePremium());
    }
}
