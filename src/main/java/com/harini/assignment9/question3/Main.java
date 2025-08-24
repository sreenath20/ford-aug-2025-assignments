package com.harini.assignment9.question3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Course> courseList1 = new ArrayList<>();
        List<Course> courseList2 = new ArrayList<>();
        List<Course> courseList3 = new ArrayList<>();
        Map<Student, List<Course>> studentCourseMap = new HashMap<>();
        Course course1 = new Course("Maths",21);
        Course course2 = new Course("Physics",2);
        Course course3 = new Course("Chemistry",41);
        courseList1.add(course1);
        courseList1.add(course2);
        courseList1.add(course3);

        Course course4 = new Course("Computer Science",4);
        Course course5 = new Course("Maths",21);
        courseList2.add(course4);
        courseList2.add(course5);
        Course course6 = new Course("Science Fiction",6);
        Course course7 = new Course("Computer Science Fiction",16);
        Course course8 = new Course("Story Telling",11);
        courseList3.add(course6);
        courseList3.add(course7);
        courseList3.add(course8);
        Student student1 = new Student("Harini",22);
        Student student2 = new Student("Meena",13);
        Student student3 = new Student("Bindu",4);
        studentCourseMap.put(student1,courseList1);
        studentCourseMap.put(student2,courseList2);
        studentCourseMap.put(student3,courseList3);
        studentCourseMap.put(new Student("Meena",13),courseList3);
        System.out.println(studentCourseMap);

        //sort
        Collections.sort(courseList1);
        System.out.println(courseList1);
        Collections.sort(courseList2);
        System.out.println(courseList2);
        Collections.sort(courseList3);
        System.out.println(courseList3);
        List<Student> studentList = new ArrayList<>(studentCourseMap.keySet());
        Collections.sort(studentList);
        System.out.println(studentList);


        //remove
        studentCourseMap.remove(student3);
        System.out.println(studentCourseMap);

        //update
        for(Student student : studentCourseMap.keySet()){
            if(student.getName().equals("Meena")){
                studentCourseMap.remove(student);
                break;
            }

        }
        System.out.println(studentCourseMap);

        //search
        System.out.println(studentCourseMap.get(student1));


    }
}
