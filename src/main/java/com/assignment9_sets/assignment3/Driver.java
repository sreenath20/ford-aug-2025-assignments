
package com.assignment9_sets.assignment3;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Driver {
    public static void main(String[] args) {
        Set<Course> courses = new HashSet();
        courses.add(new Course(1, "Java"));
        courses.add(new Course(2, "Python"));
        courses.add(new Course(3, "C"));
        courses.add(new Course(1, "Java"));
        System.out.println("displaying courses withoput duplicate" + String.valueOf(courses));
        Map<Student, Set<Course>> map = new HashMap();
        map.put(new Student(1001, "aaa"), courses);
        map.put(new Student(1002, "ddd"), courses);
        map.put(new Student(1003, "ccc"), courses);
        System.out.println("student registration detials" + String.valueOf(map));
        System.out.println();
        Student student = new Student(1001, "aaa");
        Set<Course> course1 = new HashSet((Collection)map.get(student));
        course1.add(new Course(4, "Angular"));
        PrintStream var10000 = System.out;
        Object var10001 = map.get(student);
        var10000.println("student registration detials for student ID 1001" + String.valueOf(var10001));
        var10000 = System.out;
        var10001 = map.replace(student, course1);
        var10000.println("adding one course  for student ID 1001 " + String.valueOf(var10001));
        var10000 = System.out;
        var10001 = map.get(student);
        var10000.println("student registration detials for student ID 1001 " + String.valueOf(var10001));
        System.out.println();
        Course Courseremove = new Course(1, "Java");
        course1.remove(Courseremove);
        map.replace(student, course1);
        var10000 = System.out;
        var10001 = map.get(student);
        var10000.println("student registration detials after removing one course for student ID 1001" + String.valueOf(var10001));
        System.out.println();
        System.out.println("displaying all students with their courses " + String.valueOf(map));
        System.out.println();
        Student student1 = new Student(1002, "bbb");
        var10000 = System.out;
        var10001 = map.remove(student1);
        var10000.println(" Remove a student from the system" + String.valueOf(var10001));
        System.out.println("displaying all students with their courses after removing student ID 1001 " + String.valueOf(map));
        System.out.println();
        Set<Course> allcourse = new HashSet();

        for(Map.Entry<Student, Set<Course>> entry : map.entrySet()) {
            Set<Course> coursesSet = (Set)entry.getValue();
            allcourse.addAll(coursesSet);
        }

        System.out.println(" Display all courses before  sorted by courseName. " + String.valueOf(allcourse));
        List<Course> courseList = new ArrayList(allcourse);
        Collections.sort(courseList);
        System.out.println(" Display all courses after sorted by courseName. " + String.valueOf(courseList));
        System.out.println();
        List<Student> studentList1 = new ArrayList(map.keySet());
        System.out.println(" Display all student before  sorted by student name. " + String.valueOf(studentList1));
        Collections.sort(studentList1);
        System.out.println(" Display all student after   sorted by student name. " + String.valueOf(studentList1));
        System.out.println(" Display all courses sorted by courseName. " + String.valueOf(map));
    }
}
