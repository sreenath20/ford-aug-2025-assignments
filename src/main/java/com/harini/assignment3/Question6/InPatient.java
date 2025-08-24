package com.harini.assignment3.Question6;

public class InPatient extends Patient{
    int roomNumber;
    String admissionDate;
    public InPatient(String patientId, String name, int age, String admissionDate, int roomNumber) {
        super(patientId, name, age);
        this.admissionDate = admissionDate;
        this.roomNumber = roomNumber;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Admission Date: "+this.admissionDate);
        System.out.println("Room Number: "+this.roomNumber);
    }
}
