package com.assignment9_sets.assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Driver {
    public static void main(String[] args) {
        Set<Employee> employeeset = new HashSet();
        employeeset.add(new Employee(4, "aaa", "HR"));
        employeeset.add(new Employee(2, "bbb", "Finance"));
        employeeset.add(new Employee(3, "ddd", "IT"));
        System.out.println("employee set: " + String.valueOf(employeeset));
        System.out.println();
        System.out.println("Removing employee with id 2");

        for(Employee e : employeeset) {
            if (e.getId() == 2) {
                employeeset.remove(e);
                break;
            }
        }

        System.out.println("employee set after removal: " + String.valueOf(employeeset));
        System.out.println();
        System.out.println("Adding employee's department b employee id 3");

        for(Employee e : employeeset) {
            if (e.getId() == 3) {
                e.setDepartment("marketing");
                break;
            }
        }

        System.out.println("employee set after adding department: " + String.valueOf(employeeset));
        System.out.println();
        System.out.println("Find emplpoyee by id  3");

        for(Employee e : employeeset) {
            if (e.getId() == 3) {
                System.out.println("Found employee: " + String.valueOf(e));
                break;
            }
        }

        System.out.println();
        System.out.println("Find employee by department 'marketing'");

        for(Employee e : employeeset) {
            if (e.getDepartment().equals("marketing")) {
                System.out.println("Found employee: " + String.valueOf(e));
                break;
            }
        }

        System.out.println();
        System.out.println(" Display employees sorted by name (Comparator)");
        List<Employee> employeeList = new ArrayList(employeeset);
        Collections.sort(employeeList, new NameComparator());
        System.out.println("Employee sorted by name: " + String.valueOf(employeeList));
        System.out.println();
        System.out.println(" Display employees sorted by department and then by ID.");
        Set<Employee> sortedSet = new TreeSet(employeeset);
        System.out.println("Sorted Employee Set: " + String.valueOf(sortedSet));
    }
}
