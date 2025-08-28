package com.assignment.day7.assignment1_1.payrollservice;

import com.assignment.day7.assignment1_1.hr.Employee;

public class PayrollService {
    public void processPayroll(Employee employee) {
        // Payroll processing logic
        System.out.println("Employee salary: " + employee.getSalary()); // Not Accessible (private/)
    }
}
