package com.demo.Assignment8;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private Integer RollNo;
    private String Name;
    private Double Mark;

    public Student() {
    }

    public Student(Integer rollNo, String name, Double mark) {
        RollNo = rollNo;
        Name = name;
        Mark = mark;
    }

    public Integer getRollNo() {
        return RollNo;
    }

    public void setRollNo(Integer rollNo) {
        RollNo = rollNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getMark() {
        return Mark;
    }

    public void setMark(Double mark) {
        Mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "RollNo=" + RollNo +
                ", Name='" + Name + '\'' +
                ", Mark=" + Mark +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(RollNo, student.RollNo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(RollNo);
    }

    @Override
    public int compareTo(Student o) {
        return this.Mark.compareTo(o.Mark);
    }
}
