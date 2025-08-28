package com.assignment.day7.assignment1_1.manager;

import com.assignment.day7.assignment1_1.hr.Employee;

public class Manager extends Employee {
    //department info
    public void display() {
        //System.out.println("Employee ID: " + employeeId); // Not Accessible (default)
        System.out.println("Department: " + department); // Accessible (protected)
        // System.out.println("Salary: " + salary); // Not Accessible (private)
    }
}
