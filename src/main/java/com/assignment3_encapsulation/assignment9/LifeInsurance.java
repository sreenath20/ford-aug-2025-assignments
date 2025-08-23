package com.assignment3_encapsulation.assignment9;

public class LifeInsurance extends Policy {
    private String nominee;

    public LifeInsurance(String policyNumber, String holderName, double amount, String nominee) {
        super(policyNumber, holderName, amount);
        this.nominee = nominee;
    }

    public String getNominee() {
        return nominee;
    }

    public void setNominee(String nominee) {
        this.nominee = nominee;
    }

    @Override
    public double calculatePremium() {
        return getAmount() * 0.05;
    }

    @Override
    public void displayPolicyInfo() {
        System.out.println("=== LIFE INSURANCE POLICY ===");
        super.displayPolicyInfo();
        System.out.println("Nominee: " + nominee);
        System.out.println("Premium: ₹" + calculatePremium());
        System.out.println("==============================");
    }
}
