package assignment_03.hospital_patient_record;

public class InPatient extends Patient {
    private int roomNumber;
    private String admissionDate;

    public InPatient (String patientId, String name, int age, int roomNumber, String admissionDate){
        super(patientId, name, age);
        this.roomNumber = roomNumber;
        this.admissionDate = admissionDate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    @Override
    void displayPatientInfo(){
        System.out.println("Patient ID: " + this.getPatientId());
        System.out.println("Patient Name: " + this.getName());
        System.out.println("Patient Age: " + this.getAge());
        System.out.println("Room Number: " + this.getRoomNumber());
        System.out.println("Admission Date: " + this.getAdmissionDate());
    }
}
