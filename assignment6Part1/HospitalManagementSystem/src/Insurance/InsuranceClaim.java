package Insurance;

import Hospital.Patient;

public class InsuranceClaim extends Patient {


    public InsuranceClaim(String hospitalID, String insuranceDetails, String name, String medicalHistory) {
        super(hospitalID, insuranceDetails, name, medicalHistory);
    }

    public void getInsuranceClaimDetails(){
//        System.out.println(hospitalID);
        System.out.println("insurance id: "+insuranceDetails);
        System.out.println("Name: " + name);
//        System.out.println("Medical History: " + medicalHistory);
        System.out.println("both hospital id and medical history cannot be accessed directly:");


    }
}
