package assignment_03.hospital_patient_record;

public class HospitalPatientRecord {
    public static void main(String[] args) {
        System.out.println("\nABC Hospital - Patient Records page\n");

        System.out.println("--- Displaying InPatient Records ---");
        InPatient inPatient1 = new InPatient("R210", "Raj", 37, 210,"02-Aug-2025" );
        inPatient1.displayPatientInfo();
        System.out.println();
        InPatient inPatient2 = new InPatient("L108", "Lekha", 72, 108, "25-Jul-2025");
        inPatient2.displayPatientInfo();
        System.out.println();

        System.out.println("--- Displaying OutPatient Records ---");
        OutPatient outPatient1 = new OutPatient("P02", "Preethi", 21, "16-Aug-2025", 1500);
        outPatient1.displayPatientInfo();
        System.out.println();
        OutPatient outPatient2 = new OutPatient("K13", "Kamal", 7, "18-Aug-2025", 1500);
        outPatient2.displayPatientInfo();
        System.out.println();
    }
}
