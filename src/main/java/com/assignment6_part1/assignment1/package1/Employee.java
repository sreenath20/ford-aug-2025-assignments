package com.assignment6_part1.assignment1.package1;

public class Employee {
    private double salary;
     String EmployeeID;
     public String name;
     protected String Department;

    public Employee(double salary, String employeeID,String name, String department) {
        this.salary = salary;
        this.EmployeeID = employeeID;
        this.name = name;
        this.Department = department;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }



}
