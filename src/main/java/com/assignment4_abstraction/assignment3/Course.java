package com.assignment4_abstraction.assignment3;

public abstract class Course {
    private String courseName;
    private int duration;
    public Course() {}
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
    public abstract void  enrollStudent(String studentName);
    public abstract void  startCourse();

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
