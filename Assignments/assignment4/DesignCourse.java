package com.assignments.assignment4;

public class DesignCourse extends Course implements CertificateProvider{

    public DesignCourse(String courseName, Float duration) {
        super(courseName, duration);
    }

    @Override
    public void generateCertificate(String studentName) {
        System.out.println("Certificate generated for "+studentName+" in "+courseName);
    }

    @Override
    public void enrollStudent(String studentName) {
        System.out.println("Enrollment for "+studentName+" in "+courseName);
    }

    @Override
    public void startCourse() {
        System.out.println("Starting "+courseName+" course...");
    }
}
