package com.assignments.assignment3;

public class InPatient extends Patient {

    private int roomNumber;
    private String admissionDate;

    public InPatient(int patientId, String patientName, int age, int roomNumber,String admissionDate) {
        super(patientId, patientName, age);
        this.roomNumber = roomNumber;
        this.admissionDate = admissionDate;
    }

    @Override
    public void dislayPatientDetails() {
        super.dislayPatientDetails();
        System.out.println("Patient Room Number: " + this.roomNumber);
        System.out.println("Patient Admission Date: " + this.admissionDate);
    }
}
