package com.assignment3_encapsulation.assignment9;

public class HealthInsurance extends Policy {
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

    @Override
    public void displayPolicyInfo() {
        System.out.println("=== HEALTH INSURANCE POLICY ===");
        super.displayPolicyInfo();
        System.out.println("Hospital Coverage: " + hospitalCoverage);
        System.out.println("Premium: ₹" + calculatePremium());
        System.out.println("================================");
    }
}
