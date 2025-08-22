package com.fullstackabi.assignment.Assign9.Ex1Set;

import java.util.*;

public class EmpDirectoryDrive {
    public static void main(String[] args) {

        Set<Employee> employees = new HashSet<>();
        // CRUD operations
        // Add new employee
        employees.add(new Employee(111, "Oliver", "MFG"));
        employees.add(new Employee(001, "Zara", "IT"));
        employees.add(new Employee(002, "Ram", "ADMIN"));
        employees.add(new Employee(003, "Priya", "ADMIN"));
        // duplicate insertion - which will not be listed in the o/p
        employees.add(new Employee(001, "Zara", "IT"));

        System.out.println(" Employees Directory: ");
        System.out.println(employees);
        // Remove an employee
        employees.remove(new Employee(111, "EmpZ", "MFG"));
        System.out.println("Removed emp Z from Directory: ");
        System.out.println(employees);

        // Update emp dept of empC to IT
        for (Employee e : employees) {
            if (e.getId() == 3) {
                System.out.println("Inside cond");
                e.setDept("MFG");
                break;
            }
        }
        System.out.println("Employee after updating dept to IT for Empc");
        System.out.println(employees);

        // View all employees
        System.out.println("Employees List");
        for (Employee e : employees) {
            System.out.println("Employee ID: " + e.getId());
            System.out.println("Employee Name: " + e.getName());
            System.out.println("Employee Dept: " + e.getDept());
        }

        // Searching - Find all employees in a dept
        if(employees.contains(new Employee(111, "EmpZ", "MFG"))){
            System.out.println("Emp is found");
        }else{
            System.out.println("Emp is not found");
        }

        // Searching - Find all employees in a dept
        for(Employee e: employees){
            if(e.getDept().equals("IT")){
                System.out.println("Employee in IT Dept :" + e);
            }
        }
        // sorting on name using comparator ; set cannot be sorted. use list to sort it
        List<Employee> employeeList = new ArrayList<>(employees);
        employeeList.sort(new EmployeeNameComparator());
        System.out.println("Employees List sorted by Name");
        System.out.println(employeeList);


        // sorting on Dept using comparator ; set cannot be sorted. use list to sort it
        List<Employee> employeeListByDept = new ArrayList<>(employees);
        employeeListByDept.sort(new EmployeeDeptComparator());
        System.out.println("Employees List sorted by Dept");
        System.out.println(employeeListByDept);

        // Sort based on Id using comparable
        List<Employee> employeeListById = new ArrayList<>(employees);
        Collections.sort(employeeListById);
        System.out.println("Employees List sorted by ID");
        System.out.println(employeeListById);

    }
}
