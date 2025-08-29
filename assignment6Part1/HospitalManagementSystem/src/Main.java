import Bill.Bill;
import Hospital.Patient;
import Hospital.Reception;
import Insurance.InsuranceClaim;

public class Main {
    public static void main(String[] args) {

        System.out.println("Patient details: ");
        Patient patient=new Patient("987","insurance545","Alaska","none");
        patient.displayPatientDetails();
        System.out.println("------------------");

        System.out.println("Insurance Claim Details: ");
        InsuranceClaim insuranceClaim=new InsuranceClaim(patient.getHospitalID(), patient.getInsuranceDetails(), patient.getName(), patient.getMedicalHistory());
        insuranceClaim.getInsuranceClaimDetails();

        System.out.println("------------------");

        System.out.println("Details given to reception: ");
        Reception reception=new Reception();
        reception.getPatientDetails(patient);

        System.out.println("------------------");

        System.out.println("Billing: ");
        Bill bill=new Bill();
        bill.getBill(patient);

    }
}