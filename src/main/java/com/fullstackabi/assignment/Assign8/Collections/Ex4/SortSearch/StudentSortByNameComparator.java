package com.fullstackabi.assignment.Assign8.Collections.Ex4.SortSearch;

import java.util.Comparator;

public class StudentSortByNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
