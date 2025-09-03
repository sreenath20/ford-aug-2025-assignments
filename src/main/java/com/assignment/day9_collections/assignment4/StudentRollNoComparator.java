package com.assignment.day9_collections.assignment4;

public class StudentRollNoComparator implements java.util.Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getRollNo(), s2.getRollNo());
    }
}
