abstract class Policy {
    private String policyNumber;
    private String holderName;
    protected double amount;

    public Policy(String policyNumber, String holderName, double amount) {
        this.policyNumber = policyNumber; this.holderName = holderName; this.amount = amount;
    }
    public String getPolicyNumber() { return policyNumber; }
    public String getHolderName() { return holderName; }
    public double getAmount() { return amount; }
    public abstract double calculatePremium(); // different per subclass
    public void display() {
        System.out.println("Policy[" + policyNumber + ", holder=" + holderName + ", amount=" + amount +
                ", premium=" + calculatePremium() + "]");
    }
}

class LifeInsurance extends Policy {
    private String nominee;
    public LifeInsurance(String policyNumber, String holderName, double amount, String nominee) {
        super(policyNumber, holderName, amount);
        this.nominee = nominee;
    }
    @Override
    public double calculatePremium() {
        // simple example: 0.02 of amount + flat fee
        return amount * 0.02 + 50.0;
    }
}

class HealthInsurance extends Policy {
    private double hospitalCoverage;
    public HealthInsurance(String policyNumber, String holderName, double amount, double hospitalCoverage) {
        super(policyNumber, holderName, amount);
        this.hospitalCoverage = hospitalCoverage;
    }
    @Override
    public double calculatePremium() {
        // premium dependent on coverage percentage
        return amount * 0.015 + hospitalCoverage * 0.001;
    }
}

class VehicleInsurance extends Policy {
    private String vehicleDetails;
    public VehicleInsurance(String policyNumber, String holderName, double amount, String vehicleDetails) {
        super(policyNumber, holderName, amount);
        this.vehicleDetails = vehicleDetails;
    }
    @Override
    public double calculatePremium() {
        return amount * 0.03;
    }
}

public class InsurancePolicyManagement {
    public static void main(String[] args) {
        Policy p1 = new LifeInsurance("L001","Ivy",100000, "Jack");
        Policy p2 = new HealthInsurance("H001","Ken",50000, 200000);
        Policy p3 = new VehicleInsurance("V001","Liam",20000,"Toyota Camry 2019");

        p1.display();
        p2.display();
        p3.display();
    }
}

