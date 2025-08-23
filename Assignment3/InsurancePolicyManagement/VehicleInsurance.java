package Assignment3.InsurancePolicyManagement;

public class VehicleInsurance extends Policy {
    private String vehicleDetails;

    public VehicleInsurance(String policyNumber, String holderName, double amount, String vehicleDetails) {
        super(policyNumber, holderName, amount);
        this.vehicleDetails = vehicleDetails;
    }

    @Override
    public double calculatePremium() {
        return amount * 0.1;
    }

    @Override
    public void displayPolicy() {
        super.displayPolicy();
        System.out.println("Vehicle: " + vehicleDetails);
        System.out.println("Premium: Rs" + calculatePremium());
    }
}
