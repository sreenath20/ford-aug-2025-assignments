package assignment_03.insurance_policy_management;

public class InsurancePolicyManagement {
    public static void main(String[] args) {
        System.out.println(" Welcome to Insurance Policy Management System! \n");

        System.out.println("--- Creating Insurance Policies ---");
        LifeInsurance lifePolicy = new LifeInsurance("LIFE771", "Deepika", 100000.0, "Shiny");
        HealthInsurance healthPolicy = new HealthInsurance("HEALTH751", "Mithra", 50000.0, "All Major Hospitals");
        VehicleInsurance vehiclePolicy = new VehicleInsurance("VEHICLE641", "Kaviarashan", 25000.0, "Toyota Innova 2022");

        lifePolicy.displayLifeInsuranceInfo();
        System.out.println();
        healthPolicy.displayHealthInsuranceInfo();
        System.out.println();
        vehiclePolicy.displayVehicleInsuranceInfo();
        System.out.println();

        System.out.println("--- Insurance Summary ---");
        Policy[] policies = {
                new LifeInsurance("LIFE112", "Chandran", 150000.0, "Janvi"),
                new HealthInsurance("HEALTH322", "Sujith", 75000.0, "Premium Healthcare Network"),
                new VehicleInsurance("VEHICLE912", "Ram Mohan", 35000.0, "Honda Civic 2023")
        };

        String[] policyTypes = {"Life Insurance", "Health Insurance", "Vehicle Insurance"};

        for (int i = 0; i < policies.length; i++) {
            System.out.println(policyTypes[i] + ":");
            policies[i].displayPolicyInfo();
            System.out.println("Premium: Rs." + policies[i].calculatePremium());
            System.out.println();
        }

        System.out.println("--- Premium Summary ---");
        double totalPremiums = 0;
        for (int i = 0; i < policies.length; i++) {
            totalPremiums += policies[i].calculatePremium();
        }
        System.out.println("Total Premiums Collected: Rs." + totalPremiums);
    }
}
