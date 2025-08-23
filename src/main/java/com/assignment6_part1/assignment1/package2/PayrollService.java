package com.assignment6_part1.assignment1.package2;

import com.assignment6_part1.assignment1.package1.Employee;


public class PayrollService {
    public PayrollService(double salary, String employeeID, String name, String department) {
        Employee employee = new Employee(salary, employeeID, name, department);
        System.out.println("outside  the package only  public data member");
        //System.out.println("Employee ID: " + employee.EmployeeID);
        //System.out.println("Department: " + employee.Department);
        System.out.println("Name: " + employee.name);
        //System.out.println("Salary: " + employee.salary);
    }

}
