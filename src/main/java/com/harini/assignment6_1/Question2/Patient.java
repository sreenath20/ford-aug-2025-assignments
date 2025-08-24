package com.harini.assignment6_1.Question2;

public class Patient {
    public String name = "Reka";
    private String medicalHistory= "Heart Surgery" ;
    protected String insuranceDetails = "4L Company insurance ";
    String hospitalId = "rk23";

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public String getInsuranceDetails() {
        return insuranceDetails;
    }

    public String getHospitalId() {
        return hospitalId;
    }
}
