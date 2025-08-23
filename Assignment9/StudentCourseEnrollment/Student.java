package Assignment9.StudentCourseEnrollment;

import java.util.Objects;

public class Student {
    private int studentId;
    private String name;

    public Student() {}

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", name='" + name + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || o.getClass() != Student.class) return false;
        Student s = (Student) o;
        return this.studentId == s.studentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }
}

