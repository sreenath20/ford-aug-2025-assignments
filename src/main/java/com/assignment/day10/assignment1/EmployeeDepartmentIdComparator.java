package com.assignment.day10.assignment1;

import java.util.Comparator;

public class EmployeeDepartmentIdComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee e1, Employee e2) {
        // Custom sorting logic: compare by department first, then by id
        int departmentComparison = e1.department.compareTo(e2.department);
        if (departmentComparison != 0) {
            return departmentComparison;
        }
        return Integer.compare(e1.id, e2.id);
    }
}
