package com.ford.assignment6.hospital;


public class Patient {
    private String medicalHistory = "Diabetes";
    int hospitalId = 202;
    protected String insuranceDetails = "Policy#12345";
    public String name = "Bob";

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public String getName() {
        return name;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public String getInsuranceDetails() {
        return insuranceDetails;
    }
}
