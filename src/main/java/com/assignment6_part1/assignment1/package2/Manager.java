package com.assignment6_part1.assignment1.package2;

import com.assignment6_part1.assignment1.package1.Employee;

public class Manager extends Employee {
    public Manager(double salary, String employeeID, String name, String department) {
        super(salary, employeeID, name, department);


    }
    public static void main(String[] args) {


        Manager manager = new Manager(60000, "M456", "bbb", "HR");
        System.out.println("outside the package within the child class you can acess protected and public dat member");
       //System.out.println("Employee ID: " + manager.EmployeeID);
        System.out.println("Name: " + manager.name);
        System.out.println("Department: " + manager.Department);
       //System.out.println("Salary: " + manager.salary);
    }
}
