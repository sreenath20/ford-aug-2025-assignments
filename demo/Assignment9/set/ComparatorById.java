package com.demo.Assignment9.set;

import java.util.Comparator;

public class ComparatorById implements Comparator<EmployeeDetails> {



    @Override
    public int compare(EmployeeDetails o1, EmployeeDetails o2) {
        return o1.getEmployeeId().compareTo(o2.getEmployeeId());
    }
}
