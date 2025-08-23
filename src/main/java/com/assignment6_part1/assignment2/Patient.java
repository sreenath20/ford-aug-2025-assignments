package com.assignment6_part1.assignment2;

public class Patient {
    private String MedicalHistory;
     String HosiptalID;
    protected String insuranceDetails;
    public String Name;
    public Patient() {}
    public void InsuranceClaim(String insuranceDetails) {
        System.out.println("you are enrolled in"+ this.insuranceDetails);
    }
    public Patient(String name, String medicalHistory, String hospitalID, String insuranceDetails) {
        this.Name = name;
        this.MedicalHistory = medicalHistory;
        this.HosiptalID = hospitalID;
        this.insuranceDetails = insuranceDetails;
    }
    public String getMedicalHistory() {
        return MedicalHistory;
    }
    public void setMedicalHistory(String medicalHistory) {
        this.MedicalHistory = medicalHistory;
    }



}
