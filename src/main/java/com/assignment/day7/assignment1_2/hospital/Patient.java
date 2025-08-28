package com.assignment.day7.assignment1_2.hospital;

public class Patient {
    private String medicalhistory;
    int hospitalId;
    protected String insuranceDetails;
    public String patientName;

    public Patient(){};

    public Patient(String medicalhistory, int hospitalId, String insuranceDetails,String patientName) {
        this.medicalhistory = medicalhistory;
        this.hospitalId = hospitalId;
        this.insuranceDetails = insuranceDetails;
        this.patientName = patientName;
    }

    public String getMedicalhistory() {
        return medicalhistory;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public String getInsuranceDetails() {
        return insuranceDetails;
    }

    public String getPatientName() {
        return patientName;
    }
}
