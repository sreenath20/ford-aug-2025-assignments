package com.demo.Assignment9;

import java.util.HashSet;
import java.util.Set;

public class Course {
    private String courseName;
    private Integer courseId;

    public Course() {
    }

    public Course(String courseName, Integer courseId) {
        this.courseName = courseName;
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getCourseCode() {
        return courseId;
    }

    public void setCourseCode(String courseCode) {
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseCode='" + courseId + '\'' +
                '}';
    }
    Course c1= new Course("math",101);
    Course c2= new Course("Englis",102);
    Course c3= new Course("Science",103);

}
