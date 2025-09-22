package javatopic.day5abstraction.assignment.assignment3;

public class DesignCourse extends Course implements CertificateProvider {
    @Override
    public void generateCertificate(String studentName) {
          System.out.println("certificate generated for ui/ux design course");
    }

    @Override
    void enrollStudent(String studentName) {
          System.out.println(studentName+" enrolled for ui/ux");
    }

    @Override
    void startCourse() {
       System.out.println("ui/ux Design Course Started");
    }
}
