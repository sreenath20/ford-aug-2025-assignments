package Assignment3.InsurancePolicyManagement;

public class Driver {
    public static void main(String[] args) {
        Policy p1 = new LifeInsurance("L1001", "Ram", 50000, "Sam");
        Policy p2 = new HealthInsurance("H1002", "Sam", 30000, "All Hospitals");
        Policy p3 = new VehicleInsurance("V1003", "Hari", 20000, "Car - Audi");

        Policy[] policies = {p1, p2, p3};

        for (Policy policy : policies) {
            System.out.println("----- Policy Details -----");
            policy.displayPolicy();
            System.out.println();
        }
    }
}
