package com.ford.assignment4;

// Abstract class Course
abstract class Course {
    String courseName;
    int duration; // in weeks or hours

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    abstract void enrollStudent(String studentName);
    abstract void startCourse();
}

// Interface CertificateProvider
interface CertificateProvider {
    void generateCertificate(String studentName);
}

// ProgrammingCourse class
class ProgrammingCourse extends Course implements CertificateProvider {

    public ProgrammingCourse(String courseName, int duration) {
        super(courseName, duration);
    }

    @Override
    void enrollStudent(String studentName) {
        System.out.println("Enrolling " + studentName + " in " + courseName);
    }

    @Override
    void startCourse() {
        System.out.println("Starting " + courseName);
    }

    @Override
    public void generateCertificate(String studentName) {
        System.out.println("Certificate generated for " + studentName + " in " + courseName);
    }
}

// DesignCourse class
class DesignCourse extends Course implements CertificateProvider {

    public DesignCourse(String courseName, int duration) {
        super(courseName, duration);
    }

    @Override
    void enrollStudent(String studentName) {
        System.out.println("Enrolling " + studentName + " in " + courseName);
    }

    @Override
    void startCourse() {
        System.out.println("Starting " + courseName);
    }

    @Override
    public void generateCertificate(String studentName) {
        System.out.println("Certificate generated for " + studentName + " in " + courseName);
    }
}

// Main class
public class OnlineLearningPlatform {
    public static void main(String[] args) {
        Course programming = new ProgrammingCourse("Java", 8);
        Course design = new DesignCourse("Design", 6);

        programming.enrollStudent("sana");
        programming.startCourse();
        ((CertificateProvider) programming).generateCertificate("sana");

        design.enrollStudent("loki");
        design.startCourse();
        ((CertificateProvider) design).generateCertificate("loki");
    }
}
