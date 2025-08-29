public class Policy {
    private int policyNumber;
    private String holderName;
    private double amount;

    public Policy(int policyNumber, String holderName, double amount) {
        this.policyNumber = policyNumber;
        this.holderName = holderName;
        this.amount = amount;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getAmount() {
        return amount;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double calculatePremium()
    {
        return 0.0;
    }
    public void displayInsuranceDetails()
    {

        System.out.println("Holder Name: " + holderName);
        System.out.println("Policy Number: " + policyNumber);
        System.out.println("Amount: " + amount);
        System.out.println("--------------------------");

    }
}


