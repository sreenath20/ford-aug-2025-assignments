package assignment_06.part_1.hospital_management_system.billing;
import assignment_06.part_1.hospital_management_system.hospital.Patient;

public class Billing {
    public void getBill(Patient p) {
        System.out.println("=====================================");
        System.out.println("GLOBAL CARE Hospital Bill Statement");
        System.out.println("=====================================");
        System.out.println("Patient Name: " + p.getPatientName());
        System.out.println("Patient Id: " + p.getPatientId());
        System.out.println("Medical History: " + p.getMedicalHistory());
        System.out.println("Total Bill Amount(after claim): Rs.312950.00");
        System.out.println("-------------------------------------");
        System.out.println("Payment Status: Completed");
        System.out.println("=====================================");
    }
}


