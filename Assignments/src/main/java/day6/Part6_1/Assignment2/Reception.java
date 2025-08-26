package day6.Part6_1.Assignment2;

public class Reception {
    public void printPatientDetails(Patient p) {
        System.out.println("Accessing Details of Patient ...");
        // System.out.println(p.medicalHistory); private- not accessible
        System.out.println("Patient Name: " + p.name);
        System.out.println("Hospital ID: " + p.hospitalId);
    }
}
