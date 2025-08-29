package com.assignment.day10.assignment3;

import com.assignment.day10.assignment2.Product;

import java.util.*;

public class Day10Assignment3 {
    public static void main(String[] args) {

        Set<Course> courses = new HashSet<>();
        courses.add(new Course(201, "Mathematics"));
        courses.add(new Course(202, "Physics"));
        courses.add(new Course(203, "Chemistry"));
        courses.add(new Course(204, "Biology"));
        courses.add(new Course(205, "Computer Science"));

        Map<Student, Set<Course>> studentCourseMap = new HashMap<>();

        //add a new course
        Student student1 = new Student(1, "Alice");
        Set<Course> aliceCourses = new HashSet<>();
        aliceCourses.add(new Course(201, "Mathematics"));
        aliceCourses.add(new Course(202, "Physics"));
        studentCourseMap.put(student1, aliceCourses);

        for(Course course : studentCourseMap.get(student1)) {
            System.out.println("Alice is enrolled in: " + course.getCourseName());
        }

        //update course for a student
        Student student2 = new Student(2, "Bob");
        Set<Course> bobCourses = new HashSet<>();
        bobCourses.add(new Course(203, "Chemistry"));
        studentCourseMap.put(student2, bobCourses);
        for(Course course : studentCourseMap.get(student2)) {
            System.out.println("Bob is enrolled in: " + course.getCourseName());
        }

        System.out.println("After adding a new course: Biology");
        bobCourses.add(new Course(204, "Biology")); // Bob adds Biology
        studentCourseMap.put(student2, bobCourses); // update map
        for(Course course : studentCourseMap.get(student2)) {
            System.out.println("Bob is enrolled in: " + course.getCourseName());
        }

        System.out.println("After dropping a course:");
        List<Course> bobCourseList = new ArrayList<>(bobCourses);
        bobCourseList.remove(new Course(204, "Biology")); // Bob drops Biology
        bobCourses = new HashSet<>(bobCourseList);
        studentCourseMap.put(student2, bobCourses); // update map
        for(Course course : studentCourseMap.get(student2)) {
            System.out.println("Bob is enrolled in: " + course.getCourseName());
        }

        //remove a student
        studentCourseMap.remove(student1); // remove Alice
        System.out.println("After removing Alice:");
        for(Student student : studentCourseMap.keySet()) {
            System.out.println("Student ID: " + student.getStudentId() + ", Name: " + student.getStudentName());
        }


        //find all courses for a student
        System.out.println("Courses for Bob:");
        for(Student student : studentCourseMap.keySet()) {
            if(student.getStudentId() == 2) { // Bob's ID
                for(Course course : studentCourseMap.get(student)) {
                    System.out.println(course.getCourseName());
                }
            }
        }

        //Find all students registered for a given course
        System.out.println("Students registered for Chemistry:");
        for(Student student : studentCourseMap.keySet()) {
            for(Course course : studentCourseMap.get(student)) {
                if(course.getCourseId() == 203) { // Chemistry ID
                    System.out.println("Student ID: " + student.getStudentId() + ", Name: " + student.getStudentName());
                }
            }
        }

        //display all courses sorted by Course Name
        List<Course> courseList = new ArrayList<>(courses);
        System.out.println("All courses sorted by Course Name:");
        courseList.sort(new CourseNameComparator());
        for(Course course : courseList) {
            System.out.println(course.getCourseId() + " " + course.getCourseName());
        }

        //display all students sorted by Student Name
        List<Student> studentList = new ArrayList<>(studentCourseMap.keySet());
        System.out.println("All students sorted by Student Name:");
        studentList.sort(new StudentNameComparator());
        for(Student student : studentList) {
            System.out.println(student.getStudentId() + " " + student.getStudentName());
        }

    }
}
