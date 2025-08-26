package day6.Part6_1.Assignment2;

public class Patient {
    private String medicalHistory;
    int hospitalId;
    protected String insuranceInfo;
    public String name;

    public Patient(String history, int id, String insurance, String name) {
        this.medicalHistory = history;
        this.hospitalId = id;
        this.insuranceInfo = insurance;
        this.name = name;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public String getName() {
        return name;
    }
}
