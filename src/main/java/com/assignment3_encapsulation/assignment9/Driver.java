package com.assignment3_encapsulation.assignment9;

public class Driver {
    public static void main(String[] args) {
        System.out.println("*** INSURANCE POLICY MANAGEMENT SYSTEM ***\n");

        LifeInsurance lifePolicy = new LifeInsurance(
            "LI001",
            "aaa",
            500000.0,
            "zzz"
        );

        HealthInsurance healthPolicy = new HealthInsurance(
            "HI001",
            "bbb",
            300000.0,
            "yyy"
        );

        VehicleInsurance vehiclePolicy = new VehicleInsurance(
            "VI001",
            "ccc",
            150000.0,
            "Honda City 2023, Registration: MH12AB1234"
        );

        Policy[] policies = {lifePolicy, healthPolicy, vehiclePolicy};

        System.out.println("DISPLAYING ALL POLICIES:\n");

        for (int i = 0; i < policies.length; i++) {
            System.out.println("Policy " + (i + 1) + ":");
            policies[i].displayPolicyInfo();
            System.out.println();
        }

        System.out.println("PREMIUM CALCULATION DEMONSTRATION:\n");

        for (Policy policy : policies) {
            System.out.println("Policy: " + policy.getPolicyNumber() +
                             " | Holder: " + policy.getHolderName() +
                             " | Premium: ₹" + policy.calculatePremium());
        }

        System.out.println("\nTOTAL PREMIUM COLLECTION:");
        double totalPremium = 0;
        for (Policy policy : policies) {
            totalPremium += policy.calculatePremium();
        }
        System.out.println("Total Premium: ₹" + totalPremium);
    }
}
