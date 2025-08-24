package assignment6.accessModifier.HospitalMgmtSystem;

import assignment6accessmodif.Patient;

public class Biling {

    public void billingDisplay(Patient patient){
        System.out.println("Inside Billing");
        System.out.println("Patient name in billing is : " +patient.getName());
        System.out.println("Patient id is : " +patient.getHospitalID());
        System.out.println("Patient Insurance details : " +patient.getInsuranceDetails());
        System.out.println("Patient medical history is : " +patient.getMedicalHistory());
    }
}
