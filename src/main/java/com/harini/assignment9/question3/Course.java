package com.harini.assignment9.question3;

import java.util.Objects;

public class Course implements Comparable<Course> {
    private String courseName;
    private Integer courseId;
    public  Course(String courseName, Integer courseId) {
        this.courseName = courseName;
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseId=" + courseId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(courseName, course.courseName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(courseName);
    }

    @Override
    public int compareTo(Course o) {
        return this.getCourseName().compareTo(o.getCourseName());
    }
}
