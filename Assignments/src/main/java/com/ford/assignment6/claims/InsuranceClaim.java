package com.ford.assignment6.claims;



import com.ford.assignment6.hospital.Patient;

public class InsuranceClaim extends Patient {
    public void processClaim() {
        // System.out.println(hospitalId);         //  default(error)
        System.out.println("Insurance: " + insuranceDetails); // protected via inheritance
        // System.out.println(medicalHistory);     //  private(error)
        System.out.println("Name: " + name);      // public
    }
}
