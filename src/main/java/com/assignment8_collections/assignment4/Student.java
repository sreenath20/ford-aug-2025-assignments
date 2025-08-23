package com.assignment8_collections.assignment4;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private Integer rollNo;
    private String name;
    private Double marks;

    public Student(Integer rollNo, String name, Double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public Integer getRollNo() {
        return this.rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMarks() {
        return this.marks;
    }

    public void setMarks(Double marks) {
        this.marks = marks;
    }

    public boolean equals(Object o) {
        if (o != null && this.getClass() == o.getClass()) {
            Student student = (Student)o;
            return Objects.equals(this.marks, student.marks);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hashCode(this.marks);
    }

    public int compareTo(Student o) {
        return this.marks.compareTo(o.marks);
    }

    public String toString() {
        return "Student{rollNo=" + this.rollNo + ", name='" + this.name + "', marks=" + this.marks + "}";
    }
}
