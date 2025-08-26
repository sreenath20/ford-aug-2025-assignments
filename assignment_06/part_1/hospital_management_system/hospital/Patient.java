package assignment_06.part_1.hospital_management_system.hospital;

public class Patient {
    private String medicalHistory;
    String hospitalName;
    String hospitalId;//default (Package-Private)
    protected String insuranceDetails;
    public String patientName;
    public String patientId;

    public Patient(String medicalHistory,String hospitalName, String hospitalId, String insuranceDetails, String name, String id) {
        this.medicalHistory = medicalHistory;
        this.hospitalName = hospitalName;
        this.hospitalId = hospitalId;
        this.insuranceDetails = insuranceDetails;
        this.patientName = name;
        this.patientId = id;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public String getInsuranceDetails() {
        return this.insuranceDetails;
    }

    public String getPatientName() {
        return this.patientName;
    }

    public String getPatientId() {
        return patientId;
    }
}