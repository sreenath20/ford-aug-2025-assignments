package com.assignment.day9_collections.assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day9Assignment4 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice", 85.5));
        students.add(new Student(2, "Bob", 92.0));
        students.add(new Student(3, "Charlie", 78.0));
        students.add(new Student(4, "David", 88.5));
        students.add(new Student(5, "Eve", 91.0));

        //delete student with roll no 3
        for(Student s: students){
            if(s.getRollNo() == 3){
                students.remove(s);
                break;
            }
        }

        //update marks of student with roll no 2
        for(Student s: students){
            if(s.getRollNo() == 2){
                s.setMarks(95.0);
                break;
            }
        }

        System.out.println("Before Sorting:");
        for (Student student : students) {
            System.out.println("Roll No: " + student.getRollNo() + ", Name: " + student.getName() + ", Marks: " + student.getMarks());
        }

        //search student with roll no 4
        for(Student s: students){
            if(s.getRollNo() == 4){
                System.out.println("Student found: Roll No: " + s.getRollNo() + ", Name: " + s.getName() + ", Marks: " + s.getMarks());
                break;
            }
        }

        //sorting students based on marks in descending order
        System.out.println("Sorting Students based on marks in descending order:");
        System.out.println("After Sorting:" );
        Collections.sort(students);
        for (Student student : students) {
            System.out.println("Roll No: " + student.getRollNo() + ", Name: " + student.getName() + ", Marks: " + student.getMarks());
        }

        //sorting students based on name in ascending order
        System.out.println("Sorting Students based on name in ascending order:");
        System.out.println("After Sorting:" );
        students.sort(new StudentNameComparator());

        for (Student student : students) {
            System.out.println("Roll No: " + student.getRollNo() + ", Name: " + student.getName() + ", Marks: " + student.getMarks());
        }

        //sorting students based on roll no in ascending order
        System.out.println("Sorting Students based on roll no in ascending order:");
        System.out.println("After Sorting:" );
        students.sort(new StudentRollNoComparator());
        for (Student student : students) {
            System.out.println("Roll No: " + student.getRollNo() + ", Name: " + student.getName() + ", Marks: " + student.getMarks());
        }


    }
}
