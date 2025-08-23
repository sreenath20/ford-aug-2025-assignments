package hospital.records;

public class Patient {
    private String medicalHistory;

    int hospitalId;

    protected String insuranceDetails;

    public String name;

    public Patient(String name, int hospitalId, String insuranceDetails, String medicalHistory) {
        this.name = name;
        this.hospitalId = hospitalId;
        this.insuranceDetails = insuranceDetails;
        this.medicalHistory = medicalHistory;
    }

    public String getName() {
        return name;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    protected String getInsuranceDetailsProtected() {
        return insuranceDetails;
    }

    public String getSafeSummary() {
        return "Patient[name=" + name + ", id=" + hospitalId + "]";
    }
}
