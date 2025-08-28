package com.assignment.day7.assignment1_2.Billing;

import com.assignment.day7.assignment1_2.hospital.Patient;

public class Billing {
    public void billInfo(Patient p){
        System.out.println("Billing Information");
        System.out.println("MEDICAL HISTORY"+ p.getMedicalhistory());
        System.out.println("HOSPITAL ID"+ p.getHospitalId());
        System.out.println("INSURANCE DETAILS"+ p.getInsuranceDetails());
        System.out.println("PATIENT NAME"+ p.getPatientName());
    }
}
