package com.assignments.assignment6_1.Hospital;

public class Patient {

    Integer hospitalId;
    public String name;
    private String medicalHistory;
    protected String insuranceDetails;

    public Patient(Integer hospitalId, String name, String medicalHistory, String insuranceDetails) {
        this.hospitalId = hospitalId;
        this.name = name;
        this.medicalHistory = medicalHistory;
        this.insuranceDetails = insuranceDetails;

    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }
}
