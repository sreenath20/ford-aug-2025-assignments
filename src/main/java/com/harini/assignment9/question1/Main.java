package com.harini.assignment9.question1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Employee> employeeSet = new HashSet<Employee>();
        Employee employee1 = new Employee("Harini",18,"IT");
        Employee employee2 = new Employee("Meena",29,"Finance");
        Employee employee3 = new Employee("Bindu",01,"Vlsi");
        Employee employee4 = new Employee("Nithya",8,"Marketing");
        Employee employee5 = new Employee("Dharani",10,"HR");
        employeeSet.add(employee1);
        employeeSet.add(employee2);
        employeeSet.add(employee3);
        employeeSet.add(employee4);
        employeeSet.add(employee5);
        System.out.println("Printing the employee set "+employeeSet);
        employeeSet.removeIf(employee -> employee.getId().equals(10));
        System.out.println("Printing the employee set after removing "+employeeSet);
        for(Employee employee:employeeSet){
            if(employee.getId().equals(29)){
                employee.setDepartment("Data Analyst");
            }
        }
        System.out.println("Printing the employee set after updating "+employeeSet);
        List<Employee> employeeList = new ArrayList<Employee>(employeeSet);
        Collections.sort(employeeList);
        System.out.println("After sorting based on id "+employeeSet);
        employeeList.sort(new DeptComparator());
        System.out.println("After sorting based on dept "+employeeList);
        employeeList.sort(new NameCOmparator());
        System.out.println("After sorting based on name "+employeeList);
        for(Employee employee:employeeList){
            if(employee.getId().equals(10)){
                System.out.println("Employee id 10 is found "+employee);
                break;
            }
        }
        for(Employee employee:employeeList){
            if(employee.getDepartment().equals("Vlsi")){
                System.out.println("Employee in Vlsi dept is found "+employee);
                break;
            }
        }

    }
}
