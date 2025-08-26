package assignment_06.part_1.hospital_management_system.insurance;
import assignment_06.part_1.hospital_management_system.hospital.Patient;

public class Insurance extends Patient {
    public Insurance(String medicalHistory, String hospitalName,String hospitalId, String insuranceDetails, String name, String patientId) {
        super(medicalHistory, hospitalName, hospitalId, insuranceDetails, name, patientId);
    }

    public Insurance(Patient p) {
        super(p.getMedicalHistory(),p.getHospitalName(), p.getHospitalId(), p.getInsuranceDetails(), p.getPatientName(), p.getPatientId());
    }

    public void getInsurance() {
        System.out.println("Hospital ID: " + super.getHospitalId());
        System.out.println("Insurance Type: " + super.getInsuranceDetails());
        System.out.println("Medical History: " + super.getMedicalHistory());
    }
}
