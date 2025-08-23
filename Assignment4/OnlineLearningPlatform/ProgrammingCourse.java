package Assignment4.OnlineLearningPlatform;


public class ProgrammingCourse extends Course implements CertificateProvider {

    public ProgrammingCourse(String courseName, int duration) {
        super(courseName, duration);
    }

    @Override
    public void enrollStudent(String studentName) {
        System.out.println("Enrolling " + studentName + " in " + courseName);
    }

    @Override
    public void startCourse() {
        System.out.println("Starting " + courseName);
    }

    @Override
    public void generateCertificate(String studentName) {
        System.out.println("Certificate generated for " + studentName + " in " + courseName);
    }
}

