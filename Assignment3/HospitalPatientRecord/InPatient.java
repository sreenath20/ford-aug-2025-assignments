package Assignment3.HospitalPatientRecord;

import java.time.LocalDate;

public class InPatient extends Patient {
    private String roomNumber;
    private LocalDate admissionDate;

    public InPatient(String patientId, String name, int age, String roomNumber, LocalDate admissionDate) {
        super(patientId, name, age);
        this.roomNumber = roomNumber;
        this.admissionDate = admissionDate;
    }

    @Override
    public void displayPatientInfo() {
        super.displayPatientInfo();
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Admission Date: " + admissionDate);
    }

}
