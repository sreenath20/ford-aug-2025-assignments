package com.assignment3_encapsulation.assignment4;

public class Student extends Person {
    private int studentid;
    private String courselist;

    public Student(String name, String email, int age, int studentid, String courselist) {
        super(name, email, age);
        this.studentid = studentid;
        this.courselist = courselist;
    }
    public int getStudentid() {
        return studentid;
    }
    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getCourselist() {
        return courselist;
    }

    public void setCourselist(String courselist) {
        this.courselist = courselist;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", age=" + getAge() +
                "studentid=" + studentid +
                ", courselist='" + courselist + '\'' +
                '}';
    }
}
