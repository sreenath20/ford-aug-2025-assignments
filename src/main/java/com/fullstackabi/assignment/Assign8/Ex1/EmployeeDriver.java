package com.fullstackabi.assignment.Assign8.Ex1;

import java.util.ArrayList;

public class EmployeeDriver {
    public static void main(String[] args) {
        // CRUD operations
        //Create
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(100, "A", "IT", 200.00));
        employees.add(new Employee(101, "B", "ADMIN", 300.00));
        employees.add(new Employee(102, "C", "HR", 400.00));
        employees.add(new Employee(103, "D", "IT", 500.00));
        System.out.println("Employee List:" + employees);

        // Update
        Employee empUpdate1 = new Employee(101, "B", "IT", 300.00);
        // set displays the previous value.
        for (Employee emp : employees) {
            if (employees.indexOf(emp) == 1) {
                employees.set(1, empUpdate1);
                System.out.println("Employee1 Change in Dept : " + employees.get(1));
                break;
            }
        }

        // Delete
        for(Employee emp : employees) {
            if (employees.indexOf(emp) == 0) {
                employees.remove(0);
                System.out.println("Employe at index 0 removed :" +employees);
                break;
            }
        }

        // search using id
        System.out.println("Employee Search using ID");
        Employee empIdSearch = new Employee(101, "B", "IT", 300.00);
        System.out.println("EMployee in Dept IT :" + employees.contains(empUpdate1));
        System.out.println("Employee with ID : " + employees.indexOf(empIdSearch));

        // Read
//        System.out.println("Employee1 : " +employees.get(0));
//        System.out.println("Employee2 : " +employees.get(1));
//        System.out.println("Employee3 : " +employees.get(2));
//        System.out.println("Employee4 : " +employees.get(3));
        System.out.println("Reading the content of Employee List:" +employees);
    }
}
