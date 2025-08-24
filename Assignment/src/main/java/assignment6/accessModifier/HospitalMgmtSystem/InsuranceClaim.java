package assignment6.accessModifier.HospitalMgmtSystem;

import assignment6accessmodif.Patient;

public class InsuranceClaim extends Patient {
    public InsuranceClaim(String medicalHistory, Integer hospitalID, String insuranceDetails, String name) {
        super(medicalHistory, hospitalID, insuranceDetails, name);
    }

    void display(){
            System.out.println("Inside Insurance Claim, the insurance details of the patient are below");
            System.out.println(super.name);
//            System.out.println(super.medicalHistory);
//            System.out.println(super.hospitalID);
            System.out.println(super.insuranceDetails);

        }

}

