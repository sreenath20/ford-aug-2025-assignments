package com.assignment.day5.assignment3;

abstract class Course {
    String courseName;
    int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    abstract void enrollStudent(String studentName);
    abstract void startCourse();

}

interface CourseProvider{
    void generateCertificate(String studentName);
}

class ProgrammingCourse extends Course implements CourseProvider {

    public ProgrammingCourse(String courseName, int duration) {
        super(courseName, duration);
    }

    @Override
    void enrollStudent(String studentName) {
        System.out.println("Enrolling " + studentName + " in " + courseName);
    }

    @Override
    void startCourse() {
        System.out.println("Starting " + courseName + " for " + duration + " weeks.");
    }

    @Override
    public void generateCertificate(String studentName) {
        System.out.println("Generating certificate for " + studentName + " in " + courseName);
    }
}

class DesignCourse extends Course implements CourseProvider {

    public DesignCourse(String courseName, int duration) {
        super(courseName, duration);
    }

    @Override
    void enrollStudent(String studentName) {
        System.out.println("Enrolling " + studentName + " in " + courseName);
    }

    @Override
    void startCourse() {
        System.out.println("Starting " + courseName + " for " + duration + " weeks.");
    }

    @Override
    public void generateCertificate(String studentName) {
        System.out.println("Generating certificate for " + studentName + " in " + courseName);
    }
}

public class Day5Assignment3 {

    public static void main(String[] args) {

        ProgrammingCourse programmingCourse = new ProgrammingCourse("Programming", 5);
        programmingCourse.enrollStudent("Deepak");
        programmingCourse.startCourse();
        programmingCourse.generateCertificate("Deepak");
        System.out.println();
        DesignCourse designCourse = new DesignCourse("Design", 4);
        designCourse.enrollStudent("Kumar");
        designCourse.startCourse();
        designCourse.generateCertificate("Kumar");


    }

}
