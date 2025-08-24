package day3.Assignment9;

public class VehicleInsurance extends Policy{
    private String vehicleDetails;
    private double premiumRate;
    public VehicleInsurance(String policyNumber, String holderName, double amount, String vehicleDetails) {
        super(policyNumber, holderName, amount);
        this.vehicleDetails = vehicleDetails;
        this.premiumRate = 0.10;
    }

    @Override
    public double calculatePremium() {
        return getAmount() * premiumRate;
    }
}
