package day4.Assignment3;

public class ProgrammingCourse extends Course implements CertificateProvider {
    public ProgrammingCourse(String courseName, String duration) {
        super(courseName, duration);
    }

    @Override
    public void generateCertificate(String studentName) {
        System.out.println("Certificate generated for " + studentName+" in "+courseName+" Course");
    }

    @Override
    public void enrollStudent(String studentName) {
        System.out.println("Enrolling "+studentName+" in "+courseName+" Course");
    }

    @Override
    public void startCourse() {
        System.out.println("Starting "+courseName+" Course");
    }
}
