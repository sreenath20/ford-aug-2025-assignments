package com.assignment4_abstraction.assignment3;

public class ProgrammingCourse extends Course implements CeriticateProvider {
    private String studentname;

    public ProgrammingCourse(String studentname, String courseName, int duration) {
        super(courseName, duration);
        this.studentname = studentname;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }
    public void enrollStudent(String studentName) {
        System.out.println("Enrolling " + studentName + " in "+ getCourseName()+" Programming Course ");
    }
    public void startCourse() {
        System.out.println("Starting " + getCourseName() + " Programming Course");
    }
    @Override
    public void  generateCertificate(String studentName) {
        System.out.println(" Certificate Generating for " + studentName + " in " + getCourseName() + " Programming Course");
    }
}
