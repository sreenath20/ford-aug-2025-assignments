package assignment_03.insurance_policy_management;

class HealthInsurance extends Policy{
    private String hospitalCoverage;

    public HealthInsurance(String policyNumber, String holderName, double amount, String hospitalCoverage) {
        super(policyNumber, holderName, amount);
        this.hospitalCoverage = hospitalCoverage;
    }

    public String getHospitalCoverage() {
        return hospitalCoverage;
    }

    public void setHospitalCoverage(String hospitalCoverage) {
        this.hospitalCoverage = hospitalCoverage;
    }

    @Override
    public double calculatePremium() {
        return getAmount() * 0.08;
    }

    public void displayHealthInsuranceInfo() {
        displayPolicyInfo();
        System.out.println("Hospital Coverage: " + hospitalCoverage);
        System.out.println("Premium: Rs." + calculatePremium());
    }
}
