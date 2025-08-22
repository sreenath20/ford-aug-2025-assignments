package com.assignments.assignment9;

import java.util.Objects;

public class Student implements Comparable<Student>{
    Integer studentID;
    String name;

    public Student(){}
    public Student(Integer studentID){
        this.studentID = studentID;
        name = null;
    }
    public Student(Integer studentID, String name){
        this.studentID = studentID;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return this.studentID.compareTo(o.studentID);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentID, student.studentID);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(studentID);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", name='" + name + '\'' +
                '}';
    }
}
