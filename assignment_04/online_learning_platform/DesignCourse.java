package assignment_04.online_learning_platform;

public class DesignCourse extends Course implements CertificateProvider {
    public DesignCourse(String courseName, int duration) {
        super(courseName, duration);
    }

    @Override
    public void enrollStudent(String studentName) {
        System.out.println("Enrolling " + studentName + " in "+courseName+ " Course");
    }

    @Override
    public void startCourse() {
        System.out.println("Starting "+courseName+ " Course");
    }

    @Override
    public void generateCertificate(String studentName) {
        System.out.println("Certificate generated for " + studentName + " in "+ courseName+ " Course");
    }
}
