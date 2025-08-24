package com.harini.assignment3.Question4;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Harini", "harini11@gmail.com", 21, 5);
        Person profeesor = new Professor("Lakshmikandan", "lk21@gmail.com", 44, "DSP", "lk21");
        Course course1 = new Course("DSP", "DS010");
        Course course2 = new Course("SAS", "SAS020");
        Course course3 = new Course("EC1", "EC021");
        student.registerCourse(course1);
        student.registerCourse(course2);
        student.registerCourse(course3);
        student.displayCourses();
    }
}
