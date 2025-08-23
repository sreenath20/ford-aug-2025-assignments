package Assignment3.HospitalPatientRecord;

import java.time.LocalDate;

public class Driver {
    public static void main(String[] args) {
        InPatient inpatient = new InPatient("P101", "Ram", 35, "G101", LocalDate.of(2025, 8, 1));
        OutPatient outpatient = new OutPatient("P102", "Sam", 40, LocalDate.of(2025, 8, 8), 150.0);

        System.out.println("------In-Patient Info-----");
        inpatient.displayPatientInfo();

        System.out.println("-----Out-Patient Info-----");
        outpatient.displayPatientInfo();
    }
}
