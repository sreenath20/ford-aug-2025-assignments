package Assignment8.studentresultmanagement;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private int rollNo;
    private String name;
    private double marks;

    public Student() {}

    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
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

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    // Compare by marks (descending)
    @Override
    public int compareTo(Student other) {
        return Double.compare(other.marks, this.marks);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || o.getClass() != Student.class) {
            return false;
        }
        Student s = (Student) o;
        return this.rollNo == s.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo);
    }
}

