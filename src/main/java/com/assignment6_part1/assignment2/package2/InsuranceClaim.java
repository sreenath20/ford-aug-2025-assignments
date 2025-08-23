package com.assignment6_part1.assignment2.package2;
import com.assignment6_part1.assignment2.Patient;

public class InsuranceClaim extends Patient {
    public void InsuranceClaim(String insuranceDetails) {
        System.out.println("you can claim in"+ this.insuranceDetails);
    }
    public InsuranceClaim(String name, String medicalHistory, String hospitalID, String insuranceDetails) {
        super(name, medicalHistory, hospitalID, insuranceDetails);
    }
    public static void main(String[] args) {

        InsuranceClaim patient = new InsuranceClaim("bbb", "cancer", "1234", "health insurance");

        System.out.println("Patient Name: " + patient.Name);
        System.out.println("outside the packge within the subclass , you can access protected and public ");
       // System.out.println("Medical History: " + patient.MedicalHistory);

        //System.out.println("Hospital ID: " + patient.HosiptalID);
        System.out.println("Insurance Details: " + patient.insuranceDetails);
        patient.InsuranceClaim(patient.insuranceDetails);


    }
}