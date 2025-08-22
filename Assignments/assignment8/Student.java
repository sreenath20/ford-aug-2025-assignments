package com.assignments.assignment8;

import java.util.List;
import java.util.Objects;

public class Student implements Comparable<Student>{
    Integer rollNo;
    String name;
    Double marks;

    public Student(){}

    public Student(Integer rollNo, String name, Double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public Student(int rollNo) {
        this.rollNo = rollNo;
        name = null;
        marks = null;
    }

    public void setMarks(Double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return -(marks.compareTo(o.marks));
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(rollNo, student.rollNo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo);
    }

    void displayStudents(List<Student> studentList){
        for(Student student : studentList){
            System.out.println(student);
        }
    }
}
