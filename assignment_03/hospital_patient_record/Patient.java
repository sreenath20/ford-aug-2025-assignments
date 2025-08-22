package assignment_03.hospital_patient_record;

public class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void addPatient(Patient patient) {
        patientId = patient.getPatientId();
        name = patient.getName();
        age = patient.getAge();
    }

    void displayPatientInfo(){
        System.out.println("Patient ID: " + this.getPatientId());
        System.out.println("Patient Name: " + this.getName());
        System.out.println("Patient Age: " + this.getAge());
    }
}
