package com.assignments.assignment6_1.InsuranceDetails;

import com.assignments.assignment6_1.Hospital.Patient;

public class InsuranceClaim extends Patient {
    public InsuranceClaim(Integer hospitalId, String name, String medicalHistory, String insuranceDetails) {
        super(hospitalId, name, medicalHistory, insuranceDetails);
    }

//    insurance details accessed by inheritance of Patient class
    public void  displayInsuranceDetails(){
        System.out.println("Insurance Details : "+insuranceDetails);
    }
}
