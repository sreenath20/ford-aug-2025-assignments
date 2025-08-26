package assignment_06.part_1.hospital_management_system.hospital;

public class Reception {
    public void printPatientDetails(Patient p) {
        System.out.println("Patient Name: " + p.getPatientName());
        System.out.println("Patient Id: " + p.getPatientId());
        System.out.println("InsuranceDetails: " + p.getInsuranceDetails());
    }
}
