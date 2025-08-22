package assignment_03.hospital_patient_record;

public class OutPatient extends Patient {
    private String visitDate;
    private int consultationFee;

    public OutPatient(String patientId, String name, int age, String visitDate, int consultationFee) {
        super(patientId, name, age);
        this.visitDate = visitDate;
        this.consultationFee = consultationFee;
    }

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    public int getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(int consultationFee) {
        this.consultationFee = consultationFee;
    }

    @Override
    void displayPatientInfo(){
        System.out.println("Patient ID: " + this.getPatientId());
        System.out.println("Patient Name: " + this.getName());
        System.out.println("Patient Age: " + this.getAge());
        System.out.println("Visit Date: " + this.getVisitDate());
        System.out.println("Consultation Fee: " + this.getConsultationFee());

    }
}
