package com.harini.assignment3.Question9;

public class LifeInsurance extends Policy{
    private String nominee;
    private double premiumRate;
    public LifeInsurance(String policyNumber, String holderName, double amount, String nominee) {
        super(policyNumber, holderName, amount);
        this.nominee = nominee;
        this.premiumRate = 0.05;
    }

    @Override
    public double calculatePremium() {
        return getAmount() * premiumRate; // 5% premium
    }
}
