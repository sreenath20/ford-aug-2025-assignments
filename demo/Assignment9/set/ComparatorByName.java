package com.demo.Assignment9.set;

import java.util.Comparator;

public class ComparatorByName implements Comparator<EmployeeDetails> {
    @Override
    public int compare(EmployeeDetails o1, EmployeeDetails o2) {
        return o1.getEmployeeName().compareTo(o2.getEmployeeName());
    }
}
