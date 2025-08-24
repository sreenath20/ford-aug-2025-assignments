package assignment6.accessModifier.HREmployeeManagement;

public class Patient {
    private String medicalHistory;
    Integer hospitalID;
    protected String insuranceDetails;
    public String name;

    public Patient() {
    }

    public Patient(String medicalHistory, Integer hospitalID, String insuranceDetails, String name) {
        this.medicalHistory = medicalHistory;
        this.hospitalID = hospitalID;
        this.insuranceDetails = insuranceDetails;
        this.name = name;
        System.out.println("Inside Patient Constructor" );
        System.out.println(this.name);

    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public Integer getHospitalID() {
        return hospitalID;
    }

    public String getInsuranceDetails() {
        return insuranceDetails;
    }

    public String getName() {
        return name;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public void setHospitalID(Integer hospitalID) {
        this.hospitalID = hospitalID;
    }

    public void setInsuranceDetails(String insuranceDetails) {
        this.insuranceDetails = insuranceDetails;
    }

    public void setName(String name) {
        this.name = name;
    }


}
