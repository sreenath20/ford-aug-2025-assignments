package Assignment3.UniversityCourseRegistrationSystem;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private String studentId;
    private List<Course> courseList;

    public Student(String name, String email, int age, String studentId) {
        super(name, email, age);
        this.studentId = studentId;
        this.courseList = new ArrayList<>();
    }

    public void registerCourse(Course course) {
        courseList.add(course);
        course.registerStudent(this);
    }

    public String getStudentId() {
        return studentId;
    }

    public void listCourses() {
        System.out.println(getName() + "'s Courses:");
        for (Course c : courseList) {
            System.out.println("- " + c.getCourseName());
        }
    }

}
