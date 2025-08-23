package com.assignment8_collections.assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Student> students = new ArrayList();
        students.add(new Student(4, "aaa", (double)87.5F));
        students.add(new Student(2, "ddd", (double)90.0F));
        students.add(new Student(3, "ccc", (double)85.5F));
        System.out.println("student list " + String.valueOf(students));
        Collections.sort(students);
        System.out.println("sorted student list by marks (ascending) " + String.valueOf(students));
        Collections.sort(students, Collections.reverseOrder());
        System.out.println("sorted student list by marks (descending) " + String.valueOf(students));
        System.out.println();
        System.out.println(" student list before sorting by name" + String.valueOf(students));
        Collections.sort(students, new NameComparator());
        System.out.println("student list after  by nameSorting by name" + String.valueOf(students));
        System.out.println();
        System.out.println("sorted student list by roll no " + String.valueOf(students));
        Collections.sort(students, new rollNoComparator());
        System.out.println(students);
        System.out.println();
        System.out.println("enter the roll number to delete: ");
        Integer rollnodelete = input.nextInt();

        for(Student s : students) {
            if (s.getRollNo().equals(rollnodelete)) {
                students.remove(s);
                System.out.println("student with roll no " + rollnodelete + " deleted successfully");
                break;
            }
        }

        System.out.println("student list after deleting   is: " + String.valueOf(students));
        System.out.println();
        System.out.println("enter the roll number to update: ");
        Integer rollnoupdate = input.nextInt();

        for(Student s : students) {
            if (s.getRollNo().equals(rollnoupdate)) {
                System.out.println("enter the new mark: ");
                Double newmark = input.nextDouble();
                s.setMarks(newmark);
                System.out.println("student with roll no " + rollnodelete + " update successfully");
                break;
            }
        }

        System.out.println("student list after updating marks is: " + String.valueOf(students));
        System.out.println();
        System.out.println("enter the roll number to find: ");
        Integer rollno = input.nextInt();
        boolean found = false;

        for(Student s : students) {
            if (s.getRollNo().equals(rollno)) {
                System.out.println("student with roll no " + rollno + " found: " + String.valueOf(s));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("student with roll no " + rollno + " not found");
        }

    }
}