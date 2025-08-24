package com.harini;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeManagementExercise {
    public static void main(String[] args) {
        Employee employee1= new Employee(21,"Harini","IT",52000.0,2);
        Employee employee2 = new Employee(11,"Meena","IT",80000.0,3);
        Employee employee3 = new Employee(19,"Bindu","VLSI",120000.0,4);
        Employee employee4 = new Employee(32,"Nithya","IT",75000.0,1);
        Employee employee5 = new Employee(32,"Dharani","HR",35000.0,1);
        Employee employee6 = new Employee(32,"Riya","Finance",25000.0,2);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);
        employeeList.stream().filter((e)->e.getDepartment().equals("IT")).forEach((e)->System.out.println(e));
        System.out.println();

        employeeList.stream().filter((e)->e.getSalary()>50000.0).forEach((e)->System.out.println(e));

        Comparator<Employee> compare = (e1, e2)-> e2.getSalary().compareTo(e1.getSalary());
        List<Employee> employeeSortedList = employeeList.stream().sorted(compare).toList();
        System.out.println(employeeSortedList);

        System.out.print("[ ");
        employeeList.stream().forEach((e)-> System.out.print(e.getName()+", "));
        System.out.println("]");
        List<String> employeeNames = employeeList.stream().map((e)->e.getName()).toList();
        System.out.println("Employees names: "+employeeNames);

        System.out.println("The highest paid employee is "+employeeSortedList.stream().findFirst());

        Long countHrEmployees = employeeList.stream().filter((e)->e.getDepartment().equals("HR")).count();
        System.out.println("The total number of HR employees are "+countHrEmployees);

        boolean isGreaterthan10 = employeeList.stream().anyMatch((e)->e.getExperience()>10);
        System.out.println(isGreaterthan10);

        //employeeList.stream().collect(Collectors.groupingBy((e)->e.getDepartment()))






    }
}
