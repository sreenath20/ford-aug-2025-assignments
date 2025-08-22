package com.fullstackabi.assignment.Assign9.Ex1Set;

import java.util.Comparator;

public class EmployeeDeptComparator implements Comparator<Employee>
{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getDept().compareTo(o2.getDept());

    }
}
