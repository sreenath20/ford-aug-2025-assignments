package com.assignment8_collections.assignment4;

import java.util.Comparator;

public class rollNoComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.getRollNo().compareTo(s2.getRollNo());
    }
}
