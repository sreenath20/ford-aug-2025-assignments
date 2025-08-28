package com.assignment.day4.assignment9;

class Policy{
    private int policyNumber;
    private String policyHolderName;
    private Double amount;

    public Policy(int policyNumber, String policyHolderName, Double amount) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.amount = amount;
    }

    public void calculatePremium() {
        // Default implementation, can be overridden by subclasses
        System.out.println("Calculating premium for policy number: " + policyNumber);
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public void setPolicyHolderName(String policyHolderName) {
        this.policyHolderName = policyHolderName;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}

class LifeInsurance extends Policy{
    private String nominee;

    public LifeInsurance(int policyNumber, String policyHolderName, Double amount, String nominee) {
        super(policyNumber, policyHolderName, amount);
        this.nominee = nominee;
    }

    @Override
    public void calculatePremium() {
        // Specific implementation for Life Insurance
        System.out.println("Calculating premium for Life Insurance policy number: " + super.getPolicyNumber());
    }
}

class HealthInsurance extends Policy{
    private Double hospitalCoverage;

    public HealthInsurance(int policyNumber, String policyHolderName, Double amount, Double hospitalCoverage) {
        super(policyNumber, policyHolderName, amount);
        this.hospitalCoverage = hospitalCoverage;
    }

    @Override
    public void calculatePremium() {
        // Specific implementation for Health Insurance
        System.out.println("Calculating premium for Health Insurance policy number: " + super.getPolicyNumber());
    }

}

class VehicleInsurance extends Policy{
    private String vehicleType;

    public VehicleInsurance(int policyNumber, String policyHolderName, Double amount, String vehicleType) {
        super(policyNumber, policyHolderName, amount);
        this.vehicleType = vehicleType;
    }

    @Override
    public void calculatePremium() {
        // Specific implementation for Vehicle Insurance
        System.out.println("Calculating premium for Vehicle Insurance policy number: " + super.getPolicyNumber());
    }
}

public class Day4Assignment9 {
    public static void main(String[] args) {

        Policy lifePolicy = new LifeInsurance(101, "John Doe", 500000.0, "Jane Doe");
        Policy healthPolicy = new HealthInsurance(102, "Alice Smith", 300000.0, 100000.0);
        Policy vehiclePolicy = new VehicleInsurance(103, "Bob Johnson", 200000.0, "Car");

        lifePolicy.calculatePremium();
        healthPolicy.calculatePremium();
        vehiclePolicy.calculatePremium();

    }
}
