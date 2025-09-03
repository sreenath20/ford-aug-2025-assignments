package com.assignment.day10_set.assignment1;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        // Custom sorting logic: compare by name
        return e1.name.compareTo(e2.name);
    }

}
