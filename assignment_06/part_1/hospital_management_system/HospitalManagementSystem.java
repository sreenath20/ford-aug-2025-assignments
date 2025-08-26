package assignment_06.part_1.hospital_management_system;
import assignment_06.part_1.hospital_management_system.hospital.*;
import assignment_06.part_1.hospital_management_system.insurance.*;
import assignment_06.part_1.hospital_management_system.billing.*;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        System.out.println(" HOSPITAL MANAGEMENT SYSTEM \n");

        Patient patient1 = new Patient("Heart Surgery", "Global Care", "GCHsptl789", "HDFC ERGO-Premium Insurance", "Mithra", "MF2D30J");
//        System.out.println("Patient registered successfully!\n");

        System.out.println("Reception Desk - Patient Check-in");
        System.out.println("--------------------------------------");
        Reception reception = new Reception();
        reception.printPatientDetails(patient1);
        System.out.println();

        System.out.println("Insurance Processing");
        System.out.println("--------------------------------------");
        Insurance insurance1 = new Insurance(patient1);
        insurance1.getInsurance();
        System.out.println();

        //\Billing Department
        new Billing().getBill(patient1);
        System.out.println("\nThank you for choosing our hospital services.");

    }
}
