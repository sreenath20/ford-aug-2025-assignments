
package com.assignment9_sets.assignment3;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private Integer studentId;
    private String name;

    public Student(Integer studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public Integer getStudentId() {
        return this.studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Student{studentId=" + this.studentId + ", name='" + this.name + "'}";
    }

    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

    public boolean equals(Object o) {
        if (o != null && this.getClass() == o.getClass()) {
            Student student = (Student)o;
            return Objects.equals(this.name, student.name);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.name});
    }
}
