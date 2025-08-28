package com.assignment.day4.assignment6;

class Patient{
    private int patientId;
    private String patientName;
    private int age;

    public Patient() {
    }

    public Patient(int patientId, String patientName, int age) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayPatientInfo() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Age: " + age);
    }

}

class Inpatient extends Patient {
    private int roomNumber;
    private String admissionDate;

    public Inpatient() {
    }

    public Inpatient(int patientId, String patientName, int age, int roomNumber, String admissionDate) {
        super(patientId, patientName, age);
        this.roomNumber = roomNumber;
        this.admissionDate = admissionDate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    @Override
    public void displayPatientInfo() {
        System.out.println("Patient ID: " + getPatientId());
        System.out.println("Patient Name: " + getPatientName());
        System.out.println("Age: " + getAge());
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Admission Date: " + admissionDate);
    }
}

class OutPatient extends Patient {
    private String visitDate;
    private Double consultationFee;

    public OutPatient() {

    }

    public OutPatient(int patientId, String patientName, int age, String visitDate, Double consultationFee) {
        super(patientId, patientName, age);
        this.visitDate = visitDate;
        this.consultationFee = consultationFee;
    }

    public String getVisitDate() {
        return visitDate;
    }
    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }
    public Double getConsultationFee() {
        return consultationFee;
    }
    public void setConsultationFee(Double consultationFee) {
        this.consultationFee = consultationFee;
    }
    @Override
    public void displayPatientInfo() {
        System.out.println("Patient ID: " + getPatientId());
        System.out.println("Patient Name: " + getPatientName());
        System.out.println("Age: " + getAge());
        System.out.println("Visit Date: " + visitDate);
        System.out.println("Consultation Fee: " + consultationFee);
    }

}

public class Day4Assignment6 {
    public static void main(String[] args) {
        Patient patient = new Patient(1,"Deepak",21);
        patient.displayPatientInfo();
        System.out.println();
        Inpatient inpatient = new Inpatient(2, "Ravi", 30, 101, "2023-10-01");
        inpatient.displayPatientInfo();
        System.out.println();
        OutPatient outPatient = new OutPatient(3, "Sita", 25, "2023-10-02", 500.0);
        outPatient.displayPatientInfo();
        System.out.println();


    }
}
