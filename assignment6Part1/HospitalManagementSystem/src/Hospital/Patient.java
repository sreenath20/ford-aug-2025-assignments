package Hospital;

public class Patient {
    String hospitalID; // Default: accessible within the same Package
    protected String insuranceDetails; // Protected: accessible in same package or via inheritance;
    public String name; //accessible everywhere
    private String medicalHistory; //accessible only within the same class in which it is declared

    public Patient(String hospitalID, String insuranceDetails, String name, String medicalHistory) {
        this.hospitalID = hospitalID;
        this.insuranceDetails = insuranceDetails;
        this.name = name;
        this.medicalHistory = medicalHistory;
    }

    public String getHospitalID() {
        return hospitalID;
    }

    public String getInsuranceDetails() {
        return insuranceDetails;
    }

    public String getName() {
        return name;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }
    public void displayPatientDetails()
    {
        System.out.println("Hospital ID: " + hospitalID);
        System.out.println("Insurance Details: " + insuranceDetails);
        System.out.println("Name: " + name);
        System.out.println("Medical History: " + medicalHistory);

    }
}
