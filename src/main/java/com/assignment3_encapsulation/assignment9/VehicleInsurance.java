package com.assignment3_encapsulation.assignment9;

public class VehicleInsurance extends Policy {
    private String vehicleDetails;

    public VehicleInsurance(String policyNumber, String holderName, double amount, String vehicleDetails) {
        super(policyNumber, holderName, amount);
        this.vehicleDetails = vehicleDetails;
    }

    public String getVehicleDetails() {
        return vehicleDetails;
    }

    public void setVehicleDetails(String vehicleDetails) {
        this.vehicleDetails = vehicleDetails;
    }

    @Override
    public double calculatePremium() {
        return getAmount() * 0.12;
    }

    @Override
    public void displayPolicyInfo() {
        System.out.println("=== VEHICLE INSURANCE POLICY ===");
        super.displayPolicyInfo();
        System.out.println("Vehicle Details: " + vehicleDetails);
        System.out.println("Premium: ₹" + calculatePremium());
        System.out.println("=================================");
    }
}
