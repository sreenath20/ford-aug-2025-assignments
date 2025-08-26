package day6.Part6_1.Assignment2.SubPackage1;

import day6.Part6_1.Assignment2.Patient;

public class InsuranceClaim extends Patient {
    public InsuranceClaim(String history, int id, String insurance, String name) {
        super(history, id, insurance, name);
    }

    public void claimInsurance() {
        System.out.println("InsuranceClaim accessing insurance: " + insuranceInfo);
        // System.out.println(hospitalId); default - not accessible outside package

    }
}
