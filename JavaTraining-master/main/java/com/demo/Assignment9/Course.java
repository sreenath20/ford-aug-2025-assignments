package com.demo.Assignment9;

import java.util.HashSet;
import java.util.Set;

public class Course {
    private String courseName;
    private String courseCode;

    public Course() {
    }

    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseCode='" + courseCode + '\'' +
                '}';
    }

    public static class Hashset {
       public static void main(String[] args) {
           Set<Course> setCourse= new HashSet<>();
           setCourse.add(new Course("Ak","111"));
           setCourse.add(new Course("Bk","222"));
           setCourse.add(new Course("Ck","333"));
           setCourse.add(new Course("Ark","444"));

       }
    }
}
