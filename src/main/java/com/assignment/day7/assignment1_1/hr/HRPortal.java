package com.assignment.day7.assignment1_1.hr;

public class HRPortal {

    public void accessEmployeeInfo(Employee employee) {
        // System.out.println("Employee ID: " + employee.employeeId); // Not Accessible (default)
        System.out.println("Department: " + employee.department); // Accessible (protected)
        // System.out.println("Salary: " + employee.salary); // Not Accessible (private)
    }

}
