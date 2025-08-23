package com.assignment3_encapsulation.assignment9;

public abstract class Policy {
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

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public abstract double calculatePremium();

    public void displayPolicyInfo() {
        System.out.println("Policy Number: " + policyNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Amount: ₹" + amount);
    }
}
