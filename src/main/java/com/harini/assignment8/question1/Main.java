package com.harini.assignment8.question1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee employee1 = new Employee("Harini",33,50000.0);
        Employee employee2 = new Employee("Meena",22,60000.0);
        Employee employee3 = new Employee("Bindu",11,70000.0);
        Employee employee4 = new Employee("Dharani",44,55000.0);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        System.out.println(employeeList);
        Employee updateEmployee = new Employee("Rathna",91,80000.0);
        employeeList.set(3,updateEmployee);
        System.out.println(employeeList);
        employeeList.remove(updateEmployee);
        System.out.println(employeeList);
        Employee searchEmployee = new Employee("Harin",33,50000.0);
        System.out.println(employeeList.indexOf(searchEmployee));
        System.out.println(employeeList);

    }
}
