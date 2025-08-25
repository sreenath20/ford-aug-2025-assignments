package assignment_03.insurance_policy_management;

class LifeInsurance extends Policy {
    private String nominee;

    public LifeInsurance(String policyNumber, String holderName, double amount, String nominee) {
        super(policyNumber, holderName, amount);
        this.nominee = nominee;
    }

    public String getNominee() {
        return nominee;
    }

    public void setNominee(String nominee) {
        this.nominee = nominee;
    }

    @Override
    public double calculatePremium() {
        return getAmount() * 0.03;  // Life insurance: 3% of amount
    }

    public void displayLifeInsuranceInfo() {
        //System.out.println("=== Life Insurance Policy ===");
        displayPolicyInfo();
        System.out.println("Nominee: " + nominee);
        System.out.println("Premium: Rs." + calculatePremium());
    }
}
