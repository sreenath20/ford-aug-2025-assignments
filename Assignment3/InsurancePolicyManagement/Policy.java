package Assignment3.InsurancePolicyManagement;

public class Policy {
    protected String policyNumber;
    protected String holderName;
    protected double amount;

    public Policy(String policyNumber, String holderName, double amount) {
        this.policyNumber = policyNumber;
        this.holderName = holderName;
        this.amount = amount;
    }

    public double calculatePremium() {
        return 0;
    }

    public void displayPolicy() {
        System.out.println("Policy Number: " + policyNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Amount: Rs" + amount);
    }
}
