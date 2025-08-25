package assignment_03.insurance_policy_management;

class VehicleInsurance extends Policy {
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
        return getAmount() * 0.06;
    }

    public void displayVehicleInsuranceInfo() {
        //System.out.println("=== Vehicle Insurance Policy ===");
        displayPolicyInfo();
        System.out.println("Vehicle Details: " + vehicleDetails);
        System.out.println("Premium: Rs." + calculatePremium());
    }
}
