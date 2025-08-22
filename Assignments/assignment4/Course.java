package com.assignments.assignment4;

public abstract class Course {

    String courseName;
    Float duration;

    Course (String courseName, Float duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public abstract void enrollStudent(String studentName);
    public abstract void startCourse();

}
