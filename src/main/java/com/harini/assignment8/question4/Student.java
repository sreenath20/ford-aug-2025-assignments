package com.harini.assignment8.question4;

import com.harini.assignment8.question2.Book;

public class Student implements Comparable<Student> {
    Integer rollNo;
    String name;
    Double marks;
    public  Student(Integer rollNo, String name, Double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    @Override
    public int compareTo(Student student) {
        return this.marks.compareTo(student.marks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
