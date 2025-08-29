public class ProgrammingCourse extends Course implements CertificateProvider {

    public ProgrammingCourse(String courseName, String courseDuration) {
        super(courseName, courseDuration);
    }

    @Override
    public void generateCertificate(String studentName) {
        System.out.println("Certificate generated for " + studentName + " in Programming Course");
    }

    @Override
    void enrollStudent(String stuentName) {
        System.out.println("Enrolling " + stuentName + "  in Java Programming Course");

    }

    @Override
    void startCourse() {
        System.out.println("Starting Java Programming Course");

    }
}
