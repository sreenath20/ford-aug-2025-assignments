public class LifeInsurance extends Policy {

    private String nomineeName;

    public LifeInsurance(int policyNumber, String holderName, double amount, String nomineeName) {
        super(policyNumber, holderName, amount);
        this.nomineeName = nomineeName;
    }

    public String getNomineeName() {
        return nomineeName;
    }

    public void setNomineeName(String nomineeName) {
        this.nomineeName = nomineeName;
    }

    public double calcuatePremium() {
        //  5% of amount + base charge
        return getAmount() * 0.05 + 500;
    }
    public void displayInsuranceDetails()
    {

        System.out.println("Holder Name: " + getHolderName());
        System.out.println("Policy Number: " + getPolicyNumber());
        System.out.println("Amount: " + getAmount());
        System.out.println("Nominee Name: " + getNomineeName());
        System.out.println("calculated premium: "+calcuatePremium());
        System.out.println("--------------------------");

    }
}
