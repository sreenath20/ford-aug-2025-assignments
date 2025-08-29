public class HealthInsurance extends Policy {
    private boolean hospitalCoverage;

    public HealthInsurance(int policyNumber, String holderName, double amount, boolean hospitalCoverage) {
        super(policyNumber, holderName, amount);
        this.hospitalCoverage = hospitalCoverage;
    }

    public boolean ishospitalcovered() {
        return hospitalCoverage;
    }

    public void setHospitalCoverage(boolean hospitalCoverage) {
        this.hospitalCoverage = hospitalCoverage;
    }

    public double calculatePremium() {
        return getAmount() * 0.04 + ((hospitalCoverage) ? 1000 : 0);
    }

    public void displayInsuranceDetails()
    {

        System.out.println("Holder Name: " + getHolderName());
        System.out.println("Policy Number: " + getPolicyNumber());
        System.out.println("Amount: " + getAmount());
        System.out.println("hospitalCoverage: " + ((hospitalCoverage)? "Yes" : "No"));
        System.out.println("calculated premium: "+calculatePremium());
        System.out.println("--------------------------");



    }
}
