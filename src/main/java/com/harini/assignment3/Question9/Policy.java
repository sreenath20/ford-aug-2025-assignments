package com.harini.assignment3.Question9;

public class Policy {
    private String policyNumber;
    private String holderName;
    private double amount;

    public Policy(String policyNumber, String holderName, double amount) {
        this.policyNumber = policyNumber;
        this.holderName = holderName;
        this.amount = amount;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getAmount() {
        return amount;
    }

    public double calculatePremium() {
        return 0.0;
    }
}
