package com.assignments.assignment9;

import java.util.Objects;

public class Course implements Comparable<Course>{

    Integer courseID;
    String courseName;

    public Course(){}
    public Course(Integer courseID){
        this.courseID = courseID;
        this.courseName = null;
    }
    public Course(Integer courseID, String courseName){
        this.courseID = courseID;
        this.courseName = courseName;
    }

    @Override
    public int compareTo(Course o) {
        return this.courseID.compareTo(o.courseID);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(courseID, course.courseID);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(courseID);
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseID=" + courseID +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
