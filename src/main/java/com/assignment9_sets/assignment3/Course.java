
package com.assignment9_sets.assignment3;

import java.util.Objects;

public class Course implements Comparable<Course> {
    private Integer courseId;
    private String CourseName;

    public Course(Integer courseId, String courseName) {
        this.courseId = courseId;
        this.CourseName = courseName;
    }

    public int getCourseId() {
        return this.courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return this.CourseName;
    }

    public void setCourseName(String courseName) {
        this.CourseName = courseName;
    }

    public String toString() {
        return "Course{courseId=" + this.courseId + ", CourseName='" + this.CourseName + "'}";
    }

    public boolean equals(Object o) {
        if (o != null && this.getClass() == o.getClass()) {
            Course course = (Course)o;
            return Objects.equals(this.CourseName, course.CourseName);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.CourseName});
    }

    public int compareTo(Course o) {
        return this.CourseName.compareTo(o.CourseName);
    }
}
