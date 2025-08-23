package Assignment3.UniversityCourseRegistrationSystem;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private Professor professor;
    private List<Student> enrolledStudents;

    public Course(String courseName, Professor professor) {
        this.courseName = courseName;
        this.professor = professor;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void registerStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void listEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student s : enrolledStudents) {
            System.out.println("- " + s.getName());
        }
    }
}
