package com.assignment6_part1.assignment2.package2;
import com.assignment6_part1.assignment2.Patient;
public class Billing {
    public Billing(String medicalhistory, String patientName, String hospitalID, String insuranceDetails) {

    }

    public static void main(String[] args) {
        Patient patient = new Patient("bbb","cancer", "1234", "Health Insurance");
        System.out.println("Patient Name: " + patient.Name);
        System.out.println("outside tha package with class you can access public and private by public gettermethod");
       // System.out.println("Insurance Details: " + patient.insuranceDetails);
        System.out.println("Medical History: " + patient.getMedicalHistory());
        //System.out.println("Hospital ID: " + patient.HosiptalID);
    }
}
