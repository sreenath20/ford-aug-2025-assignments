package com.fullstackabi.assignment.Assign8.Collections.Ex4.SortSearch;

import java.util.Objects;

public class Student implements Comparable<Student>{

    int rollNumber;
    String name;
    double marks;

    public Student(int rollNumber, String name, double marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNumber == student.rollNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollNumber);
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
    // giving negative value sort by descending order.
    @Override
    public int compareTo(Student o) {
        return -Double.compare(this.marks, o.marks);
    }


}
