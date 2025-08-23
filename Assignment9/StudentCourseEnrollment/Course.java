package Assignment9.StudentCourseEnrollment;

import java.util.Objects;

public class Course {
    private int courseId;
    private String courseName;

    public Course() {}

    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return "Course{" + "courseId=" + courseId + ", courseName='" + courseName + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || o.getClass() != Course.class) return false;
        Course c = (Course) o;
        return this.courseId == c.courseId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId);
    }
}

