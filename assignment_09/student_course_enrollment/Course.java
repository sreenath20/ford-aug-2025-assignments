package assignment_09.student_course_enrollment;

import java.util.Objects;

public class Course {
    int courseId;
    String courseName;

    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Course other = (Course) obj;
        return courseId == other.courseId;
    }

    public int hashCode() {
        return Objects.hash(courseId);
    }

    public void displayCourse() {
        System.out.println("Course ID: " + courseId + ", Name: " + courseName);
    }
}
