package com.fullstackabi.assignment.Assign8.Collections.Ex4.SortSearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentResultDriver {

    public static void main(String[] args) {

        // Create Collections for student
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student(110, "Riya", 450.00));
        studentsList.add(new Student(111, "Oliver", 470.00));
        studentsList.add(new Student(102, "John", 500.00));
        studentsList.add(new Student(113, "Flavia", 450.00));

        //Implement Comparable to sort students by marks (descending order)
        Collections.sort(studentsList);
        System.out.println(studentsList);

        // Sort by Name
        Collections.sort(studentsList, new StudentSortByNameComparator());
        System.out.println("Sort by Name " + studentsList);

        // Sort by Roll No
        Collections.sort(studentsList, new StudentSortByRollNoComparator());
        System.out.println("Sort by RollNo " + studentsList);


        // Implement CRUD operations in main:
        //Add new students

        studentsList.add(new Student(114, "Riya", 450.00));
        studentsList.add(new Student(115, "Oliver", 470.00));
        studentsList.add(new Student(105, "John", 500.00));
        studentsList.add(new Student(116, "Flavia", 450.00));
        System.out.println("Newly Added students" + studentsList);

        //o Delete a student by roll number\
        studentsList.remove(new Student(114, "Riya", 450.00));
        System.out.println("After Riya removal Roll no 114:" + studentsList);

        //o Update marks by roll number
        Student studentUpdate = new Student(116, "Flavia", 350.00);
        studentsList.set(0, studentUpdate);
        System.out.println("After Riya Update Mark:" + studentsList);

        //o Search for a student by roll number (using equals)

        Student studentSearch = new Student(105, "Flavia", 350.00);
        for (Student student : studentsList) {
            if (student.equals(studentSearch)) { //searching with object.
                // if(student.rollNumber == studentSearch.rollNumber) {
                System.out.println("Student information" + student);
                break;
            }
        }

        //sort by marks greater 450
        List<Student> studentSortedList =
                studentsList.stream()
                        .filter(student -> student.getMarks() > 450)
                .sorted().toList();

        System.out.println("Students sorted list with marks greater than 450 :" +studentSortedList);


    }
}

