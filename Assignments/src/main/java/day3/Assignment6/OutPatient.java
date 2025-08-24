package day3.Assignment6;

public class OutPatient extends Patient {
    double consultationFee;
    String visitDate;

    public OutPatient(String patientId, String name, int age, double consultationFee, String visitDate) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.visitDate = visitDate;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Consultation Fee: "+this.consultationFee);
        System.out.println("Visit Date: "+this.visitDate);
    }
}
