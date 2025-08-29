public class VehicleInsurance extends Policy {
    private String vehicleType;

    public VehicleInsurance(int policyNumber, String holderName, double amount, String vehicleDetails) {
        super(policyNumber, holderName, amount);
        this.vehicleType = vehicleDetails;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public double calculatePremium() {
//        6% + service Charge

        return getAmount() * 0.06 + 300;
    }
    public void displayInsuranceDetails()
    {

        System.out.println("Holder Name: " + getHolderName());
        System.out.println("Policy Number: " + getPolicyNumber());
        System.out.println("Amount: " + getAmount());
       System.out.println("vehicle Type " + getVehicleType());
        System.out.println("calculated premium: "+calculatePremium());
        System.out.println("--------------------------");


    }
}
