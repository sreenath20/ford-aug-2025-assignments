package javatopic.day5abstraction.assignment.assignment3;

public class ProgrammingCourse extends Course implements CertificateProvider{

    @Override //interface method
    public void generateCertificate(String studentName) {
          System.out.println("java course certificate generated");
    }

    @Override // abstract class method
    void enrollStudent(String studentName) {
          System.out.println(studentName+" java course enrolled");
    }

    @Override
    void startCourse() {
        System.out.println("Programming Course Started");
    }
}
