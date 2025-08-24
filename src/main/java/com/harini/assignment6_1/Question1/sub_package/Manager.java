package com.harini.assignment6_1.Question1.sub_package;

import com.harini.assignment6_1.Question1.Employee;

public class Manager extends Employee {
    public Manager(double salary, String department, String employeeId) {
        super(salary, department, employeeId);
    }

    public static void main(String[] args) {
        Manager manager = new Manager(100000, "HR", "ranga21");
        manager.department = "VSEM";
        manager.getSalary();
    }
}
