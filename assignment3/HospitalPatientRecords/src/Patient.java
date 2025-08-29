public class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient() {
    }

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
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


    public void displayPatientInfo(){
        System.out.println("Details of "+ getName());
        System.out.println("Age: " + getAge());
        System.out.println("patient Id is " +getPatientId());

    }
}

class Inpatient extends Patient {

    private int roomNumber;
    private String admissionDate;

//  Constructors
    public Inpatient() {
    }

    public Inpatient(int roomNumber, String admissionDate) {
        this.roomNumber = roomNumber;
        this.admissionDate = admissionDate;
    }

    public Inpatient(int patientId, String name, int age, int roomNumber, String admissionDate) {
        super(patientId, name, age);
        this.roomNumber = roomNumber;
        this.admissionDate = admissionDate;
    }

//    Getters and Setters

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
//method
    @Override
    public void displayPatientInfo(){
        System.out.println("Details of "+ getName());
        System.out.println("Admission Date: " + getAdmissionDate());
        System.out.println("Room Number: " + getRoomNumber());
        System.out.println("Patient Id: " + getPatientId());
        System.out.println("Patient age is " + getAge());

    }

}

class Outpatient extends Patient {
    private String visitDate;
    private double consultationFee;

    //Constructors
    public Outpatient() {
    }

    public Outpatient(String visitDate, double consultationFee) {
        this.visitDate = visitDate;
        this.consultationFee = consultationFee;
    }

    public Outpatient(int patientId, String name, int age, String visitDate, double consultationFee) {
        super(patientId, name, age);
        this.visitDate = visitDate;
        this.consultationFee = consultationFee;
    }
//    Getters and Setters

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }

    //method
    @Override
    public void displayPatientInfo(){
    System.out.println("Details of "+ getName());
    System.out.println("Visit Date: " + getVisitDate());
    System.out.println("Consultation Fee: " + getConsultationFee());
    System.out.println("Patient Id: " + getPatientId());
    System.out.println("Patient age is " + getAge());
    }

}