package Assignment3.HospitalPatientRecord;

import java.time.LocalDate;

public class OutPatient extends Patient {
    private LocalDate visitDate;
    private double consultationFee;

    public OutPatient(String patientId, String name, int age, LocalDate visitDate, double consultationFee) {
        super(patientId, name, age);
        this.visitDate = visitDate;
        this.consultationFee = consultationFee;
    }

    @Override
    public void displayPatientInfo() {
        super.displayPatientInfo();
        System.out.println("Visit Date: " + visitDate);
        System.out.println("Consultation Fee: Rs" + consultationFee);
    }
}
