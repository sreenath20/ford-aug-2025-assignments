public class DesignCourse extends Course implements CertificateProvider {

    public DesignCourse(String courseName, String courseDuration) {
        super(courseName, courseDuration);
    }

    @Override
    public void generateCertificate(String studentName) {
        System.out.println("Generating Certificate Generated for " + studentName + " in Graphic Design Course");
    }

    @Override
    void enrollStudent(String stuentName) {
        System.out.println("Enrolling " + stuentName + " in Graphic Design Course");

    }

    @Override
    void startCourse() {
        System.out.println("Starting graphic Design course");

    }
}
