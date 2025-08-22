package com.assignments.assignment3;

public class OutPatient extends Patient {

    private String visitDate;
    private double consultationFee;

    public OutPatient(int patientId, String patientName, int age,String visitDate,double consultationFee) {
        super(patientId, patientName, age);
        this.visitDate = visitDate;
        this.consultationFee = consultationFee;
    }

    @Override
    public void dislayPatientDetails() {
        super.dislayPatientDetails();
        System.out.println("Visit Date: " + this.visitDate);
        System.out.println("Consultation Fee: " + this.consultationFee);
    }
}
