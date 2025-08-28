package com.assignment.day10.assignment1;

import java.util.HashSet;
import java.util.Set;

public class Day10Assignmemnt1 {

    public static void main(String[] args) {

        Set<Employee> employees = new HashSet<>();
        employees.add(new Employee(1, "John Doe", "EEE"));
        employees.add(new Employee(2, "Jane Doe", "EEE"));
        employees.add(new Employee(3, "Alice Smith", "CSE"));
        employees.add(new Employee(4, "Bob Brown", "CSE"));
        employees.add(new Employee(5, "Charlie White", "MECH"));
        
        // Attempt to add a duplicate employee
        employees.add(new Employee(1, "John Doe", "EEE"));
        // Display the set of employees
        for (Employee employee : employees) {
            System.out.println("Employee id: " + employee.id + ", Name: " + employee.name + ", Department: " + employee.department);
        }
        
        // remove an employee
        employees.remove(new Employee(2, "Jane Doe", "EEE"));
        System.out.println("After removing an employee:");
        for (Employee employee : employees) {
            System.out.println("Employee id: " + employee.id + ", Name: " + employee.name + ", Department: " + employee.department);
        }

        // Update employees department
        for (Employee employee : employees) {
            if (employee.id == 3) {
                employee.department="AI";
            }
        }

        // Display the updated set of employees
        System.out.println("After updating an employee's department:");
        for (Employee employee : employees) {
            System.out.println("Employee id: " + employee.id + ", Name: " + employee.name + ", Department: " + employee.department);
        }

        //search employee by id
        int searchId = 3;
        boolean found = false;
        for (Employee employee : employees) {
            if (employee.id == searchId) {
                System.out.println("Employee id: " + employee.id + ", Name: " + employee.name + ", Department: " + employee.department);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Employee with id " + searchId + " not found.");
        }

        //find all employees in a specific department
        String searchDepartment = "CSE";
        System.out.println("Employees in department " + searchDepartment + ":");
        boolean departmentFound = false;
        for (Employee employee : employees) {
            if (employee.department.equals(searchDepartment)) {
                System.out.println("Employee id: " + employee.id + ", Name: " + employee.name + ", Department: " + employee.department);
                departmentFound = true;
            }
        }
        if (!departmentFound) {
            System.out.println("No employees found in department " + searchDepartment + ".");
        }
        
    }

}
