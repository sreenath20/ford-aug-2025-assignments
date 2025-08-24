package com.harini.assignment6_1.Question1;

public class Employee {
    private double salary;
    protected String department;
    String employeeId;
    public Employee(double salary, String department, String employeeId) {
        this.salary = salary;
        this.department = department;
        this.employeeId = employeeId;
    }
    public void getSalary() {
        System.out.println(this.salary);
    }

}
