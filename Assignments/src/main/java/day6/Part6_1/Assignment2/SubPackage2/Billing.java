package day6.Part6_1.Assignment2.SubPackage2;

import day6.Part6_1.Assignment2.Patient;

public class Billing {
    public void generateBill(Patient p) {
        System.out.println("Billing accessing...");
        System.out.println("Patient Name: " + p.getName());
        // System.out.println(p.insuranceInfo); protected - not accessible
        // System.out.println(p.hospitalId);    default - not accessible outside the package
    }
}
