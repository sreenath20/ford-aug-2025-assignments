package com.assignment3_encapsulation.assignment6;

public class InPatient extends Patient {
    private String roomNumber;
    private String admissionDate;

    public InPatient(String patientId, String name, int age, String roomNumber, String admissionDate) {
        super(patientId, name, age);
        this.roomNumber = roomNumber;
        this.admissionDate = admissionDate;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    @Override
    public void displayPatientInfo() {
        System.out.println("=== IN-PATIENT INFORMATION ===");
        System.out.println("Patient ID: " + getPatientId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Admission Date: " + admissionDate);
        System.out.println("===============================");
    }
}
