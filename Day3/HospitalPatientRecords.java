import java.time.LocalDate;

class Patient {
    private String patientId;
    private String name;
    private int age;
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId; this.name = name; this.age = age;
    }
    public String getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public void displayPatientInfo() {
        System.out.println("Patient[id=" + patientId + ", name=" + name + ", age=" + age + "]");
    }
}

class InPatient extends Patient {
    private String roomNumber;
    private LocalDate admissionDate;
    public InPatient(String id, String name, int age, String roomNumber, LocalDate admissionDate) {
        super(id, name, age);
        this.roomNumber = roomNumber; this.admissionDate = admissionDate;
    }
    @Override
    public void displayPatientInfo() {
        super.displayPatientInfo();
        System.out.println("  InPatient[room=" + roomNumber + ", admissionDate=" + admissionDate + "]");
    }
}

class OutPatient extends Patient {
    private LocalDate visitDate;
    private double consultationFee;
    public OutPatient(String id, String name, int age, LocalDate visitDate, double consultationFee) {
        super(id, name, age);
        this.visitDate = visitDate; this.consultationFee = consultationFee;
    }
    @Override
    public void displayPatientInfo() {
        super.displayPatientInfo();
        System.out.println("  OutPatient[visitDate=" + visitDate + ", fee=" + consultationFee + "]");
    }
}

public class HospitalPatientRecords {
    public static void main(String[] args) {
        InPatient ip = new InPatient("P100","Grace",58,"A101", LocalDate.now().minusDays(2));
        OutPatient op = new OutPatient("P101","Henry",30, LocalDate.now(), 75.0);

        ip.displayPatientInfo();
        op.displayPatientInfo();
    }
}
