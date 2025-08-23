package Assignment3.InsurancePolicyManagement;

public class LifeInsurance  extends Policy {
    private String nominee;

    public LifeInsurance(String policyNumber, String holderName, double amount, String nominee) {
        super(policyNumber, holderName, amount);
        this.nominee = nominee;
    }

    @Override
    public double calculatePremium() {
        return amount * 0.05;
    }

    @Override
    public void displayPolicy() {
        super.displayPolicy();
        System.out.println("Nominee: " + nominee);
        System.out.println("Premium: Rs" + calculatePremium());
    }

}
