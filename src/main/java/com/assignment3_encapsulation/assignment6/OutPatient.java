package com.assignment3_encapsulation.assignment6;

public class OutPatient extends Patient {
    private String visitDate;
    private double consultationFee;

    public OutPatient(String patientId, String name, int age, String visitDate, double consultationFee) {
        super(patientId, name, age);
        this.visitDate = visitDate;
        this.consultationFee = consultationFee;
    }

    public String getVisitDate() {
        return visitDate;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }

    @Override
    public void displayPatientInfo() {
        System.out.println("=== OUT-PATIENT INFORMATION ===");
        System.out.println("Patient ID: " + getPatientId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Visit Date: " + visitDate);
        System.out.println("Consultation Fee: $" + consultationFee);
        System.out.println("================================");
    }
}
