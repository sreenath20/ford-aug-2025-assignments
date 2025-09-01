package com.demo.Assignment4;

public class OnlineLearning {
    public static void main(String[] args) {
        ProgrammingCourse programmingCourse = new ProgrammingCourse();
        programmingCourse.entrollStudent("Ak");
        programmingCourse.generateCertificate("Ak");
        programmingCourse.startCourse();
        //CertificateProvider certificateProvider = new CertificateProvider();
        DesignCourse designCourse = new DesignCourse();
        designCourse.entrollStudent("Ak");
        designCourse.generateCertificate("Ak");
        designCourse.startCourse();
    }
}
abstract class Course{
    String courseName;
    int duration;
    abstract void entrollStudent(String studentName);
    abstract void startCourse();
}
interface CertificateProvider{
    void generateCertificate(String studentName);
}
class ProgrammingCourse extends Course implements CertificateProvider{

    @Override
    public void generateCertificate(String studentName) {
        System.out.println("Congratulations, this certificate goes to: "+studentName);
    }

    @Override
    void entrollStudent(String studentName) {
        System.out.println(studentName+" is successfully enrolled for Programming course");
    }

    @Override
    void startCourse() {
        System.out.println("Programming course is started");
    }
}
class DesignCourse extends Course implements CertificateProvider{

    @Override
    public void generateCertificate(String studentName) {
        System.out.println("Congratulations, this certificate goes to: "+studentName);
    }

    @Override
    void entrollStudent(String studentName) {
        System.out.println(studentName+" is successfully enrolled for Design course");
    }

    @Override
    void startCourse() {
        System.out.println("Design course is started");
    }
}

